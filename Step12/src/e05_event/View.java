package e05_event;

public class View {
	protected String name;
	private OnClickListener clickListener;
	
	public View(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setClickListener(OnClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void onClick() {
		if(clickListener != null)
			clickListener.onClick(this);
	}
	
	public static interface OnClickListener{
		public void onClick(View view);
	}
	
}





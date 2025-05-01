package e05_event;

public class ButtonRegisterOnClickListener 
						implements View.OnClickListener{

	@Override
	public void onClick(View view) {
		System.out.println(view.getName() + " 버튼 클릭");
		System.out.println("회원 가입 처리를 진행합니다.");
	}

}

package e01_object;

//필드 초기화 생성자, set/get, toString, clone
public class Circle implements Cloneable {
	private Point pos;
	private int r;

	public Circle(Point pos, int r) {
		super();
		this.pos = pos;
		this.r = r;
	}

	public Point getPos() {
		return pos;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [pos=" + pos + ", r=" + r + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

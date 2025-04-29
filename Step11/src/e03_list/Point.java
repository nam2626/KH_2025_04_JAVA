package e03_list;

import java.util.Objects;

public class Point implements Comparable<Point> {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Point - hashCode");
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Point - equals");
		if (this == obj)
			return true;
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	//TreeSet일 경우 compareTo로 비교
	//자신이 작은 경우 음수, 같으면 0, 비교대상 값이 크면 양수
	@Override
	public int compareTo(Point o) {
		System.out.println("compareTo");
		if(this.x != o.x)
			return this.x - o.x;
		if(this.y != o.y)
			return this.y - o.y;
		return 0;//두 객체가 값이 같을때
	}
	
	
	
}







package java07_inherit.review.model;

public class Point {
	protected int x;
	protected int y;
	
	//매개변수 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//디폴트 생성자
	public Point() {
		
	}
	
	//메소드
	public void draw() {
		System.out.println("(" + x + ", " + y + ")");
	}

	//getter, setter
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
	
	

}

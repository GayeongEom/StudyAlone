package java07_inherit.practice.model;

public class Point {
	
	//멤버 필드
	protected int x;
	protected int y;
	
	
	//디폴트 생성자
	public Point() {
		
	}

	
	//매개변수 있는 생성자
	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}

	
	//멤버 메소드
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

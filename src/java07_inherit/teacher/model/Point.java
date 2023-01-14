package java07_inherit.teacher.model;

public class Point {

	//--- Field ---
	protected int x;
	protected int y;
	
	//--- Constructor ---
	public Point() {
//		this.x = 0;
//		this.y = 0;
	}
	
	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
		
		setX(x);
		setY(y);
	}

	//--- Method ---
	public void draw() {	//x, y 좌표값 출력 ex) (3, 4)
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

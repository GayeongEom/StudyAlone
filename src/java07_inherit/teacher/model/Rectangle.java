package java07_inherit.teacher.model;

public class Rectangle extends Point {

	//--- Field ---
	//부모의 x, y는 사각형 좌측상단의 좌표값으로 처리
	private int width; //가로너비
	private int height; //세로높이

	//--- Constructor ---
	public Rectangle() { }

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	//--- Method ---
	@Override
	public void draw() {
		//좌표
		System.out.print("좌표 : ");
		super.draw();
		
		//면적 (가로 * 세로)
		System.out.printf("면적 : %.1f\n", width*(double)height);
		
		//둘레 (2 * (가로 + 세로))
		System.out.printf("둘레 : %.1f\n", 2*(width+(double)height));
	}
	
//	getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}

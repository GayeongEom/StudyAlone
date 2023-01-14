package java07_inherit.review.model;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	//매개변수 있는 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	//디폴트 생성자
	public Rectangle() {
		
	}

	//메소드
	@Override
	public void draw() { //사각형의 x, y좌표, 면적, 둘레 계산 출력 처리
		System.out.print("꼭짓점의 좌표 : ");
		super.draw(); //사각형의 x, y 좌표
		
		//사각형의 면적
		System.out.printf("사각형의 면적은 %.1f\n", width * (double)height);
		//사각형의 둘레
		System.out.printf("사각형의 둘레는 %.1f\n", 2 * (width + (double)height));
		System.out.println();
	}
	
	
	//getter, setter
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

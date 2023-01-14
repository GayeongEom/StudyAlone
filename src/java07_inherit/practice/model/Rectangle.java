package java07_inherit.practice.model;

public class Rectangle extends Point {

	//멤버필드
	private int width;
	private int height;
	//부모의 x, y는 사각형 좌측상단의 좌표값으로 처리

	//생성자
	public Rectangle() {

	}

	//매개변수 있는 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	//메소드
	public void draw() {

		//면적
		double areaRec = width * height;
		//둘레
		double cirRec = 2 * (width + height);

//		//좌표 출력
//		System.out.println("사각형의 좌표 : " + x + "." + y); //부모의 메소드 활용하기
		//부모의 메소드를 호출하여 좌표 출력하기
		System.out.print("좌표 : ");
		super.draw();
		
		//넓이 출력
		System.out.printf("%s %.1f","사각형의 넓이", areaRec);
		System.out.println();

		//둘레 출력
		System.out.printf("%s %.1f","사각형의 둘레", cirRec);
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

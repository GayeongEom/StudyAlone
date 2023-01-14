package java07_inherit.teacher.model;

public class Circle extends Point {

	//--- Field ---
	private int radius;

	//--- Constructor ---
	public Circle() { }
	
	public Circle(int x, int y, int radius) {
		//x, y는 부모생성자로 넘김
		//center point(중심점)로 취급
		
		super(x, y);
//		this.radius = radius;
		setRadius(radius);
	}

	//--- Method ---
	@Override
	public void draw() {//원의 x, y좌표, 면적과 둘레 계산 출력함
//		java.lang.Math.PI 사용함
		
//		* 원면적 = PI * radius * radius;
//		* 원둘레 = 2 * PI * radius;
//		* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
		
		//중심점
		System.out.print("중심점 : ");
		super.draw();
		
		//원의 면적
		System.out.print("원의 면적 : ");
		System.out.printf("%.1f", Math.PI * radius * radius);
		System.out.println();
		
		//원의 둘레
		System.out.print("원의 둘레 : ");
		System.out.printf("%.1f", 2 * Math.PI * radius);
		System.out.println();
	}
	
	//Getter, Setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

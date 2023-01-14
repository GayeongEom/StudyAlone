package java07_inherit.review.model;

public class Circle extends Point {
	
	private int radius;

	//매개변수 있는 생성자
	public Circle(int x, int y, int radius) {
		super(x, y); //부모 생성자 호출
		
		//둘이 같은 코드
//		this.radius = radius;
		setRadius(radius);
	}
	
	//디폴트 생성자
	public Circle() {
		
	}
	
	//메소드
	@Override
	public void draw() { //원의 x, y좌표, 면적과 둘레 계산 출력함
		System.out.print("중심점의 좌표 : ");
		super.draw(); //x, y좌표 출력
		
		//원 면적
		System.out.printf("원의 면적은 %.1f\n", Math.PI * radius * radius);
		//원 둘레
		System.out.printf("원의 둘레는 %.1f\n", Math.PI * radius * 2);
		System.out.println();
	}

	
	//getter, setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	
	

}

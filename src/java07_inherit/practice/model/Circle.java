package java07_inherit.practice.model;

public class Circle extends Point {
	
	//멤버 필드
	private int radius;
	
	//디폴트 생성자
	public Circle() {
		
	}

	
	//x, y 좌표를 받는 매개변수 있는 생성자
	public Circle(int x,int y, int radius) {
		//center point(중심점)로 취급
		//x, y는 부모생성자로 넘김 -> 부모의 생성자로 가져와라

		super(x,y); //매개변수 있는 부모생성자 호출
		//아래 두개 같은 코드
//		this.radius = radius;
		setRadius(radius);
	}

	
	//메소드 //오버라이딩
	public void draw() {
		//원면적
		double area = Math.PI * radius * radius; //PI값
		//원둘레
		double cir = 2 * Math.PI * radius;
		
//		//좌표 출력
//		System.out.println("원의 중심점 : " + x + ", " + y); //부모의 메소드 활용하기
		//부모의 메소드를 호출하여 좌표 출력하기
		System.out.print("원의 중심점 : ");
		super.draw();
		
		//원 면적 출력
		System.out.printf("%s %.1f","원의 면적 :",area);
		System.out.println();
		
		//원 둘레 출력
		System.out.printf("%s %.1f","원의 둘레 :", cir);
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

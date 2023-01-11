package test.firstTest;

public class Circle {
	public static final double PI = 3.24;
	public double radius; //private으로 
	
	public Circle(double radius) { //생성자
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static double getpi() {
		return PI;
	}
	
	public void draw() {
		System.out.println("반지름" + radius + "cm인 원을 그립니다");
	}
	

}

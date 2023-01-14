package java07_inherit.review2.product;

public class Computer extends Product {
	
	//매개변수 있는 생성자
	public Computer(String model, int price) {
		super(model, price);
	}

	//디폴트 생성자
	public Computer() {
		
	}
	
	//메소드 오버라이딩
	@Override
	public void out() {
		super.out();
		System.out.println("Computer");
		
		//입력된 매개변수가 잘 출력되는지 확인할 코드 추가
		System.out.println("  >>" + model + ", " + price);
	
	}
	
}

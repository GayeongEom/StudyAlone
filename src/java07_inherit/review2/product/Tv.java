package java07_inherit.review2.product;

public class Tv extends Product {

	//매개변수 있는 생성자
	public Tv(String model, int price) {
		super(model, price);
		
	}
	
	//디폴트 생성자
	public Tv() {
		
	}
	
	//메소드 오버라이딩
	@Override
	public void out() {
		super.out();
		System.out.println("TV");
		
		//입력된 매개변수가 출력되는지 확인할 코드
		System.out.println("  >>" + model + ", " + price);
	}
	
}

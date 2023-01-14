package java07_inherit.practice2.product;

public class Tv extends Product {

	//디폴트 생성자
	public Tv() {
		
	}
	
	//매개변수 있는 생성자
	public Tv(String model, int price) {
		super(model, price);
		
	}
	
	//메소드
	@Override
	public void out() {
		System.out.println(" + Tv +");
		System.out.println("  >>" + model + ", " + price);
		System.out.println();
	}
	
	
}

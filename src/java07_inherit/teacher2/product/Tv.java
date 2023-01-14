package java07_inherit.teacher2.product;

public class Tv extends Product {
	
	public Tv(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println(" + TV + ");
		System.out.println("  >> " +  model + ", " + price);
	}

}

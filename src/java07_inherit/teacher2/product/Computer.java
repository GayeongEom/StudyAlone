package java07_inherit.teacher2.product;

public class Computer extends Product {

	public Computer(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println(" + Computer + ");
		System.out.println("  >> " +  model + ", " + price);
	}

}


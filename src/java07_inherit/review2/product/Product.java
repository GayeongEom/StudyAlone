package java07_inherit.review2.product;

public class Product {
	
	//멤버필드
	protected String model;
	protected int price;
	
	//매개변수 있는 생성자
	public Product(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	//디폴트 생성자
	public Product() {
		
	}
	
	//메소드
	public void out() {
		
	}

	//getter, setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

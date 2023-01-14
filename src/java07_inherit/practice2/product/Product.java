package java07_inherit.practice2.product;

public abstract class Product {
	
	
	protected String model;
	protected int price;
	
	//디폴트 생성자
	public Product() {
		
	}
	
	//매개변수 있는 생성자
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	//	-> abstract는 인스턴스를 만들 수 없기때문에(new Product 불가) 생성자도 호출할 수 없음. 
	

	//메소드
	public abstract void out(); //메소드를 abstract로 만들려면 클래스도 abstract로 만들어야 함


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

package java06_class.diagram;

public class Car {
	
	private String model;
	private String color;
	
	//매개변수 생성자가 있는 경우라도 디폴트 생성자도 만들어야 함
	//매개변수 있는 생성자
	public Car(String model, String color) {
		this.setModel(model);
		this.setColor(color);
		
	}

	//디폴트 생성자
	public Car() {
		
		
	}
	
//	//모든 필드를 활용하여 매개변수 있는 생성자로 구현하기 / alt + shift + s
//	public Car(String model, String color) {
//		super();
//		this.model = model;
//		this.color = color;
//	}

	//메소드
	public  void display() {
		System.out.println(model + " " + color);
		
	}

	//setter, getter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

package java06_class.diagram;

public class Car_t {

	private String model; //모델명
	private String color; //색상

	
	public Car_t() { }
	
	//모든 필드를 매개변수 있는 생성자로 자동 구현하기
	// alt + shift + s, o
	// ( alt + s, a )
	public Car_t(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public void display() {
		System.out.println(model + ", " + color);
	}

	//alt + shift + s , r

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



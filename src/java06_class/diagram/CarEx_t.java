package java06_class.diagram;

public class CarEx_t {
	public static void main(String[] args) {
		
		Car car1 = new Car("K5", "Black");
		
		car1.display();
		
		System.out.println("----------");
		
		car1.setModel("모닝");
		car1.setColor("White");
		
		car1.display();
		System.out.println("----------");
		
		System.out.println("모델명: " + car1.getModel());
		System.out.println("색상: " + car1.getColor());
	
		
	}
}



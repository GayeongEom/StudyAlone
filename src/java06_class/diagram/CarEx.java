package java06_class.diagram;

public class CarEx {
	public static void main(String[] args) {
		
		Car c = new Car("k5", "white");
		
		c.display();
		
		System.out.println("------------");
		
		//setter로 값 변경하기
		c.setColor("Gold");
		c.setModel("마티즈");
		
		//메소드로 출력하기
		c.display();
		
		//getter로 출력하기
		System.out.println(c.getModel() + " " + c.getColor());
		
	}

}

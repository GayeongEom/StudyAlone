package java07_inherit.practice2.product;

public class Computer extends Product {
	
	//디폴트 생성자
	public Computer() {
		
	}
	
	//매개변수 있는 생성자
	public Computer(String model, int price) {
		super(model, price);
		
	} //매개변수 있는 생성자를 작성하는데 왜 부모의 디폴트생성자가 필요?

	//메소드
	@Override
	public void out() {
		System.out.println(" + Computer + ");
		System.out.println("  >>" + model + ", " + price);
		System.out.println();
	}
	
	//오버라이딩 된 메소드를 지워도 상속받은 out() 메소드가 숨겨져 있어
	//The type Computer must implement the inherited abstract method Product.out()
	//상속받은 추상화 메소드를 반드시 구현하라 는 에러가 뜸
	//메소드를 오버라이딩하지 않고 사용하지 않고 그대로 두고 싶다면 추상화된 메소드를 사용한다는 것이므로
	//이 클래스 또한 abstract 클래스로 만들어야함
	
	
	

}

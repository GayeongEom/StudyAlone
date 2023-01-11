package java06_class.constructor;

//기능 클래스
class Constructor_01 {
	
	//멤버필드
	private int num1 = 11; //초기값11
	private int num2 = 22; //초기값22
	
	
	//디폴트 생성자 -> 매개변수가 없는 생성자
	public Constructor_01() {
		System.out.println("디폴트 생성자");
		
		System.out.println();
		System.out.println("----생성자 코드 실행 전---");
		display();
		
		//멤버필드 초기화
		num1 = 888;
		num2 = 999;
		
		System.out.println();
		System.out.println("--- 생성자 코드 실행 후 ---");
		display();
		
	}
	
	
	//생성자 오버로딩
	public Constructor_01(int num1, int num2) {
		System.out.println("매개변수 있는 생성자");
		
		//매개변수로 멤버필드 모두 초기화
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	//멤버필드의 값을 확인(출력)하는 메소드
	public void display() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

}


public class ConstructorEx {
	public static void main(String[] args) {
		
		Constructor_01 cons1 = new Constructor_01();
		
		cons1.display();
		
		System.out.println("------------------");
		
		Constructor_01 cons2 = new Constructor_01(555, 666);
		
		cons2.display();
		
	}
}

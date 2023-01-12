package java07_inherit;

class Parent3 {
	//	private int num = 111;
	protected int num = 111; //같은 패키지의 상속받은 객체까지 접근 가능

	public Parent3() { //생성자 - new 해서 메소드 호출할 때 실행될 초기화코드
		System.out.println("부모 디폴트 생성자");

		System.out.println(num);
	}

}


//----------------------------------------------------------------------------------------------------


class Child3 extends Parent3 {
	private int num = 222;

	public Child3() { //생성자
		//		super(); //자식 클래스 생성자 첫 줄에는 super(); 부모 클래스의 디폴트 생성자를 호출하는 코드가 숨겨져있음

		System.out.println("자식 디폴트 생성자");
		System.out.println(num); //num2 / child

		System.out.println("-----------------------------------");		

		System.out.println("super : " + super.num); //num1 / parent
		System.out.println("this : " + this.num); //num2 / child

	}

}


//----------------------------------------------------------------------------------------------------


public class InheritEx_03 {
	public static void main(String[] args) {

		//생성자 호출, 객체생성
		Parent3 p = new Parent3(); //부모의 생성자 호출
		System.out.println("-----------------");

		Child3 c = new Child3(); //자식의 생성자 호출(부모 생성자도 포함)

	}

}

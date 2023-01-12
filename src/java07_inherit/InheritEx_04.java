package java07_inherit;

class Parent4 {
	protected int num; //num1

	public Parent4() { //디폴트 생성자 - 멤버필드 초기화 목적 -> 가장 첫번재 줄에서 실행되어야 함. 첫번재줄에 없으면 다른 값이 대입 된 후 초기화되는 등 요류가 생길 수 있으므로
		
//		this(); //오류, recursive 생성자 -> 매개변수가 없는 생성자를 호출하는 즉, 자기 자신을 재 호출하는 코드를 작성했음
		this( 6666 ); //this 생성자 호출 코드 -> 같은 클래스에 있는 다른 생성자를 호출
		//	->디폴트 생성자 호출시 num1에 6666이 대입됨
		
		System.out.println("부모 디폴트 생성자");
		System.out.println(num); //num1
	}


	public Parent4(int num) { //생성자 오버로딩
		System.out.println("부모 매개변수있는 생성자");

		this.num = num; //num1에 num2값 대입

		System.out.println(num); //num2
	}


//----------------------------------------------------------------------------------------------------------------------------------------


}

class Child4 extends Parent4 {
	
	//필드가 없어서 단축키 자동완성으로 생성자 작성 불가 -> 생성자 자동완성 조건은 멤버필드가 있어야 함
	public Child4() { //디폴트 생성자
//		super(); //부모 생성자를 호출하는 코드, 평소에는 생략되어있음 ->자식 생성자 호출하면 부모 생성자가 출력되는 이유
		
		System.out.println("자식 디폴트 생성자");
	}

	public Child4(int num) { //목표 : 상속받은 num초기화하기
//		super(); //부모 생성자를 호출하는 코드, 평소에는 생략되어있음
		super( num ); //호출시 num1에 num2값 대입?

		System.out.println("자식 매개변수 있는 생성자");
	
//		super.num = num;
//		this.num = num; //에러x, Child4의 필드에 num이 없어서 super영역에서 알아서 찾음
	
	}

}


//----------------------------------------------------------------------------------------------------------------------------------------


public class InheritEx_04 {
	public static void main(String[] args) {

		Parent4 p1 = new Parent4();
		//부모 매개변수 생성자, 6666, 부모 디폴트, 6666
		System.out.println("---------------");
		Parent4 p2 = new Parent4(111);
		// 1111, 부모 매개변수 생성자

		System.out.println("---------------");

		Child4 c1 = new Child4();
		//부모 매개변수 생성자, 6666, 부모 디폴트, 6666, 자식 디폴트 생성자
		System.out.println("---------------");
		Child4 c2 = new Child4(222);
		//부모 매개변수, 222, 자식 매개변수 생성자
		
		//정답!
		
		//부모 매개변수 생성자 왜 나오는지?
		//	->자식 생성자에는 기본적으로 super();타입으로 부모의 디폴트 생성자를 호출하게 되어있음
		//	  현재 부모의 디폴트 생성자에는 this(6666);으로 부모의 매개변수 생성자를 호출하는 코드가 작성되어있기 때문
	
	}

}

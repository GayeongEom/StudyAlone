package java06_class;

//실행 클래스
//	메인 메소드를 정의하고 있는 클래스 -> 프로그램을 실행할 수 있는 클래스

public class Main_01 {
	public static void main(String[] args) {
		System.out.println("main() 실행 테스트");
		System.out.println("-----------------------------");
		
		//Class_01 타입의 변수인 c01 선언
		Class_01 c01; //객체 변수 선언 -> 공간에 쓰레기값
		
		//Class_01 타입의 인스턴스를 생성하고 (new 연산자)
		//인스턴스의 참조값을 c01변수에 대입
		c01 = new Class_01(); //객체생성, 인스턴스화 -> 공간 초기화
		
		//--------------------------
		
		//멤버필드에 대입하기
		//멤버필드는 변수라 대입하고 활용 가능
		c01.num = 123;
		c01.data = "Apple";
		
		//c01 객체의 멤버필드 num, data에 저장된 값 출력
		System.out.println( c01.num );
		System.out.println( c01.data );
		
		System.out.println("--------------------");
		
		//객체변수 c01을 이용하여 클래스의 멤버 메소드를 호출(사용)함
		c01.display();
	
		System.out.println("--------------------");

		//객체 변수를 출력하면 참조값(래퍼런스, Reference)이 출력됨
		System.out.println( c01 );
		//java06_class.Class_01@5ccd43c2
		//@ 왼쪽 : 데이터타입 java06_class.Class_01
		
		System.out.println("--------------------");

		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		
		Class_01 c05 = null;
		c05.num = 500;
		//Null Pointer Exception
		//	-> null 참조하고 있는 객체 변수를 이용하여 참조연산자를 사용하면 발생 (= 참조할 것이 없다)
		//	->예외 발생한 라인(줄)에서 .(참조연산자)를 찾고 그 왼쪽에 있는 코드를 확인
		//		->null 값을 갖고 있을 것
	
	}

}

package java06_class.method;

public class Method_02 {

	//매개변수(Parameter)
	//	->메소드 기능의 입력 데이터로 사용됨
	

	//반환데이터(Return Data)
	//	->메소드 기능의 출력 데이터로 사용됨

	//------------------------------------------------
	
	//매개변수x		-비워둔다
	//반환데이터 x	-void 타입으로 정한다
	
	
	//반환값이 없으므로 변수에 저장할 수 없음
	public void method1() {
		System.out.println("Hello");
	}

	//------------------------------------------------
	
	//매개변수 0
	//반환데이터 x
	
	public void method2( int parameter ) {
		System.out.println("전달된 값 : " + parameter);
	}
	
//	method2( 222 ); 로 메소드 호출
	//222 -> 전달인자, 인수, argument

	//------------------------------------------------

	//매개변수 x
	//반환데이터 o
	
	//** 반환 데이터타입을 void가 아닌 타입으로 명시하면 반드시 return 코드 작성
	public int method3() {
		return 123;
	}
	
	//------------------------------------------------

	//매개변수 o
	//반환 데이터 o
	
	public int method4(int n1, int n2) {
		return n1 + n2;
	}
	
}

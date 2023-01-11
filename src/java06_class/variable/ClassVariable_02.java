package java06_class.variable;

public class ClassVariable_02 {
	
	//멤버필드 -> 인스턴스 변수
	private int num;
	
	//멤버필드 -> 클래스 변수, static변수, 정적 변수
//	private static String city; 
	public static String city = "Seoul"; //static과 private은 어울리지 않음
	
	//**static == 정적 == 실행 전
	//	->사용되기 전 미리 변수를 만들어 놓음
	//**dynamic == 동적 == 실행 도중
	//	->동적 할당 연산자 new
	

	public static final String DATA = "Hello"; //상수이므로 대문자로 작성
	//모든 객체에서 누구든 사용할 수 있게 미리 준비된 상수
	
}

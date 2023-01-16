package java08_abstract.interfaceEx;

public interface TestInterface {

	//인터페이스
	//	상수 멤버 필드
	//	상수 멤버 메소드
	
	//----------------------------------------------
	
	//상수 멤버 필드
	//	-> public static final 키워드가 붙은 필드만 선언 가능
	
	public static final int NUM1 =123; //선언과 동시에 초기화 필수
	
	//------------------------------------------------------------------------

	//public static final 키워드를 생략해도 모든 키워드를 자동으로 붙여 선언
	//인터페이스는 키워드가 필수라서 안붙여도 알아서 붙은 것으로 인식
	//	-> 그래도 다 붙여서 사용하는 걸 선호
	
	int NUM2 = 345; 
	public int NUM3 = 456;
	static int NUM4 = 567;
	final int NUM5 = 678;
	
	//**인터페이스에서 필드를 선언할 때 public static final 키워드를 모두 붙여서 작성하는 편이 좋음
	
	//------------------------------------------------------------------------

	//에러
	//인터페이스는 일반 메소드를 멤버로 가질 수 없음
//	public void method() {
//		
//	}
	
	//추상메소드
	//	-> abstract 키워드 없이 메소드를 작성해도 추상 메소드로 취급
	public void out();
	
	//추상메소드
	public abstract void dispaly();
	
	//**인터페이스에 추상메소드를 작성할 때 abstract를 같이 적어주는 것이 좋음
	
}

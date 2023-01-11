package java06_class.method;

//일반 클래스, 기능 클래스
public class Method_01 {

//	[접근제한자] [제한자] [리턴타입] [메소드명] (매개변수) {
//		//실행코드
//	}
	
	//--------------------------------------------
	public void method() {
		System.out.println("메소드 호출 테스트");
	}
	
	//--------------------------------------------
	
	//0. 메소드의 기본 형태 작성하기
//	public void method() {
//	}
	//1. 메소드 이름 정하기 -> 만들려는 기능을 대표하는 이름으로 
	//2. 매개변수 작성하기 -> 기능을 수행하기 위해 필요한 데이터를 저장할 수 있도록 선언
	//3. 실행코드 작성하기 -> 메소드의 기능을 구현
	//4. return코드 작성하기 -> 기능 수행 결과값을 반환해야할 때 작성
	//5. return타입 작성하기 -> return코드에 맞는 자료형으로 작성
	
	//--------------------------------------------

	//2개의 정수를 뺄셈하는 기능(메소드) 구현하기
	
	public int sub(int num1, int num2) {
		
		//화면에 결과 출력
//		System.out.println(num1 - num2);
		
		int result = num1 - num2;

		//뺄셈 수행 결과를 반환한다
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

package java12_exception;

import java.io.IOException;

class ThrowsTest {
	
	public void method() throws NullPointerException { //예외처리를 메소드 호출한 곳에서 하도록 떠넘김
		
		//unchecked 런타임 예외라 별 일 없엇음
		throw new NullPointerException();
	}
	
	
	public void method2() throws IOException {
		
		//checked 이라서 오류 / 언핸들 예외
		throw new IOException();
	}
	
}

//----------------------------------------------------------------------------------------------

public class Exception_05_throws {
	public static void main(String[] args) { //throws IOException  //메인에 throws 걸기 -> 문법적으로는 되지만 이 코드 버리겠다는 뜻. 쓰면 안됨
		
		//throws 키워드
		//	예외 처리에 대한 책임을 떠넘김
		//------------------------------------------------------
		
		ThrowsTest tt = new ThrowsTest();
		
		//unchecked 예외라서 예외 출력x
//		try {
//		tt.method(); //unchecked
//		} catch (NullPointerException e) {
//			
//		}

		
		try {
			tt.method2(); //checked
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		System.out.println("+ + + 프로그램 종료 + + +");
		
	}

}

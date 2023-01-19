package java12_exception;

import java.io.IOException;

import javax.imageio.IIOException;

public class Exception_04_throw {
	public static void main(String[] args) {

		//throw 키워드
		//	-> 예외 상황을 발생시키는 키워드

		String str = null;

		//		System.out.println( str.length() ); //예외 발생 코드 -> 야기서 프로그램 종료

		System.out.println("문자열 길이 출력 후");

		//-------------------------------------------------------------------------

		if( str != null ) {
			System.out.println(str.length());
		} else {
			System.out.println("[SYSTEM} 문자열이 null입니다.");

			//예외 객체를 직접 만들어서 던지는 코드
			//	->예외 상황 발생시키기
//						throw new NullPointerException(); //예외 발생시 프로그램 종료
			
			//객체는 정보값만 throw는 던져서 예외를 맞히는
			//throw에 객체변수를 넣으면 throw가 예외 정보를 적어서 던져줌
		}

		System.out.println("if구문 이후");

		System.out.println("--------------------------------");

		//ArithmeticException - / by zero ( devide by zero )
//		System.out.println(99/0);

		
		//예외정보 객체 생성
//		ArithmeticException ae = new ArithmeticException();

		
		//예외 던지기 ( 예외 발생시키기 ) -> 객체 생성할 때 예외가 났지만 예외가 난 곳은 throw라고 뜸
//		throw ae; 

		
		//**예외 객체를 생성(new)한다고 해서 예외를 발생(throw)시키는 것은 아님

		//-----------------------------------------------------------

		//예외가 생성된 위치와 발생된 위치를 일치시키는 것이 좋음
//		throw new ArithmeticException(); //-> 언체크드라서 트라이캐치 필수x

		//-----------------------------------------------------------
//		IOException ie = new IOException(); //throw와 위치가 다름

		try {

//			throw ie;
			
			throw new IOException();

		} catch (IOException e) {

			e.printStackTrace(); //예외상황 확인
		}

		System.out.println("throw 이후");

	}

}

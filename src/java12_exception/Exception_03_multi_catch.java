package java12_exception;

public class Exception_03_multi_catch {
	public static void main(String[] args) {

		try {
			//try 블록
			//예외 발생이 예측된 코드를 작성

		} catch (NullPointerException e) {
			//catch 블록

			//NullPointerException 예외 발생시 예외 처리하는 코드를 작성

		} catch (ArrayIndexOutOfBoundsException e) {
			//catch 블록

			//ArrayIndexOutOfBoundsException 예외 발생시 예외 처리하는 코드를 작성

		} catch (Exception e) { //else같은 느낌 -> 항상 마지막에 써줘야함
			//catch 블록
			//NullPointerException과 ArrayIndexOutOfBoundsException이 아닌 나머지 예외 발생시 예외처리하는 코드를 작성

		}

		//** catch블록 구문 여러개 작성할 수 있음

		//-------------------------------------------------------------------------------------------------

		//다중 예외처리( Multi Catch)
		//	->하나의 catch 구문에서 예외 클래스를 여러개 적용하는 문법
		//	->JDK 1.7부터 지원

		try {

		} catch (NullPointerException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {

			//NullPointerException
			//ArrayIndexOutOfBoundsException
			//NegativeArraySizeException

			//위 셋 예외 상황을 처리하는 구문 작성

		} catch(Exception e) {
			//나머지 예외 상황을 처리하는 구문
		}

	}

}

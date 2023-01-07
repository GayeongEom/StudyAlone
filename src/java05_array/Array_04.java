package java05_array;

public class Array_04 {
	public static void main(String[] args) {

		//문자열, String
		//	내부 데이터 처리로 char[]를 이용하여 구현되어 있음

		//	char[]과 String은 같은 데이터 타입은 아님!
		//------------------------------------------------------

		String str = "AppleBanana"; //문자열

		char[] chArr = { 'A', 'p', 'p', 'l', 'e', 'B', 'a', 'n', 'a', 'n', 'a' }; //문자배열

		//------------------------------------------------------

		System.out.println("문자열의 길이 : " + str.length() ); //클래스 참조
		System.out.println("char[]의 길이 : " + chArr.length ); //배열 참조

		//------------------------------------------------------

		System.out.println("문자열의 세번째 글자 : " + str.charAt(2) ); //클래스 참조
		System.out.println("chArr[]의 네번째 글자 : " + chArr[3] ); //배열 참조

	}

}

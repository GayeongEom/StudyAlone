package java01_Variables;

//ctrl + shift + c : 선택영역에 한 줄 주석 토글(toggle) 단축키
//shift + end : 커서 기준 한 줄의 끝까지 선택
//shift + home : 커서 기준 한 줄의 처음까지 선책


public class Vriables_01 {
	public static void main(String[] args) {
		
//		System.out.println("동작테스트");
		
		System.out.println( 12345 );	//int형 타입(정수형)
		System.out.println( 123.456 );	//double형 타입(실수형)
		System.out.println( true );		//boolean형 타입(논리형)
		System.out.println( 'A' );		//char형 타입(문자형)
		
		System.out.println( "Hello" );	//String형 타입(문자열 타입)
//----------------------------------------------------------------------
		
		System.out.println( '가' );
		System.out.println( (int)'가' );	//char형 -> int형 변환하여 출력 : 440032
		
		System.out.println( 99 );
		System.out.println( (char)99 );		//int형 -> char형 변환하여 출력 : 'c'
		
	}

}

package java01_Variables;

public class Variables_07 {
	
	public static void main(String[] args) {
		
		//자바의 자료형 종류
		
		//8가지 기본 데이터타입 ( Primitive Type) -> 저장된 데이터 표현
		
		//참조형 데이터타입 ( Reference Type ) -> 데이터가 저장된 위치
		
		//----------------------------------------------------
		
		//String 타입
		//	참조형 데이터타입 / 문자열 - 문자(char)들의 나열
		// "" 큰 따옴표를 이용하여 여러 문자를 감싸서 표현 -> String형 리터럴 상수
		
		int num;		//기본 데이터타입 int 변수 선언
		String str;		//참조형 데이터타입 String 변수 선언
		
		//----------------------------------------------------
		
		String fruit; //과일 이름
		
		fruit = "Apple";		//문자열 리터럴 "Apple"을 fruit 변수에 저장
		
		fruit = "Banana";		//기존의 "Apple"을 지우고 "Banana"를 저장
		
		fruit = "Cherry";		//기존의 "Banana"를 지우고 "Cherry"를 저장
		
		System.out.println( fruit );
		System.out.println("맛있는 과일 : " + fruit );
		
	}

}

package java03_scanner;

public class FormattedDouble {
	public static void main(String[] args) {
		
		//소수점 자릿수를 지정하여 출력하기
		
		//방법1. 
		// System.out.printf() 메소드 이용하기
		// printf - print formatted
		
		// 출력서식을 지정하여 화면에 데이터 출력
		
//		System.out.printf("문자열");
//		System.out.printf("서식문자를 포함하는 문자열", [서식문자를 대체할 데이터], ...);
		
		//**서식문자 : 출력 데이터의 형식(+타입)을 지정하는 문자
		
		//**서식문자의 종류
		//		%d - 10진수 정수 형식으로 표현
		//		%f - 실수 형식 표현
		//		%s - 문자열 형식 표현
		//		%c - 단일 문자 형식 표현
		
		// ** % 와 형식지정글자 사이에 숫자를 이용하여 자릿수를 지정
		
		System.out.printf("%s", "안녕하세요");
		System.out.println();
		
		System.out.printf("총점 %d점", 289);
		System.out.println();
		
		System.out.printf("%s %d", "HIHI", 656);
		System.out.println();
		
		//전체 9자리를 확보하고 출력, 소수점 4자리 유지
		System.out.printf("%9.4f", 23.45);
		System.out.println();

		//소수부분 2자리 유지 (3번째 반올림)
		System.out.printf("%.2f", 89.666666666667);
		System.out.println();
		
		//--------------------------------------------------
		
		//방법 2.
		// String.format("서식문자 포함 문자열", [서식문자를 대체할 데이터], ...)
		// ->변환된 문자열을 String 타입으로 반환
		
		String str = String.format("%.2f", 33.3333333333333);
		
		System.out.println("str : " + str);
		
	}

}

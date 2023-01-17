package java09_api;

import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		
		//문자열 토큰, String Token
		
		//	->특정 규칙을 이용해서 문자열을 구분할 수 있는 단위
		
		//ex) "1,2,3,4,5"
		//	-> , 를 이용해서 구분 = 구분자(delimiter)
		//	-> 토큰 : "1", "2", "3", "4", "5"
		
		//ex) "010-5544-3234"
		//	-> 구분자 : "-"
		//	-> 토큰 : "010" "5544" "3234"
		
		//--------------------------------------------------------------
		
		//문자열의 토큰화(Tokenize)
		
		String data1 = "HI Hello Hola";
		//String data = "HI, He llo, Hola"; //-> 띄어쓰기를 포함하고 싶은 경우 구분자를 ,로
		
		//" " 띄어쓰기 한 칸을 구분자로 적용하여 data1문자열을 토큰화
		String[] tokens = data1.split( " " );
		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("---------------------");
		
		String data2 = "I!@#am!@#spider!@#man";
		
		tokens = data2.split("!@#");
		
		for(String token : tokens) {
			System.out.println(token);
		}		
		
		System.out.println("---------------------");

		//구분자를 지정하지 않으면 공백문자를 구분자로 사용
		//객체 생성하면서 토큰을 나누고 저장
		StringTokenizer st1 = new StringTokenizer(data1);
		
		System.out.println("토큰의 개수 : " + st1.countTokens());
		
		//nextToken() 메소드
		//현재 토큰 문자열을 반환
		//다음 토큰을 반환할 준비를 함
		
		//hasMoreToken() 메소드
		//반환할  토큰이 남아있는지 boolean값으로 리턴
		//false일 경우 nextToken()이 불가한 상황임을 알려줌
		
		//토큰이 존재하는 만큼 반복하기
		while( st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("---------------------");

		StringTokenizer st2 = new StringTokenizer(data2, "!@#");
		
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		
		//에러
		//	->NoSuchElementException
		//	->nextToken()으로 반환할 데이터가 더이상 존재하지 않을 때 발생
//		System.out.println(st2.nextToken());
		
		
	}
	
}

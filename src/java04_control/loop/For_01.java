package java04_control.loop;

public class For_01 {
	public static void main(String[] args) {
		
		//반복문, loop
		//	for, while, do-while
		//-----------------------------------
		
		//for문, for loop
		
//		for( 초기식 ; 조건식 ; 증감식 ) {
//			
//			//조건식이 참(true)일 때 실행하는 영역
//			//반복적으로 실행하는 영역
//			
//		}
		//----------------------------------------------
		
		int i; //반복(iterate) 조절에 사용될 변수
		
		for(i=0 ; i<5 ; i++) { //i의 값이 5까지 증가는 되고, 조건식 판별 후 false이므로 출력을 안함 -> 현재 i의 값 5
			System.out.println("HI : " + i );
		}
		
//		System.out.println(i); //i의 값 확인을 위한 출력
		
		//초기식 : i=0		(시작)
		//조건식 : i<5		(false일 경우 종료)
		//증감식 : i++		(중간 동작)
		
		//for문 읽는 방법
		//	i변수가 0부터 시작해서 				-초기식
		//	i변수의 값이 5보다 작은 동안		-조건식
		//	i변수를 1씩 증가시키면서			-증감식
		//	{}중괄호 코드 영역을 실행시킨다
		//------------------------------------------------------
		
		//for문 실행 순서
		//	1. 초기식 실행
		
		//	2. 조건식 판별
		//		2-1. true일 때, 3번 항목 수행		2-2. false일 때
		//	3. {}중괄호 영역 실행
		//	4. 증감식 실행
		//	5. 2번 항목 실행
		
	}

}

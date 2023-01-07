package java04_control.loop;

public class While_02 {
	public static void main(String[] args) {
		
//		초기식; //while 구문이 시작되기 전에 작성
//		
//		while( 조건식 ) { //while구문의 ()괄호 안에 작성
//			
//			//조건식이 참(true)일 때 실행할 코드
//			
//			증감식; //while 구문의 {}중괄호 안쪽 제일 마지막 코드로 작성
//		}
		
		//---------------------------------------------------------------------
		
		for(int i=0; i<10; i++) {
			System.out.println( i );
		}
		
		System.out.println("-------------");
		
		int i=0; //초기식
		while(i<10) { //조건식
			
			System.out.println(i);
			i++; //증감식 ->i가 10으로 증가되고, 조건식을 판단했을 때 false이므로 9까지만 출력, i=10
		}
		
		System.out.println();
		System.out.println("현재 i의 값 : " + i);
		
		//---------------------------------------------------------------------

		// for문은 반복횟수가 정해져있거나 정수값의 반복을 적용할 때 사용
		
		// while문은 반복횟수가 명확하지 않거나, 정해지지 않았을 때 사용
		//	-> 반복 종료 조건만 주어진 경우 많이 사용
		//	->for문을 while문으로 변환 완전 가능
		//	->while문을 for문으로 변환 불가한 경우도 있음
	}

}

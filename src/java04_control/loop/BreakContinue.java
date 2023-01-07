package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {

		//break;
		//	반복문 또는 switch구문

		if( true ) {
			System.out.println("HI");

			//에러, 반복문이나 switch 없이 사용할 수 없음
			//			break;

			System.out.println("Hello");
		}

		System.out.println("------------------------");

		for(int i=0; i<100; i++) {
			System.out.println(i);

			if(i>=5) {
				break; //for문 중단
			}
		}

		System.out.println("------------------------");
		
		//중첩된 제어문에서 break를 사용하면 가까운 블록의 제어문 한 개마 중단
		//	->바깥쪽 for문 중단할 수 없음

		for(int i=0 ; i<5; i++) {
			for(int j=0; j<5; j++) {

//				if( i>=2 ) { //->j for문에 브레이크
//					break;
//				}

				if( j>=2 ) { //->j for문에 브레이크
					break;
				}
				
				System.out.println("i : " + i + ", j : " + j);

			}
			System.out.println();

		}

		System.out.println("------------------------");
		
		//continue;
		//	반복문에서만 사용할 수 있는 제어문
		
		//	현재 반복코드를 중단하고 다음 반복을 수행
		//	반복문의 {}중괄호 코드 남은 부분을 1번 건너뜀
		
		//	for문에서는 증감식으로 감
		//	while문에서는 조건식으로 감
		
		for(int i=0; i<10; i++) {

			if( i%2==0 ) { //짝수일 때
				continue;

			}

			System.out.println(i);
			
		}
		


	}//main

}//class

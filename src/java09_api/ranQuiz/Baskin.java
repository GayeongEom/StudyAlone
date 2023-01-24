package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class Baskin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int user = 0; //사용자의 숫자 (입력)
		int com = 0; //컴퓨터의 숫자 (랜덤)
		
		int num = 1; //게임 진행 숫자
		int max = 31; //게임 종료 숫자
		
		int winner = 0; //승자 체크, 1:user승, 2:com승
		
		
		//게임 진행
		while(num <= max) {
			
			//컴퓨터의 연속 숫자 개수, 1~3
			com = ran.nextInt(3) + 1;
//			System.out.println("[TEST] com : " + com);
			
			//컴퓨터의 연속 숫자 개수 보정
			//	-> 컴퓨터가 좀 더 유리하게 동작하도록 변경
			if( max-num <= 3 && num != max ) {
				com = max-num;
			}
			
			//컴퓨터의 연속 숫자 출력하기
			for(int i=0; i<com && num<=max; i++) {
				System.out.println("com >> " + num++);
				
				if(num>max)	winner=1; //사용자 승리
			}
			System.out.println();
			
			//---------------------------------------------
			
			//사용자의 입력, 1~3만 허용
			while( num <= max ) {
				System.out.print(">> 몇 개를 연속으로? ");
				user = sc.nextInt();
				
				if( user>=1 && user<=3 ) {
					break;
				}
				
				System.out.println("[SYSTEM] 1~3만 입력하세요");
			}
			
			//사용자의 연속 숫자 출력하기
			for(int i=0; i<user && num<=max; i++) {
				System.out.println("user >> " + num++);
				
				if(num>max) winner=2; //컴퓨터 승리
			}
			System.out.println();
			
		} //게임 종료 - 번갈아가면서 숫자 말하기의 끝		
		
		
		//승자 출력
		if( winner == 1 ) {
			System.out.println("\n\n** 사용자의 승리 **");
		} else if ( winner == 2 ) {
			System.out.println("\n\n** 컴퓨터의 승리 **");
		}
		
	}
}














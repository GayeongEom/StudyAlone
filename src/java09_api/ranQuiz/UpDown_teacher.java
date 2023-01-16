package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class UpDown_teacher {
	public static void main(String[] args) {
		
		//입력값 변수
		int com; //컵퓨터
		int user; //사용자
		
		Random ran = new Random(); //랜덤 객체 -> com값
		Scanner sc = new Scanner(System.in); //키보드 입력 객체 -> user값;
		
		System.out.println("========== START ==========");
		
		//컴퓨터 랜덤 생성 (1~50)
		com = ran.nextInt(50 + 1);
		System.out.println("[COM] " + com);
		
		for(int count=0; count<7; count++) { //7번의 도전기회
		
			while( true ) {
				//사용자 입력
				System.out.print("1~50 중의 하나 입력 : ");
				user = sc.nextInt();
				
				//잘못된 사용자 입력에 대한 패널티 처리
				if( user >= 1 && user <=50 ) {
					break;
				} else {
					System.out.println("\n[SYSTEM] 1~50 범위의 숫자만 입력하세요!");
				
					if( ++count>=7 ) {
						System.out.println("\n[SYSTEM] 모든 기회를 소진하셨습니다.");

						return;
					}
				
				}
				
			}
			
			//범위 외 숫자 입력시 횟수 하나 깎기
			
			
			//비교 - 승부판정
			if(com == user) {
				System.out.println("이겼습니다!");
				return; //프로그램 종료 - main() 종료
				
			} else if(com > user) {
				System.out.println("UP");
				
			} else if(com < user) {
				System.out.println("Down");
			}//if
			
		}//for
		
		System.out.println("졌습니다ㅠ");
		System.out.println("컴퓨터는 [" + com + "] 입니다.");
		
	}//main

}//class

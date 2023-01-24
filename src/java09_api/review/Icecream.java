package java09_api.review;

import java.util.Random;
import java.util.Scanner;

public class Icecream {
	public static void main(String[] args) {

		//	 + 배스킨라빈스31 게임
		//	  - 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
		//	  - 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
		//	   말할 수 있다
		//	  - 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
		//	  - 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
		//	  - 31을 말하는 사람이 진다
		//
		//
		//	  * 추가 사항
		//		 31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
		//		있는 숫자까지만 말한다
		//
		//		ex. 사용자가 28까지 말했다면
		//		  컴퓨터는 무조건 29, 30까지만 말한다

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("*_*_*_*_*_*_*_*_* 31 게임 *_*_*_*_*_*_*_*_*");
		System.out.println("\n\tCom 먼저 시작합니다.\n");


		int user = 0; //사용자 입력
		int com = 0; //com 입력

		final int answer = 31; //정답
		int input = 0; //입력값

		Loop :
			while(input <= answer) {

				//com 숫자 입력
				com = ran.nextInt(3) + 1;
				
				//com이 유리하게
				if((answer-input)<=3 && input != answer) {
					com = answer-input-1;
					if(com==0) {
						++com;
					}
				}
				
				//com 숫자 출력
				for(int i=0; i<com && input <= answer; i++) {

					++input; //com의 숫자만큼 입력값 1씩 증가
					System.out.println(">> Com : " + input);

					if(input==answer) { //com이 입력한 값이 31을 넘는다면?
						System.out.println("\n\n\t*_*_*_*_ User is Winner *_*_*_*_");
						break Loop;
					}

				}//for
				System.out.println();
				//-------------------------------------------------------------------------

				//사용자 입력

				while(input<=answer) {
					System.out.print("1~3 중 연속할 숫자를 입력해주세요 : ");
					user = sc.nextInt();

					if(user>=1 && user<=3) {
						break;
					} else {
						System.out.println("[SYSTEM] 1~3만 입력할 수 있습니다. 다시 입력해주세요\n");
					}
					
					
				}//while

				System.out.println();
				
				//사용자 출력

				for(int i=0; i<user && input <= answer; i++) {

					++input;
					System.out.println(">> User : " + input);

					if(input==answer) {
						System.out.println("\n\n\t*_*_*_*_ Com is Winner *_*_*_*_");
						break Loop;
					}
				}//for

				System.out.println();

			}//Loop

	}

}

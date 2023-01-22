package java09_api.review;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {

		//	 + UP&DOWN 게임
		//	  - 컴퓨터가 1~50의 랜덤을 생성한다 (= com)
		//	  
		//	  - 사용자의 입력을 받는다 (= user)
		//	 
		//	  - user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
		//	   (기준은 com)
		//	   (ex. com == 40 && user == 30 -> UP )
		//	   
		//	  - user가 com과 같으면 user 승리
		//	  
		//	  - 7번안에 맞추지 못하면 com 승리

		//사용자 입력값
		Scanner sc = new Scanner(System.in);
		int input =0;

		//랜덤값 정답
		Random com = new Random();
		int answer = com.nextInt(50)+1;
		//정답 확인하기
//		System.out.println(answer);

		//정수 범위 좁히기
		int min = 0;
		int max = 0;

		System.out.println("*_*_*_*_* Up & Down 게임 *_*_*_*_*");
		System.out.println();
		System.out.print("1~50 사이 숫자를 입력해주세요 : ");

		for(int i=0; i<7; i++) {

			input = sc.nextInt();

			if(i==6) { //i가 6이면 마지막 입력을 받은 것임

				if(input==answer) { //정답인 경우

					System.out.println("\n========================================");
					System.out.println("*_*_*_* [user] 가 승리하였습니다 *_*_*_*");
					break;

				} else {
					
					System.out.println("\n============================================");
					System.out.println(">>\t정답은 " + answer + "입니다.");
					System.out.println("*_*_*_* [Computer] 가 승리하였습니다 *_*_*_*");
					break;
				}

			} else if(input==answer) { //정답인 경우

				System.out.println("\n========================================");
				System.out.println("*_*_*_* [user] 가 승리하였습니다 *_*_*_*");
				break;

			} else if(input<answer) { //입력값이 작은 경우

				min = input;
				System.out.println("\nUp!\t" + "남은 횟수는 " + (6-i) + "번 입니다.");
				System.out.print(min + "보다 큰 값을 입력해주세요 : ");

				continue;			

			} else if (input>answer) {

				max = input;
				System.out.println("\nDown!\t" + "남은 횟수는 " + (6-i) + "번 입니다.");
				System.out.print(max + "보다 작은 값을 입력해주세요 : ");

				continue;				

			} else {
				System.out.println("\n정답은 " + answer + "입니다.");
				System.out.println("*_*_*_* [Computer] 가 승리하였습니다 *_*_*_*");
			}



		} //for

	}

}

package java09_api.ranQuiz;

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

		//입력 객체
		Scanner sc = new Scanner(System.in);
		int input;

		Random ran = new Random();
		int answer = ran.nextInt(50) +1;
		System.out.println("[COM] " + answer);
		//System.out.println(answer); //범위 확인

		System.out.print("0~50 사이 숫자를 입력하세요 : ");

		for(int i=0; i<7; i++) {

			//사용자 입력 받기
			input = sc.nextInt();
			
			//값 비교
			if(i==6) {
				System.out.println("\n *_*_*_*Com이 승리하였습니다.*_*_*_*");
				
			} else if(input == answer){ //user가 정답을 맞히면
				System.out.println("\n *_*_*_*User가 승리하였습니다.*_*_*_*");
				break;
				
			} else if(input > answer) {
				System.out.println("\nDown! " + (6-i) + "번 남았습니다.");
				System.out.print("Retry : ");
				continue;
			
			} else if(input < answer) {
				System.out.println("\nUp! " + (6-i) + "번 남았습니다.");
				System.out.print("Retry : ");
				continue;
			}

			//if를 하나 더
			
			//else 컴이 승리할 때
			
			//i==6일 때
			
			
			
		} //for






	}

}

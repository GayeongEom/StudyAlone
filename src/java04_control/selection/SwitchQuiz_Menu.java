package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {
	public static void main(String[] args) {


		//      - 메뉴 만들기
		//
		//				      ===============================
		//				         M  e  n  u
		//				      ===============================
		//				         1. Hello World 출력
		//				         2. 이름 출력
		//				         3. 성별 출력
		//				         4. 종료
		//				      ===============================
		//
		//				        >> _
		//
		//				       -> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성

		System.out.println("===============================");
		System.out.println("   M  e  n  u");
		System.out.println("===============================");
		System.out.println("   1. Hello World 출력");
		System.out.println("   2. 이름 출력");
		System.out.println("   3. 성별 출력");
		System.out.println("   4. 종료");
		System.out.println("===============================");

		System.out.println();
		System.out.print("  >>");

		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();


			switch (menu) {
			case 1: 
				System.out.println("Hello World");
				break;
			case 2:
				System.out.println("Name");
				break;
			case 3:
				System.out.println("Gender");
				break;
			case 4:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다");
			} 


			
			//정답
			
			
	}//class
}



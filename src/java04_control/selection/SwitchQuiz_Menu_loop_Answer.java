package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu_loop_Answer {
	public static void main(String[] args) {

		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;

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

		Scanner sc = new Scanner(System.in);
		int menu;

		do {
			System.out.println("===============================");
			System.out.println("   M  e  n  u");
			System.out.println("===============================");
			System.out.println("   1. Hello World 출력");
			System.out.println("   2. 이름 출력");
			System.out.println("   3. 성별 출력");
			System.out.println("   4. 종료");
			System.out.println("===============================");

			System.out.println();
			System.out.print("\t>>");

			menu = sc.nextInt();

			System.out.print("\t>>"); //출력시 가독성 좋게 추가

			switch (menu) {

				case HELLO_MENU: 
					System.out.println("Hello World");
					System.out.println();
					break;
				case NAME_MENU:
					System.out.println("Name");
					System.out.println();
					break;
				case GENDER_MENU:
					System.out.println("Gender");
					System.out.println();
					break;
				case EXIT_MENU:
					System.out.println("종료되었습니다.");
					System.out.println();
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
			}//switch 
			
		} while (menu!=EXIT_MENU);


	}//class
}//main



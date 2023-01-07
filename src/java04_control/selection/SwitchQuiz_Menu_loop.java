package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu_loop {
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

			System.out.print("\t>>");

			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();

			System.out.print("\t>>"); //가독성 좋게 출력시 추가
			
			switch (menu) {
			case 1: 
				System.out.println("Hello World");
				System.out.println();
				break;
			case 2:
				System.out.println("Name");
				System.out.println();
				break;
			case 3:
				System.out.println("Gender");
				System.out.println();
				break;
			case 4:
				System.out.println("종료되었습니다.");
				System.out.println();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			} 
		} while (menu!=4);


	}//class
}



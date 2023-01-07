package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {
	public static void main(String[] args) {

		//숫자를 입력하고 그 값을 다시 출력하는 프로그램

		//	->99를 입력하면 종료한다

		Scanner sc = new Scanner(System.in);
		int input; //입력값

		while (true) { 
			System.out.print("Input Number(종료 = 99) : ");
			input = sc.nextInt();

			System.out.println("입력한 값 : " + input);
			System.out.println();

			if(input == 99) {
				//반복중단
				break;
			}
		} 
		
		System.out.println("+ + + 프로그램 종료 + + +");






	}

}

package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
	public static void main(String[] args) {


		//	    + 입력한 데이터가 3의 배수인지 판별하시오
		//	     (% 연산자 사용)
		//	      >> Input Number : 7
		//	      >> 3의 배수가 아닙니다

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");

		int num = sc.nextInt();

		if (num<=0) {
			System.out.println("잘못입력하셨습니다");

		} else if (num%3 == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}

		//		if (num%3 == 0) {
		//			System.out.println("3의 배수입니다");
		//		} else {
		//			System.out.println("3의 배수가 아닙니다");
		//		}
	}

}

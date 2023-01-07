package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01 {
	public static void main(String[] args) {
		
//		    + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		      >> Input Number : -3
//		      >> 음수입니다

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수입니다");
		
		} else if (num < 0) {
			System.out.println("음수입니다");

		} else {
			System.out.println("0입니다");
			
		}
		
	}

}

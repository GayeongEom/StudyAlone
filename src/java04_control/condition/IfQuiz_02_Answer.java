package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02_Answer {
	public static void main(String[] args) {

		//	    + 입력한 데이터가 3의 배수인지 판별하시오
		//	     (% 연산자 사용)
		//	      >> Input Number : 7
		//	      >> 3의 배수가 아닙니다

		Scanner sc = new Scanner(System.in); //입력객체

		int num; //입력값 변수

		//숫자 하나입력받기
		System.out.print("Input Number : ");
		num = sc.nextInt();

		if (num%3 == 0) { //3의 배수
			System.out.println("num [" + num + "] 은/는 3의 배수이다");
		} 
		if (num%3 != 0) { //3의 배수가 아님
			System.out.println("num [" + num + "] 은/는 3의 배수가 아니다");
			
		}
		
		System.out.println("---------------------------------------");
		
		//** 추가 : 0은 3의 배수로 취급하지 않는다
		
		if (num%3 == 0 && num != 0) { //3의 배수
			System.out.println("num [" + num + "] 은/는 3의 배수이다");
		} 
		if (num%3 != 0 || num == 0) { //3의 배수가 아님
			System.out.println("num [" + num + "] 은/는 3의 배수가 아니다");
			
		}

	}

}

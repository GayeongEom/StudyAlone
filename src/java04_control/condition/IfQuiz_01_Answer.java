package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_01_Answer {
	public static void main(String[] args) {
		
//	    + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//	      >> Input Number : -3
//	      >> 음수입니다
		
		Scanner sc = new Scanner(System.in); //입력객체
		
		int num; //입력값 변수
		
		//숫자 하나 입력받기
		System.out.print("Input Number : ");
		num = sc.nextInt();
		
		if(num > 0) { //양수
			System.out.println(num + " 이/가 양수입니다");
		} else { //else 안에 if문 중첩
			
			if(num < 0) { //음수
				System.out.println(num + " 이/가 음수입니다");
				
			} else { //0
				System.out.println("0입니다");
				
			}//2. else
			
		}//1. else

	}//main

}//class

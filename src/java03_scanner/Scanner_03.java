package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {

		//문자열 입력 처리 메소드
		//	 nextLine(), next()
		//----------------------------------------------
		
		//키보드 입력 객체
		Scanner sc = new Scanner(System.in);
		
		//문자열 변수
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//문자열 입력받기
//		str1 = sc.nextLine(); //Line은 엔터를 쳐야 한 줄을 입력 -> 띄어쓰기가 필요한 문장
//		str2 = sc.nextLine();
		
//		Input String : Apple Banana
//		Cherry
//
//		---출력---
//		str1 : Apple Banana
//		str2 : Cherry

		str1 = sc.next(); //단어수준으로 입력
		str2 = sc.next();
		
//		Input String : Apple Banana
//
//		---출력---
//		str1 : Apple
//		str2 : Banana

		
		System.out.println("\n---출력---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//nextLine() - '\n' 
		// 개행문자(엔터값)을 기준으로 입력한 한 줄을 하나의 데이터로 판단
		//next() - ' ', '\n', '\t' 
		// 공백문자(white space, ws)를 기준으로 하나의 데이터로 판단
		
		//nextInt(), nextDouble(), nextBoolean(),... 들은 next()처럼 데이터를 판단 -> 공백문자 기준
		
		
		
	}

}

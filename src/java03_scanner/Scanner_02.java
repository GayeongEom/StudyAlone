package java03_scanner;

import java.util.Scanner;

public class Scanner_02 {
	public static void main(String[] args) {
		
		//문자열(String) 입력받기
		
		//1. 입력객체 변수 선언 - java.util.Scanner
		Scanner sc; 
		
		//2. 입력객체 생성, 입력기능 활성화 - new
		sc = new Scanner(System.in);
		
		//3. 문자열(String) 입력 받기 - nextLine() 메소드
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine(); //nextLine() : String - Scanner 키보드 입력을 받아 문자열로 저장
		
		//4. 입력받은 문자열 출력하기
		System.out.println("입력받은 문자열 : " + str);
		
		sc.close();
		

		
		
		
		
	}

}

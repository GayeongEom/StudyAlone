package java03_scanner;

import java.util.Scanner;

public class CharScanTest {
	public static void main(String[] args) {
		
		//Scanner를 이용하여 char값 입력받기
		
		// ->Scanner에는 char을 직접 입력받는 기능이 없음
		
		// ->String 타입은 char형을 모아놓은(나열해놓은)클래스 타입임
		// ->String으로 입력받아 첫 글자를 char타입으로 꺼내옴
		//-----------------------------------------------------------------
		
		String str = "Apple Banana";
		char returnData = str.charAt(6);
		
		System.out.println("리턴값 : " + returnData);
		
		//-----------------------------------------------------------------
		System.out.println("------------------");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		String data = sc.nextLine();
		
		System.out.println( data.charAt(0) );
		
		//-----------------------------------------------------------------
		System.out.println("------------------");
		
		
		System.out.print("Input : ");
		
		char charData = sc.nextLine().charAt(0);
		
		System.out.println("chatData : " + charData);
	}

}

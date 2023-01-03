package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		//입력 객체
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----입력----");

		
		System.out.print("Input Number : ");
		int num = sc.nextInt(); //정수값 입력 
		//nextInt()까지 실행된 상태에서 커서 깜빡이는 중(스캔 대기중)
		//123'\n' 에서 123 만 스캔하고 '\n'은 그대로 남아있음
		
		System.out.print("Input String : ");
		
//		sc.nextLine(); //->해결법 : 입력버퍼에 남은 '\n'을 제거한다 -> 입력버퍼 비우기
//		sc.skip("[\\r\\n]+"); //이런 패턴이 나오면 다 넘겨라 / 입력 버퍼에서 '\r', '\n'을 모두 제거한다 -> 입력버퍼 비우기
		
		String str = sc.nextLine(); //문자열 입력 
		//Scan 대기중 남아있는 '\n' 까지만 스캔하고 입력받지 않고 끝내버림
		//nextInt()(공백문자 기준) 후에 nextLine()(개행문자 기준) 입력받지 않음 -> 해결법 : 남아있는 '\n' 지우기
		
		System.out.println("----출력----");
		System.out.println("숫자 : " + num);
		System.out.println("문자 : " + str);
		
		
		
	}

}

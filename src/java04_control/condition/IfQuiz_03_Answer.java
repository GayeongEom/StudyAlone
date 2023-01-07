package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03_Answer {
	public static void main(String[] args) {

		//	    + 두 수를 입력 받아 큰 수를 출력하시오
		//	      >> Input Number1 : 44
		//	      >> Input Number2 : 88
		//	      >> 88 이 더 큰 수

		Scanner sc = new Scanner(System.in); //입력객체

		//숫자 하나입력받기
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();

		//숫자 하나입력받기
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();

		if(num1>num2) { //num1이 큰 경우
			System.out.println(num1 + "이/가 큽니다");
		} else if (num1<num2 ) { //num2가 큰 경우
			System.out.println(num2 + "이/가 큽니다");
			
		} else { //같은 경우
			System.out.println("두 숫자가 " + num1 + " (으)로 같습니다");
			
		}
		
		//-----------------------------------------------------------
		System.out.println("------------------------------");
		
		int result = 0; //-> 중괄호 밖에서 사용할 변수 미리 선언 및 초기화 해줘야 함
		
		if(num1>num2) { //num1이 큰 경우
			
//			int result = num1; ->if 중괄호 안에서 선언한 것은 그 안에서만 사용 가능해서 에러
//			result = num1; ->중괄호 안에서 값 대입한 것은 초기화한 것으로 인식하지 않아서 에러
			result = num1;

		} else if (num1<num2 ) { //num2가 큰 경우
			result = num2;
			
		} else { //같은 경우
			result = num2;
			
		}
		
		System.out.println("큰 수 : " + result);

	}

}

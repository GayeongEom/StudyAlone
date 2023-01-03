package java02_operator;

public class Binary_01 {
	public static void main(String[] args) {
		 //이항 연산자 - 산술 + - * / %
		
		int num1 = 16, num2 = 7; //피연산자
		int result; //연산의 결과값을 저장하는 변수
		
		result = num1 + num2; //result 공간에 값을 대입
//		result = 16 + 7; //변수의 값 불러오기(변수의 값 활용하기)
//		result = 23; //덧셈 연산
//		-> result 변수에 23을 대입(저장)
		
		System.out.println("덧셈의 결과 : " + result);
		
		System.out.println("------------------------");
		
		//% 나머지 연산자(modular operator, mod 연산자)
		
		num2 = 6;
		result = num1 % num2;
		
		System.out.println(num1 + "값을 " + num2 + "(으)로 나눈 나머지 : " + result);
		
		System.out.println("------------------------");

		//잘못된 경우! 연산자 우선순위를 고려하지 않음 -> 우선순위가 같은 식의 경우 왼쪽부터 차례대로 진행됨
		System.out.println("num1 + num2 = " + num1 + num2); 
//		System.out.println("num1 + num2 = " + 16 + 6); //변수값 활용 
//		System.out.println("num1 + num2 = + 16" + 6);  //문자열 연결 연산
//		System.out.println("num1 + num2 = + 166");  //문자열 연결 연산

		System.out.println("------------------------");
		
		System.out.println("num1 + num2 = " + (num1 + num2)); 
		System.out.println("num1 - num2 = " + (num1 - num2)); 
		System.out.println("num1 * num2 = " + (num1 * num2)); 
		System.out.println("num1 / num2 = " + (num1 / num2)); //몫
		System.out.println("num1 % num2 = " + (num1 % num2)); //나머지 (2.66666)이 아닌 2)
		
		System.out.println("------------------------");

		//산술 연산은 반드시 피연산자들의 데이터타입이 같아야 연산할 수 있음
		//산술 연산의 결과값도 피연산자들과 같은 데이터타입을 가짐
	
		System.out.println("16 / 6 = " + (16/6)); //int / int = int
		System.out.println("16.0 / 6.0 = " + (16.0/6.0)); //double / double = double
		
		System.out.println("------------------------");

		System.out.println( (double)num1 / (double)num2 );
//		System.out.println( (double)16 / (double)6 ); //변수값 활용
//		System.out.println( 16.0 / 6.0 ); //double형으로 데이터타입 변환
//		System.out.println( 2.6666666666666665 ); //double형 타입들의 나눗셈 연산
		
		System.out.println("------------------------");

		System.out.println( 11 + 34.56 ); //45.56 -> 11의 double 자동 형변환
		System.out.println( 11 + (int)34.56 ); //45 -> 34.56의 int 강제 형변환
		
		System.out.println("------------------------");

		System.out.println( num1 / (double)num2 ); // int / (double)int
//		System.out.println( 16 / (double)6 ); //변수활용 int / (double)int
//		System.out.println( 16 / 6.0 ); //강제 형변환 int / double
//		System.out.println( 16.0 / 6.0 ); //자동 형변환 double / double
//		System.out.println( 2.6666666666666665 ); //double끼리 나눗셈 연산
		
		System.out.println("----------잘못 사용하는 경우---------");
		
		System.out.println( (double)(num1/num2) );
//		System.out.println( (double)(16 / 6) );
//		System.out.println( (double)(2) );
//		System.out.println( 2.0 );
		
		System.out.println("------------------------");

		double dNum = 3.14;
		
		System.out.println("dNum / 2 = " + (dNum / 2));
		System.out.println("dNum % 2 = " + (dNum % 2));
		
		//** 실수 계산에서는 부동소수점 오차가 발생할 수 있음!
		// -> 0.0000000000000001
		
		
		
		
	}
}

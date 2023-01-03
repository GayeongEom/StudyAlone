package java02_operator;

public class Ternary {
	public static void main(String[] args) {
		
		//삼항 연산자 - 조건
		
		//	조건식 ?	(조건식이 true일 때 반환할 값)	:	(조건식이 false일 때 반환할 값)
		// ** 조건식 - true/false로 판별할 수 있는 연산식
		//----------------------------------------------------------------------------------------
		
		int num1 = 30, num2 = 20;
//		int num1 = 20, num2 = 30;
//		int num1 = 20, num2 = 20;
		
		System.out.println( num1<num2 ? "num1이 작다" : "num1이 작지않다" ); //크다x 작지않을 뿐 크다는 판단은 할 수 없음 ->같을 수도 있는 가능성
		System.out.println( num1<num2 ? "num1이 작다" : "num1이 크거나 같다" ); 
		
		System.out.println("---------------------------------");
		
		String resultText = num1>num2 ? "num1이 크다" : "num1이 크지 않다";
		System.out.println(resultText);
		
		System.out.println("---------------------------------");
		
		//Q. 두 숫자 중에서 큰 숫자를 저장하기
		int result = num1>num2 ? num1 : num2 ;
		System.out.println(result);
		
		
		
		
	
	
	
	
	}

}

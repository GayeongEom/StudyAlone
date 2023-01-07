package java04_control.condition;

public class If_02 {

	public static void main(String[] args) {

		int num = 10;

		if(num == 15) {
			System.out.println("HI"); //if문 false라서 출력x
		}
		System.out.println("Hello"); //if문 밖의 코드라서 출력o

		//----------------------------------------

		//{} 중괄호 블록은 여러 개의 코드를 묶어주는 역할을 함
		//코드 실행 흐름(순서)에 영향을 주지 않음

		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}

		//----------------------------------------
		System.out.println("-----------------------");

		//제어문은 해당 제어문의 다음에 오는 코드 한 개 또는 {} 중괄호 블록 하나에 영향을 줌 
		//제어문의 영향을 받는 코드가 한줄이어도 반드시 {}중괄호를 쓰도록

		if(false)
			System.out.println("코드 111111111"); //실행되지 않음
			System.out.println("코드 222222222"); //실행됨 ->if문의 영향을 받지 않음

		
		
		if(false) {
			System.out.println("코드 111111111"); //실행되지 않음
		}
		System.out.println("코드 222222222"); //실행됨 ->if문의 영향을 받지 않음

		
		
		//----------------------------------------
		System.out.println("-----------------------");

		if(false) { //중괄호 전체가 실행되지 않음
			System.out.println("코드 111111111"); 
			System.out.println("코드 222222222"); 
			
			
		//----------------------------------------
		System.out.println("-----------------------");
		
		//제어문의 ()괄호 다음에 ;을 붙이지 않도록 조심
		if(true); { //()괄호 뒤에 ;(세미콜론)을 붙여 문장을 끝내서 {}중괄호 영역 실행 안됨
			System.out.println("HI");
			System.out.println("HELLO");
			System.out.println("HOLA");
		}
			
			
			
		}

	}







}



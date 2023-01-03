package java02_operator;

public class Binary_04 {
	public static void main(String[] args) {
		
		//이항 연산자 - 논리
		
		// 	&&		||		!
		//  AND		OR		NOT
		
		
		//AND연산은 피연산자 모두가 true일 때 전체 결과가 true
		//OR연산은 피연산자가 둘 중 하나라도 true일 때 전체 결과가 true
		
		//!(NOT) 연산자는 단항 연산자
		//	논리(boolean) 데이터의 관계를 따져서 결과를 부정(반대로 바꿈)
		//	!(논리부정) 연산자의 적용
		//	관계 연산자는 반대 조건으로, 논리연산자는 && -> ||, || -> &&로 서로 치환됨
		
		//-------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true && false : " + (b1 && b2));
		System.out.println("true || false : " + (b1 || b2));
		
		//-------------------------------------------------
		System.out.println("--------------------------");
		
		int num = 77;
		
		System.out.println( num >= 1); //num변수가 1보다 크거나 같다
		System.out.println( num <= 100 ); //num변수가 100보다 작거나 같다
		
		//num변수는 1보다 크거나 같으면서 100보다 작거나 같다 -> num변수는 1~100 사이의 값이다
		System.out.println( (num >= 1) && (num <= 100)); //true
		
		System.out.println("--------------------------");
		
		System.out.println( !((num >= 1) && (num <= 100))); //!true -> false
//		System.out.println( !(num >= 1) !&& !(num <= 100)); 
		System.out.println( num < 1 || num > 100); //false
		
		
		
		
	}

}

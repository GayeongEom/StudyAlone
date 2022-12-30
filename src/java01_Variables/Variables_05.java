package java01_Variables;

public class Variables_05 {
	
	@SuppressWarnings("unused") //unusedError 안보여주셔도 댑니다
	public static void main(String[] args) {
		
		//학생의 나이
//		int student age; //Error, 띄어쓰기 금지
		
		int student_age; //snake case, 뱀 표기법
		int studentAge; //camel case, 낙타 등 표기법
		
		//자바에서는 낙타등표기법(Camel Case)를 권장
		
		//----------------------------------------------------------
		
//		int 1stNumber; //Error, 숫자로 시작할 수 없음
		
		int firstNumber;
		
		//----------------------------------------------------------
		
//		int int; //Error, 예약어(키워드)는 사용할 수 없음

		int intNum;
		int intData;
		
		//----------------------------------------------------------

		//** 의미없는 변수명 사용하지 않도록!
		
		int a;
		int b;
		int c;
		
		//----------------------------------------------------------

		//** 의미없는, 알아보기 힘든 변수명은 사용하지 않도록!
//		int _; //Error

		int $;
		int ____;
		int $_$_$$_$__$$__;
		
		//----------------------------------------------------------

		//** 뚜렷한 목적이 전달되지 않는 변수명 사용하지 말것!
		int _number;
		int number_;
		int $number;
		
		int number1;
		int number2;
		int number3;
		
		//이런 식으로 목적을 알 수 있게 쓰는 것이 좋음
		int outputNumber;
		int printNumber;
		
		//----------------------------------------------------------
		
		//한글로 식별자 설정은 가능하지만 절대! 하지않기!
		double 넓이 = 345.23;
		System.out.println("넓이 : " + 넓이 );
		
		
	}

}

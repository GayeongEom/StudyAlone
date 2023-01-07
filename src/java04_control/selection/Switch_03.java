package java04_control.selection;

public class Switch_03 {
	public static void main(String[] args) {
		
		//switch의 비교대상은 정수로 표현 가능해야 함
		//-----------------------------------------------------

		//에러
//		double d = 3.14;
//		switch( d ) {
//		}
		//-----------------------------------------------------

		//에러
//		boolean b = true;
//		switch( b ) {
//		}

		//-----------------------------------------------------

		char alpha = 'B'; //char형은 정수값(ASCII CODE)으로 처리됨
		
		switch(alpha) {
		case 'A':
			System.out.println("A에요");
			break;
			
		case 'B':
			System.out.println("B요");
			break;
		}
		
		//-----------------------------------------------------

		//switch에서 String타입 사용 가능 -> 안되는 버전도 있으므로 안쓰는 것이 좋음
		//	->JDK 1.7 이상 사용가능
		
		String str = "Banana";
		str = new String("Banana"); //->==연산자로 비교하는지, .equals() 메소드로 비교하는지 알 수 있는 방법
		
		switch(str) { //-> 알아서 .equals()메소드로 비교함
		case "Apple":
			System.out.println("사과");
			break;
		
		case "Banana":
			System.out.println("바나나");
			break;
			
		}
		
		//-----------------------------------------------------

		str = new String("Banana");
		System.out.println("str : " + str);
		
		//**문자열이 같은지 비교할 땐 ==연산자(동등 연산자)를 사용하면 안됨
		//	.equals() 메소드 사용
		if( str == "Banana") { //문자열을 == 로 비교하면 오류 생기는 경우가 있음
			System.out.println("if == 바나나"); //출력 안됨
		}
		
		if( str.equals("Banana")) {
			System.out.println("if equals 바나나"); //출력
		}
		
	}

}

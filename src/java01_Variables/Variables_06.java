package java01_Variables;

public class Variables_06 {
	
	public static void main(String[] args) {
		
		System.out.println( 453432L ); //long형 리터럴 상수
		
		//------------------------------------------------------------
		
		//변수
		int num;
		num = 123;
		num = 345;
		num = 567;
		
		//------------------------------------------------------------

		//변수의 상수화 / 이름있는 상수
		final int MAX; //최대값
		
		MAX = 100;
//		MAX = 200; //Error, 상수화된 변수는 값 대입을 한 번만 수행할 수 있음
		
		//------------------------------------------------------------

		//이름있는 상수는 변수와 구분하기 위해 모두 대문자로 작성
		//이름있는 상수는 단어 구분할 때_(언더스코어)를 사용
		
		final int WORKING_DAY = 20; //근무일 수
		
		System.out.println("이번 달은 " + WORKING_DAY + "일 근무하셨습니다" );
		
		//Error -> 상수값이 함부로 변경되지 않도록 방지해줌
//		WORKING_DAY = 33;
		
		System.out.println("이번 달 급여 : " + 150000*WORKING_DAY );
		
		
	}

}

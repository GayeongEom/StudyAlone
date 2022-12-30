package java01_Variables;

public class Variables_03 {
	
	public static void main(String[] args) {
		
		int number; //변수를 처음 선언하면 "쓰레기값"이 저장되어있음
		
		number = 123; //변수대입 (초기화)
		System.out.println( number );

		
		System.out.println("--------");

		
		int number2 = 787; //선언과 동시에 초기화 -> 쓰레기값이 들어가지 않고 곧바로 초기화됨
		System.out.println( number2 );
	}

}

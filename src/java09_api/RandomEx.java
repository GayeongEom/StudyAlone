package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//java.util.Random 클래스
		
		Random ran; //랜덤 객체 변수
		ran = new Random(); //랜덤 객체 생성
		System.out.println( ran.nextInt() );
		
		System.out.println("----------------------------");
		
		System.out.println( ran.nextInt() ); //약 -21억 ~ 약 21억
		System.out.println( ran.nextBoolean() ); // true 또는 false
		System.out.println( ran.nextDouble() ); //0.0이상 ~ 1.0미만
		
		System.out.println("----------------------------");

		System.out.println(ran.nextInt(100)); //0 ~ 99까지 100개 중 랜덤
		System.out.println(ran.nextInt(100) + 1); //1~100 
		
		System.out.println(ran.nextInt(3) + 6); //0~2 + 6 -> 6~8 / 범위 + 위치조절
		
		System.out.println("----------------------------");

		//10회 반복
		for(int i=0; i<10; i++) {
			
//			System.out.println( ran.nextInt(3) );
			
			switch( ran.nextInt(3) ) {
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				break;
			
			}
			
			
			
			
		}//for문
		
		//가위바위보 게임 만들어보기
		
		
	}

}

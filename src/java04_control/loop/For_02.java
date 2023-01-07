package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {
		
		//반복문에서는 i(iterate, 반복한다) 변수를 많이 사용
		
		for (int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
		
		//i 변수가 0부터 10보다 작은 동안에 1씩 증가하면서 반복
		
		//반복횟수 : 10번
		//반복구간 : 0 1 2 3 4 5 6 7 8 9 ( 0~9 )
		
		System.out.println("-------------------");
		
		int i; //for문 밖에서 i값 확인하기 위해 밖에서 선언
		for(i=7 ; i<13 ; i++) {
			System.out.println(i);
		}
		
		//i 변수가 7부터 13보다 작은 동안에 1씩 증가하면서 반복
		
		System.out.println();
		System.out.println("반복문이 종료된 이후 i 변수의 값 : " + i);
		
	}

}

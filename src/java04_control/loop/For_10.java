package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//Q. 2~9단 구구단 출력
		
		//1. 바깥쪽 for문
		//	->2~9단 반복
		//	->dan, 2~9, x8
		
		//2. 안쪽 for문
		//	->각 단수에서 구구단 반복
		//	->1~9 곱해지는 수
		//	->i, 1~9, x9
		
		//각 단 진행 반복
		for (int dan=2 ; dan<=9 ; dan++) {
			
			//구구단 출력
			for (int i=1 ; i<=9 ;i++) {
				System.out.println(dan + " x " + i + " = " + dan*i );
			}
			
			//구구단 한 번 출력하고 줄바꿈
			System.out.println();
		}
		
		
	}//main end

}//class end

package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		//for문 중첩, 2중 for문
		//	바깥쪽 반복문의 반복 횟수, 반복 구간에 맞춰서
		//	안쪽 반복문의 반복 횟수, 반복 구간을 생각해야 한다
		
		//-----------------------------------
		
		for(int i=0 ; i<3 ; i++) {
			
			for(int j=0 ; j<3 ; j++) {
				System.out.println("i : " + i + ", j : " + j);
			}
		
			System.out.println("--------------");//j 다 출력하고 라인 출력
		}
		
	}
}

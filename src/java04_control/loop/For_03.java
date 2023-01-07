package java04_control.loop;

public class For_03 {
	public static void main(String[] args) {

		for(int num=10 ; num>=1 ; num--) {
			System.out.println(num);
		}
		// num변수가 10부터 시작해서 1보다 크거나 같은 동안 1씩 감소
//		System.out.println(num); //num값 확인
		
		System.out.println("---------------------------");
		
		for(int i=0 ; i<10 ; i+=2) {
			System.out.println(i); //짝수 출력
		}
		//i변수가 0부터 시작해서 10보다 작은동안 2씩 증가
		
		System.out.println("---------------------------");

		for(int i=1 ; i<10 ; i+=2) {
			System.out.println(i); //홀수 출력
		}
		
	}

}

package java04_control.condition;

public class IfElse_03 {
	public static void main(String[] args) {

//		int num = 33;
//		num = 0;
		int num = -3;
		
		if (num>0 && num<=100) {
			System.out.println("num은 1~100 사이의 정수");
		}
		
		System.out.println("-------------------------");
		
		if(num>0) {
			System.out.println("0보다 크다"); //1번째 if의 영향
			
			if(num <=100) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");
			}
			
			System.out.println("0보다 크다"); //1번째 if의 영향
			
		} else {
			System.out.println("0보다 크지 않다");
			System.out.println("0과 같거나 작다");
			
			if(num == 0) {
				System.out.println("0과 같다");
			} else {
				System.out.println("0보다 작다"); //else문의 영향을 받는 {}중괄호 영역 내라서 이 코드도 출력
			}//2번째 else
		}//1번째 else
		
	}

}

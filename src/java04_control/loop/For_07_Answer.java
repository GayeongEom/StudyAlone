package java04_control.loop;

public class For_07_Answer {
	public static void main(String[] args) {


		//Q. 첫날에 10원을 예금하고, -> 예금액 시작 10원 money = 10;
		//   다음날에는 전날의 2배를 -> 20 40 80 160 320  money = money * 2;
		//   예금하는 방식으로
		//   보름(15일) 동안 저축한 금액은? ->15일 동안~ for 조건
		//		-> 327670

		//		Hint/
		//		1. 필요한 데이터 파악 - 변수
		//			-> 몇개? 자료형? 유형? 종류? 목적?
		//					
		//			날짜		int day
		//			예금액		int money
		//			총 금액		int total
		//		

		//		2. 반복 패턴
		//			-> 몇번 반복
		//			
		//			day, 0~14, x15 /day변수를 식에 대입하지 않을 것이므로 0부터 시작해도 됨
		//			

		//		3. 반복에 맞춰 수행해야하는 작업
		//			-> 예금액 2배 증가
		//			-> 총 금액에 추가(저장)
		
		int money = 10; //예금액
		int total = 0; //총금액

		//15일동안 매일 반복
		for(int day=0 ; day<15 ; day++) {
			
			//예금액을 총 금액에 더하기
			total += money;
			
//			System.out.println((day + 1) + "일차 저축액 : " + total + "원");
//			System.out.println("( " + money + "원 입금 )"); //money를 증가시키기 전에 확인
			
			//예금액 2배로 증가시키기
			money *= 2;
//			System.out.println();
		}

		System.out.println("저축한 총 금액 : " + total + "원");

	}

}

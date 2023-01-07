package java04_control.loop;

public class For_07 {
	public static void main(String[] args) {

		//Q. 첫날에 10원을 예금하고,		/오답 ->15일동안 반복만 하면 됨. 굳이 day변수를 식에 써야한다 생각하지 말것
		//   다음날에는 전날의 2배를
		//   예금하는 방식으로
		//   보름(15일) 동안 저축한 금액은?
		//		-> 327670

		//반복횟수 : x 15
		//반복구간 : 1~15

		//반복하면서 수행할 작업(코드) : 
		
		//초기식 : int day = 0 ;
		//조건식 : day < 15 ; 
		//증감식 : day++
		
		int money = 10;
		int total = 0;
		
		for (int day=0 ; day<15 ; day++) {
			
			total = money + total;
			money *= 2;
		
		}
		System.out.println(total);

	}

}

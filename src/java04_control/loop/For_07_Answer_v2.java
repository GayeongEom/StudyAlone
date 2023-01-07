package java04_control.loop;

public class For_07_Answer_v2 {
	public static void main(String[] args) {
		
		//for문의 초기식, 증감식에는 여러 개의 코드를 사용할 수 있음
		//각 코드들은 , 로 구분
		//----------------------------------------------------------------

		int total = 0; //for문 밖에서 선언 및 초기화해야 함
		
		for(int day=0, money = 10 ; day<15 ; day++, total += money, money *= 2 ) ;

		//for문 중괄호 없이 끝
		System.out.println("저축한 총 금액 : " + total + "원"); //for문에서 선언된 변수를 for문 밖에서 사용해서 오류

	}

}

package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {

		//1부터 10까지의 총합 구하기
		//	->55

		int sum = 0; //총합

		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;

		System.out.println("총합 : " + sum);

		System.out.println("--------------------");

		//반복패턴을 찾자!
		//	->어떤 값을 반복적으로 증가(감소) 시킬 것인가

		//반복횟수 : 10번 
		//반복구간 : 1 ~ 10 

		//반복하면서 수행할 작업(코드) : 총합 계산

		//초기식 : int i=1 ;	(i변수 선언, 반복구간의 시작값으로 대입)
		//조건식 : i<=10 ; 		(i변수 검사, 반복횟수보다 작은 조건으로 설정)
		//증감식 : i++ 			(1씩 증가)

		int total = 0;
		
		for(int i=1 ; i<=10 ; i++) { 
			total += i;
//			System.out.println(total); //중간 합계 출력
		}
		System.out.println("최종결과 : " + total);

	}
}

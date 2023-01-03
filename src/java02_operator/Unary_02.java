package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//단항연산자 - 증감
		
		// ++ : 증가연산자
		// -- : 감소연산자
		
		//피연산자로 적용한 변수의 값을 1 증가(감소)시킴
		
		
		int num;
		
		num = 15;
		
		num++; //15 가져온 후 16 저장
		System.out.println("num : " + num); //num : 16
		
		++num; //17로 가져옴
		System.out.println("num : " + num); //num : 17

		System.out.println("-----------------------");
		//-------------------------------------------------
		
		num=15;
		
		num--; //15 가져온 후 14 저장
		System.out.println("num : " + num); //num : 14
		
		--num; //13으로 가져옴
		System.out.println("num : " + num); //num : 13
		
		System.out.println("-----------------------");
		//-------------------------------------------------

		//증감 연산자는 다른 연산식과 함께 사용할 때 적용 위치가 변수의 앞인지 뒤인지에 따라 계산방식이 달라짐
		num=15;
		
		System.out.println( num );
		System.out.println( num-- ); //후위 감소, 후치 감소 / 값을 가져오고 후에 감소
		System.out.println( num );
		
		num=15;
		
		System.out.println( num ); 
		System.out.println( --num ); //전위 감소, 전치 감소 / 값을 먼저 감소시킴
		System.out.println( num );
		
		//전위 증감연산자는 변수의 값을 활용하기 전에 변수의 값을 증감시킴
		//후위 증감연산자는 변수의 값을 활용한 후에 변수의 값을 증감시킴
		
		System.out.println("-----------------------");
		//-------------------------------------------------

		num=13;
		System.out.println( num++ - 10 - ++num ); 
		//계산순서 1. num++ 2. ++num 3. 왼쪽 - 4. 오른쪽 -
		//	num++ : 13을 가져온 후 증가시킴 -> num++값 : 13 / num 현재 : 14
		//	++num : 현재의 num값 14를 증가시킴 -> ++num값 : 15 / num 현재 : 15
		
		System.out.println( num );
		
		//연산 최종 출력 결과?
		//수행 후 num변수의 최종 값?
		
		
		
		
	}

}

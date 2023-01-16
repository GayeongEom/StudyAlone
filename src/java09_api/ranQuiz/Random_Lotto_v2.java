package java09_api.ranQuiz;

import java.util.Arrays;
import java.util.Random;

public class Random_Lotto_v2 {
	
	private Random ran = new Random(); //랜덤 객체
	private int[] lotto = new int[6]; //로또 번호 배열
	
	//랜덤 숫자 (1~45) 6개 생성
	//	-> 중복되지 않는 숫자
	public void generateLotto() {
		
		for(int i=0; i<lotto.length; i++) {
			int num = ran.nextInt(45) + 1; //1 ~ 45난수
			
			//플래그, flag
			boolean isExist = false;
			
			//이전에 배열에 대입한 값들 ^중에서^ 중복값이 있는지 검사
			for(int j=0; j<i; j++) {
				if( lotto[j] == num ) { //중복값을 발견
					isExist = true;
					break;
				}//if
			}//for
			
			
			//중복값이 발견된 경우
			if(isExist) {
				i--; //반복횟수 추가
				continue;
			}//if
			
			
			//랜덤값을 배열에 저장하기
			lotto[i] = num;
			
			System.out.println("--- 생성 도중 ---");
			System.out.println( Arrays.toString(lotto) );
			
		}//for
		
		Arrays.sort(lotto); //배열 정렬
		
		System.out.println("--- 생성 완료 ---");
		System.out.println(Arrays.toString(lotto)); //배열 출력
		
	}//generateLotto
	
	public static void main(String[] args) {
//		generateLotto(); //메인이 static인데 정적인 상태에서 준비가 안되어있음 -> 메소드도 static으로 변경 -> 멤버필드도 static으로 변경해줘야함 -> 할 일이 많아짐
		
		//1.
//		new Random_Lotto_v2().generateLotto();
		
		
		//2. 객체를 5번 생성
//		for(int i=0; i<5; i++) {
//			new Random_Lotto_v2().generateLotto();
//		}
		
		
		//3. 객체를 하나 만들어서 5번 활용
		Random_Lotto_v2 rl = new Random_Lotto_v2();
		for(int i=0; i<5; i++) {
			rl.generateLotto();
		}
		
		
		
		
		
	}//main
	
	
	
	
}//class

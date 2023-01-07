package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz {
	public static void main(String[] args) {
		
//		5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
//		그후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
//
//		- 필요한 배열
//		 1. 각 층의 사는 인원을 담는 배열 arr[6]
//		   // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//		   
//		 2. 각 층의 관리비 배열 arr2[6]
//		   // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
//
//		----------------------- 입력 (입력시 for문을 이용한다.)
//		1층의 사는 인원은 ? 4
//		2층의 사는 인원은 ? 5
//		3층의 사는 인원은 ? 11
//		4층의 사는 인원은 ? 2
//		5층의 사는 인원은 ? 8
//		----------------------- 출력 (출력시 for 문을 이용한다.)
//		1층의 총 관리비 : 48000원
//		2층의 총 관리비 : 60000원
//		3층의 총 관리비 : 132000원
//		4층의 총 관리비 : 24000원
//		5층의 총 관리비 : 96000원
//
//		건물에 사는 총 인원은 30명입니다.
//		관리비의 총 금액은 360000원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		final int man = 12000;
		
		int[] per = new int[6];
		int[] fee = new int[6];
		
		//층별 인원 입력
		System.out.println("- - - 각 층의 인원 입력 - - -");
		for(int i=0; i<per.length-1; i++) {
			System.out.print((i+1) + "층의 사는 인원은? ");
			per[i] = sc.nextInt();
			
			per[per.length-1] += per[i]; //반복문을 사용해 총 인원 수 구하기
		}
		
		//총 인원
//		per[per.length-1] = per[0] + per[1] + per[2] + per[3] + per[4];

		
//		System.out.println(per[per.length-1]);
		
		System.out.println("-----------------");
		
		//층별 관리비 계산
		for(int i=0; i<fee.length-1; i++) {
			fee[i] = per[i]*man;
			
			fee[fee.length-1] += fee[i];
		}
		
		//관리비 출력
		for(int i=0; i<fee.length-1; i++) {
			System.out.println((i+1) + "층의 총 관리비 : " + fee[i] + "원");
			
		}
		
		//총 관리비
//		fee[fee.length-1] = fee[0] + fee[1] + fee[2] + fee[3] + fee[4];
		
		System.out.println();
		
		//total
		System.out.println("건물에 사는 총 인원은 " + per[per.length-1] + "명입니다.");
		System.out.println("관리비의 총 금액은 " + fee[fee.length-1] + "원 입니다.");
		
	}

}

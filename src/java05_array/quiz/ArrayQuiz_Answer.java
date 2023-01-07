package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_Answer {
	public static void main(String[] args) {
		
		//--- 상수 선언 ---
		final int FLOOR = 7; //건물의 층 수
		final int FEE = 15000; //인당 관리비
		
		//--- 필요한 변수 선언 ---
		Scanner sc = new Scanner(System.in);
		
		//각 층 인원 + 총 인원 배열
		int[] people = new int[FLOOR + 1]; //(각 층마다 사는 인원 + 총 인원)을 담을 배열의 공간 필요 -> FLOOR+1
		
		//각 층 관리비 + 총 관리비 배열
		int[] expense = new int[FLOOR + 1]; //(각 층의 관리비 + 총 관리비)를 담을 배열의 공간 필요 -> FLOOR+1
		
		
		//--- 1~5층의 인원 입력 ---
		System.out.println("- - - 각 층의 인원 입력 - - -");
		for(int i=0; i<FLOOR; i++) { //i, 0 ~ FLOOR-1
			System.out.print(" >> " + (i+1) + "층의 인원은? ");
			people[i] = sc.nextInt();
			
			//총 인원 계산
			people[FLOOR] += people[i];
		}
		
		//추가: 총 인원 계산 (반복문을 이용하지 않고 작성됨)
//		people[5] = people[0] + people[1]  + people[2]  + people[3]  + people[4];
		
		//TEST : 층별 인원 + 총 인원 확인
//		for(int i=0; i<people.length; i++) {
//			System.out.println("TEST " + i + " >> " + people[i]);
//		}

		
		//--- 관리비 계산 ---
		for(int i=0; i<people.length; i++) {
			expense[i] = people[i] * FEE;
		}
		
		//TEST : 층별 관리비 + 총 관리비 확인
//		for(int i=0; i<expense.length; i++) {
//			System.out.println("TEST " + i + " >> " + expense[i]);
//		}
		
		
		//--- 전체 출력 ---
		System.out.println();
		System.out.println("- - - 각 층의 관리비 출력 - - -");
		for(int i=0; i<FLOOR; i++) {
			System.out.println(" >> " + (i+1) + "층의 관리비는 " + expense[i] + "원 입니다");
		}
		
		System.out.println();
		System.out.println("총 인원은 " + people[FLOOR] + "명 입니다");
		System.out.println("총 관리비는 " + expense[FLOOR] + "원 입니다");
		
	}
}


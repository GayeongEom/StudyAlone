package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz_Answer {
	public static void main(String[] args) {

		//학생 성적 관리 프로그램
		//	->국영수 3과목 점수

		//	점수 1개		- int

		//	3과목 점수		- int[3]

		//	4명의 학생		- int[4][3]

		//	2개의 학급		- int[2][4][3]

		//	1~3학년			- int[3][2][4][3]

		int[][][][] sco = new int [3][2][4][3];

		//----------------------------------------------

		int[][][] sco1 = new int [2][4][3];
		int[][][] sco2 = new int [2][4][3];
		int[][][] sco3 = new int [2][4][3];

		//----------------------------------------------


		//QUIZ.
		//   2명의 국어, 영어, 수학 점수를 처리하기
		//   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 

		//   ** 2차원배열 이용해보기

		//   int[2][3] - 학생들 점수
		//   int[2] - 학생들 총점
		//   double[2] - 학생들 평균

		//----- 최종 출력 -----
		//   번호   국어   영어   수학   총점   평균
		//   1번      xxx      xxx      xxx      xxx      xxx.xx
		//   2번      xxx      xxx      xxx      xxx      xxx.xx

		Scanner sc = new Scanner(System.in);

		//2명 학생의 3과목 점수 배열
		int[][]score = new int[2][3];

		//2명 학생의 총점 배열
		int[] sum = new int[2];

		//2명 학생의 평균 배열
		double[] avg = new double[2];

		//과목 이름 배열
		String[] subject = { "국어", "영어", "수학" };


		//2명에 대한 3과목 점수 입력
		for(int i=0; i<score.length; i++) { //i번째 학생

			for(int j=0; j<score[i].length; j++) { //j번째 과목
				System.out.print((i+1) + "번째 학생의 " + subject[j] + "점수는? ");
				score[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		//총점 계산하기
		for(int i=0; i<sum.length; i++) { //j번째 과목
			for(int j=0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}

		//평균 계산하기
		for(int i=0; i<avg.length; i++) { //i번재 학생
			avg[i] = sum[i] / 3.0;
		}	

		//최종 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<score.length; i++) { //i번째 학생

			//번호
			System.out.print( (i+1) + "\t" );

			//국영수
			for(int j=0; j<score[i].length; j++) {
				System.out.print( score[i][j] + "\t" );
			}

			//총점
			System.out.print( sum[i] + "\t" );

			//평균
			System.out.printf("%.2f", avg[i]);
			System.out.println();

		}

	}

}

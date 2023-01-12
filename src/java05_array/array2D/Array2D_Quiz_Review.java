package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz_Review {
	public static void main(String[] args) {

		//QUIZ.
		//   2명의 국어, 영어, 수학 점수를 처리하기
		//   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 

		//   ** 2차원배열 이용해보기

		//   int[2][4] - 학생들 점수 + 총점
		//   double[2] - 학생들 평균

		//----- 최종 출력 -----
		//   번호   국어   영어   수학   총점   평균
		//   1번      xxx      xxx      xxx      xxx      xxx.xx
		//   2번      xxx      xxx      xxx      xxx      xxx.xx

		//-------------------------------------------------------------------
		//입력
		Scanner sc = new Scanner(System.in);

		//점수 변수 선언
		int[][] score = new int[2][4];
		double[] avg = new double[2];

		//점수 입력받기
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1 + "번의 점수를 입력하세요"));
			for(int j=0; j<score[i].length-1; j++) { //score[i].length = 4 / 0~3까지 반복
				
				//국영수 입력받기 / 0~2까지만
				score[i][j] = sc.nextInt();

				//총점 저장
				//배열 마지막 칸에 총점 저장하기 / score[i][3]에는 총점이 들어가야함
				//sc[i][3] = sc[i][0] + sc[i][1] + sc[i][2]
				score[i][score[i].length-1] += score[i][j];
			}
		}
		
//		//점수 입력 및 총점 저장 확인
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//					System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//평균 계산
		for(int i=0; i<avg.length; i++) {
			avg[i] = score[i][score[i].length-1] / 3.0;
		}
		
//		//평균 확인 출력
//		for(int i=0; i<avg.length; i++) {
//			System.out.println(avg[i]);
//		}


		//최종출력
		System.out.println("----최종출력----");
		System.out.println("번호 \t국어 \t영어 \t수학 \t총점 \t평균");
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번\t");
			
			for(int j=0; j<score[i].length; j++ ) {
				System.out.print(score[i][j] + "\t"); //국영수, 총점 출력
			}
//			System.out.println(avg[i]); //평균출력 후 줄바꿈
			//평균 소수점 두자리까지만 출력하기
			System.out.printf("%.2f", avg[i]);
			System.out.println();
		}

	}

}

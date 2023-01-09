package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz {
	public static void main(String[] args) {
		
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
		
		int[][] score = new int[2][3];
		int[] sum = new int[2];
		double[] ave = new double[2];
		
		
		//점수
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번 학생의 점수를 입력하세요 ");
			
			for(int j=0; j<score[i].length; j++) {
				
				score[i][j] = sc.nextInt();
			}

		}
		
		System.out.println();

		//총점
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}
		
		
		//평균
		for(int i=0; i<ave.length; i++) {
			ave[i] = sum[i] / 3.0;
		}		
		
		System.out.println();
		System.out.println("----- 최종 출력 -----");
		
		///출력
		System.out.println("번호" + "\t국어" + "\t영어" + "\t수학" + "\t총점" + "\t평균");
		for (int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번" + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum[i] + "\t");
			System.out.println(ave[i]); //평균 소수점 2번째 자리까지 출력해보기
		}
		
		// 총합 출력
//		for(int i=0; i<sum.length; i++) {
//			System.out.println(sum[i]);
//			System.out.println(ave[i]);
//			
//		}
		

		
		
		
		//총점도 배열에 같이 넣어서 풀어보기
		
		
		
		
		
		
		
		
		
	}

}

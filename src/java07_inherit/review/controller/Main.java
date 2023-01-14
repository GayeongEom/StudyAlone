package java07_inherit.review.controller;

import java.util.Scanner;

import java07_inherit.review.model.Circle;
import java07_inherit.review.model.Point;
import java07_inherit.review.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		//원 배열
//		Circle[] cArr = new Circle[3];
//		
//		//좌표 및 반지름 입력받기
//		for(int i=0; i<cArr.length; i++) {
//			
//			System.out.print((i+1) + "번째 원 입력해주세요");
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int r = sc.nextInt();
//			
//			cArr[i] = new Circle(x, y, r);
//			
//		}
//		
//		System.out.println();
//		
//		//출력하기
//		for(int i=0; i<cArr.length; i++) {
//			System.out.println("<" + (i+1) + " 번째 원입니다.>");
//			cArr[i].draw();
//		}
//		
////----------------------------------------------------------------------------------------		
//		
//		//사각형 배열
//		Rectangle[] rArr = new Rectangle[3];
//		
//		//좌표 및 길이, 높이 입력받기
//		for(int i=0; i<rArr.length; i++) {
//			
//			System.out.print((i+1) + "번째 사각형 입력해주세요");
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int w = sc.nextInt();
//			int h = sc.nextInt();
//			
//			rArr[i] = new Rectangle(x, y, w, h);
//			
//		}
//
//		System.out.println();
//		
//		//출력하기
//		for(int i=0; i<cArr.length; i++) {
//			System.out.println("<" + (i+1) + " 번째 사각형입니다.>");
//			rArr[i].draw();
//		}
//		
//----------------------------------------------------------------------------------------		

		//Point형 배열
		Point[] pArr = new Point[5];

		//홀수면 Circle, 짝수면 Rectangle 객체 생성
		for(int i=0; i<pArr.length; i++) {

			if(i%2 == 0) { //짝수라면
				System.out.println("사각형 객체입니다");
				System.out.print((i+1) + "번째 사각형의 요소를 입력해주세요");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int w = sc.nextInt();
				int h = sc.nextInt();
				
				pArr[i] = new Rectangle(x, y, w, h);
				System.out.println();

			} else { //홀수라면
				System.out.println("원 객체입니다");
				System.out.print((i+1) + "번째 원의 요소를 입력해주세요");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int r = sc.nextInt();
				
				pArr[i] = new Circle(x, y, r);
				System.out.println();

			} //else

		}//객체생성 for
		
//		for(int i=0; i<pArr.length; i++) {
//			if(i%2 == 0) {
//				System.out.println("사각형 객체입니다");
//				System.out.print((i+1) + "번째 사각형 입력해주세요");
//				int x = sc.nextInt();
//				int y = sc.nextInt();
//				int w = sc.nextInt();
//				int h = sc.nextInt();
//				
//				pArr[i] = new Rectangle(x, y, w, h);
//				System.out.println();
//				
//			} else {
//				System.out.println("원 객체입니다");
//				System.out.print((i+1) + "번째 원 입력해주세요");
//				int x = sc.nextInt();
//				int y = sc.nextInt();
//				int r = sc.nextInt();
//				
//				pArr[i] = new Circle(x, y, r);
//				System.out.println();
//				
//			}//else
//			
//		}//for
		
		System.out.println("----------------------------------");
		
		//배열 요소 출력
		for(int i=0; i<pArr.length; i++) {
			System.out.println(" + + + [" + i + "] 번 인덱스 객체 + + + ");
			pArr[i].draw();
		}

	}

}

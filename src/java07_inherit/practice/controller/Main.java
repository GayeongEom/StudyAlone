package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle; //패키지가 달라서 임포트를 해줘야 사용가능
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {

//				//원 출력 ok
//				Circle cir = new Circle(1, 2, 3);
//				cir.draw();
//				
//				System.out.println();
//				//사각형 출력 ok
//				Rectangle rec = new Rectangle(2, 3, 4, 5);
//				rec.draw();

		//----------------------------------------------------
		System.out.println("-------------------------------");

		Circle[] cArr = new Circle[3];
		Rectangle[] rArr = new Rectangle[3];
		
		for(int i=0; i<cArr.length; i++) {
//			cArr[i].draw(); //NullPointerExeption
//			rArr[i].draw(); //NullPointerExeption
			cArr[i] = new Circle();
			cArr[i].draw();
			
			System.out.println("-------------------------------");
			
			rArr[i] = new Rectangle();
			rArr[i].draw();
		}
		
		//----------------------------------------------------
		System.out.println("-------------------------------");

		Point[] pArr = new Point[5];
		
		//부모타입 자식 클래스
		pArr[0] = new Circle(4, 5, 9);
		pArr[1] = new Rectangle(3, 4, 5, 9);
		pArr[2] = new Circle(7, 9, 5);
		pArr[3] = new Rectangle(8, 7, 9, 5);
		pArr[4] = new Circle(2, 7, 6);
		
		for(int i=0; i<pArr.length; i++) {
			
			System.out.println("pArr[" + i + "] 출력");
			pArr[i].draw();
			System.out.println("_*_*_*_*_*_*_*_*_*_*_");
		}
		
		
		
		
		


	}//main 끝
}//클래스 끝

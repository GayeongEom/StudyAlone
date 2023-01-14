package java07_inherit.teacher.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
//		Point p0 = new Point();
//		Point p1 = new Point(1,2);
//		Point p2 = new Point(4,5);
//		
//		p0.draw();
//		p1.draw();
//		p2.draw();

		//------------------------------------
		
//		Circle c0 = new Circle();
//		Circle c1 = new Circle(1,2,3);
//		Circle c2 = new Circle(6,7,8);
//		
//		c0.draw();
//		System.out.println("----------");
//		c1.draw();
//		System.out.println("----------");
//		c2.draw();
//		System.out.println("----------");
		
		//------------------------------------

//		Rectangle r0 = new Rectangle();
//		Rectangle r1 = new Rectangle(1,2,3,4);
//		Rectangle r2 = new Rectangle(4,6,7,9);
//		
//		r0.draw();
//		System.out.println("----------");
//		r1.draw();
//		System.out.println("----------");
//		r2.draw();
//		System.out.println("----------");
		
		//------------------------------------
		
//		int[] arr = new int[5];
		
		//Circle배열 [길이 3]
		Circle[] circleArr = new Circle[3];

		//Circle 객체 생성 (인스턴스)
		circleArr[0] = new Circle();
		circleArr[1] = new Circle(5,6,7);
		circleArr[2] = new Circle(7,5,9);
		
		for(int i=0; i<circleArr.length; i++) {
			System.out.println(" - - - " + (i+1) + "번째 원 - - -");
			circleArr[i].draw();
			System.out.println();
		}
		
		System.out.println(" = = = = = = = = = = = = =");
		System.out.println();
		
//		Rectangle[] rectArr = new Rectangle[3];
//		Rectangle[] rects = new Rectangle[3];
		
		Rectangle[] rects = {
			new Rectangle(),
			new Rectangle(2,3,4,5),
			new Rectangle(9,22,5,2)
		};
		
		for(int i=0; i<rects.length; i++) {
			System.out.println(" - - - " + (i+1) + "번째 사각형 - - -");
			rects[i].draw();
			System.out.println();
		}
		
		System.out.println(" = = = = = = = = = = = = =");
		System.out.println();
		
		// for each 구문
		
		int[] arr = {1,2,3,4,5};
		
		for( int n : arr ) {
			System.out.println( n );
		}
		
		System.out.println("-----");
		
		double[] dArr = { 1.1, 2.2, 3.3, 4.4 };
		
		for( double n : dArr ) {
			System.out.println(n);
		}
		
		System.out.println(" = = = = = = = = = = = = =");
		System.out.println();
		
		for( Circle c : circleArr ) {
			c.draw();
		}
		
		System.out.println(" = = = = = = = = = = = = =");
		System.out.println();

		for( Rectangle r : rects ) {
			r.draw();
		}
		
	}
}

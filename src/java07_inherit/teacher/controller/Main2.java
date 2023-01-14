package java07_inherit.teacher.controller;

import java.util.Iterator;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main2 {
	public static void main(String[] args) {
		
//		* 구현내용
//		1. Point 형 객체 배열 선언, 생성 : 5개
//		2. 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
//		3. for 문 사용 : draw() 메소드 실행함
		//---------------------------------------------------------

		Point p1 = new Point();
		
		//부모타입변수에 자식타입객체 대입
		Point p2 = new Circle();
		Point p3 = new Rectangle();
		
		//---------------------------------------------------------
		
		Point[] points = new Point[5];
		
		points[0] = new Circle();
		points[1] = new Rectangle();
//		points[2] = new Rectangle(5,2,7,3);
		points[3] = new Circle(5,67,6);
		points[4] = new Rectangle(4,2,8,8);
		
		//---------------------------------------------------------
		
		for (Point point : points) {
			System.out.println(point);
		}
		
		System.out.println("---------------");
		
		for (Point point : points) {
			if( point != null ) {
				point.draw();
				
			} else {
				System.out.println("(비어있음)");
				
			}
			
			System.out.println("-----");
		}
		
	}
}

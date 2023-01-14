package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main_Review {
	public static void main(String[] args) {
		
		//Circle배열 초기화 및 메소드 출력
		Circle[] cArr = new Circle[3];
		
		cArr[0] = new Circle();
		cArr[1] = new Circle(5, 6, 7);
		cArr[2] = new Circle(7, 5, 9);
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i].draw();
			System.out.println();
			
		}
		
		System.out.println("=======================");
		
		//Rectangle배열 초기화 및 메소드 출력
		Rectangle[] rArr = { //배열의 선언 및 값대입 한번에
				new Rectangle(),
				new Rectangle(2, 3, 4, 5),
				new Rectangle(9, 22, 5, 2)
		};
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i].draw();
			System.out.println();
			
		}
		
		System.out.println("============for each===========");

		//for each구문 활용해보기
		for(Circle c : cArr) {
			c.draw();
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for(Rectangle r : rArr) { //변수에 배열의 모든 요소 하나씩 대입하면서 코드 실행
			r.draw();
			System.out.println();
		}
		
		System.out.println("===========부모객체============");
		
		Point[] pArr = new Point[5];
		
		pArr[0] = new Circle();
		pArr[1] = new Rectangle();
//		pArr[2] = new Rectangle(5,2,7,3); //배열 하나를 지우면 이 안에는 null값이 들어있음
		pArr[3] = new Circle(5,67,6);
		pArr[4] = new Rectangle(4,2,8,8);
		
//		for(int i=0; i<pArr.length; i++) {
//			pArr[i].draw();
//			System.out.println();
//		}
//		
//		System.out.println("============for each===========");
//
//		for(Point p : pArr) {
//			p.draw();
//			System.out.println();
//		}
		
		//null값이 있다면 이를 제외하고 나머지 출력하기
		
		for(Point p : pArr) {
			if(p != null) {
				p.draw();
				System.out.println();
			} else {
				System.out.println("empty");
				System.out.println();
			}
			
		}
		
	}

}

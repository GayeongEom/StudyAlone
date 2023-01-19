package java11_generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		//클래스를 정의할 때 제네릭타입을 적용할 수 있음
//		public class java.util.ArrayList<E> { // ->클래스 내부 코드에서 E를 자료형처럼 사용할 수 있음
//		
//		}
		//	-> 제네릭 클래스
		
		//---------------------------------------------------------------------
		
		//** 타입 파라미터, Type Parameter
		//	-> 일반화시켜 적용한 데이터타입
		//	-> 특정 자료형으로 결정되기 전 상태의 데이터타입(일반화)
		
		//ArrayList의 타입 파라미터 E를 String으로 결정하면서 객체변수 선언
		ArrayList<String> list;
		
		//타입파라미터를 결정하지 않으면 "raw type"이라고 함
		//	->Object타입으로 자동결정된 것
		ArrayList list2;
		
		//---------------------------------------------------------------------

		//타입 파라미터를 String으로 결정
		ArrayList<String> list3;
		list3 = new ArrayList<String>();
//		list3 = new ArrayList();
//		list3 = new ArrayList<>();
		//다 조금씩 다름

		list3.add("Apple");
		list3.add("Banana");
//		list3.add(100); //Error, int형은 들어갈 수 없게 됨
		
		//---------------------------------------------------------------------

		//제네릭타입으로 기본형 타입 사용할 수 없음
		
//		ArrayList<int> list4;
		ArrayList<Integer> list5;
		list5 = new ArrayList<Integer>();
		
		//---------------------------------------------------------------------

		//객체변수를 선언 및 생성하는 코드에서는 제네릭타입을 생략하고 <>만 적어도 됨
		//	->JDK 1.7이상 가능
		ArrayList<String> list6 = new ArrayList<>();
		ArrayList<Integer> list7 = new ArrayList<>();
		
		Iterator<Integer> iter = list7.iterator();
		
	}

}

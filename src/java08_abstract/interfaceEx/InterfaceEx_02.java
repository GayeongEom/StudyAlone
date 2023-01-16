package java08_abstract.interfaceEx;

import java08_abstract.interfaceEx.multiple.Child;
import java08_abstract.interfaceEx.multiple.Inter_01;
import java08_abstract.interfaceEx.multiple.Inter_02;
import java08_abstract.interfaceEx.multiple.Parent;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child(); //패키지가 달라서 임포트 필요
		c.out();
		System.out.println("-----------------");
		
		Parent p = new Parent(); //패키지가 달라서 임포트 필요
		p.out();
		
		Parent pc = new Child();
		pc.out(); //동적바인딩 -> 자식 클래스의 메소드를 호출
		System.out.println("-----------------");

		//** extends한 클래스는 부모 데이터타입이 됨
		//**implements한 인터페이스는 부모 데이터타입이 됨
		
		Inter_01 i01; //인터페이스 객체변수
		i01 = new Child(); //자식 객체 생성
		
		i01.out(); //인스턴스로 동적바인딩
		System.out.println("-----------------");

		Inter_02 i02 = new Child();
		i02.out();
		
	}
}

//** 자바는 다중상속을 금지
//	-> extends 키워드로 한 개의 클래스만 상속받을 수 있음

//class P1 {
//	public void display() {
//		System.out.println("P1");
//	}
//	
//}
//
//class P2 {
//	public void display() {
//		System.out.println("P2");
//	}
//}
//
//
////에러, 다중상속
//class Children extends P1, P2 {
//	@Override
//	public void display() {
//		//P1, P2 부모클래스 중 어떤 메소드를 상속받아야 하는가?
//		//	->결정할 수 없음
//	}
//}


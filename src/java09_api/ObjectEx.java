package java09_api;

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println( obj.getClass() );
		
		//obj 객체의 클래스 정보를 확인할 수 있음
		Class classInfo = obj.getClass();
		
		//---------------------------------------------------------------------
		System.out.println("-----------------------");
		
		//Object 객체 출력
		System.out.println( obj );
		
		Point p1 = new Point(10, 20);
		System.out.println(p1);
		System.out.println(p1.toString());
		
		//** System.out.println( 객체 );
		//	-> 객체의 .toString()을 자동으로 호출
		
		//---------------------------------------------------------------------
		System.out.println();
		System.out.println("----------equals()-------------");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2; //얕은 복사
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		//== 연산자 비교
		//	-> 동일성 비교, Identity
		//	-> 같은 객체인지 비교
		//	-> 참조값이 같은지 비교(같은 인스턴스인지, 저장된 곳이 같은지)
		//	-> 객체변수에 저장된 값(참조값)을 비교
		System.out.println("p2==p3 : " + (p2==p3)); //false, 동일하지 않음
		System.out.println("p2==p4 : " + (p2==p4)); //true, 동일함
		
		//equals() 메소드 비교
		//	-> 동등성 비교, equality
		//	-> 객체의 값(인스턴스 변수 값)이 같은 값인지 비교
		//	-> 개발자가 재정의하여 인스턴스 변수의 값을 비교하도록 수정하여 사용
		System.out.println();
		System.out.println("p2.equals(p3) : " + p2.equals(p3)); //false
		System.out.println("p2.equals(p4) : " + p2.equals(p4)); //true
		
		//p2.equals(p3) 호출코드
		//
		
		
		
		
	}
}

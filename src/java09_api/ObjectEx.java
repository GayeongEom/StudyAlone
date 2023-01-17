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
		System.out.println("p2.equals(p3) : " + p2.equals(p3)); //true
		System.out.println("p2.equals(p4) : " + p2.equals(p4)); //true
		
		//---------------------------------------------------------------------
		System.out.println();
		System.out.println("----------hashCode()-------------");

		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println();
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		System.out.println("s1==s2 : " + (s1==s2)); //false / 인스턴스 위치가 같은지 확인 -> 해시값 비교
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); //true / 동등성 비교
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		//문자열에 대한 해시값 -> Apple끼리 같은 해시값을 가짐 / 동등할 경우 같은 해시값을 가지도록
		
		//---------------------------------------------------------------------
		System.out.println();
		System.out.println("----------clone()-------------");
		
		Point pOriginal = new Point(33,44);
		
		//얕은 복사 -> 참조값만 복사 / 한 인스턴스로 두 변수 참조
		Point pClone1 = pOriginal;
		
		//깊은 복사
		Point pClone2 = new Point(pOriginal.getX(), pOriginal.getY());
		
		//clone()을 이용한 깊은 복사
		try {
			
			Point pClone3 = pOriginal.clone();
		
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		
		} 
		//Type mismatch: cannot convert from Object to Point ->  자동 형변환이 안된다는 경고
		//Unhandled exception type CloneNotSupportedException -> 다루지 못하는 예외가 있다는 경고
		
		//예외를 없애주기 위해 try-catch 구문 사용
		
	}

}
package java08_abstract.interfaceEx;

public class InterfaceEx_01 {
	public static void main(String[] args) {
		
		//인터페이스의 상수 필드
		System.out.println(TestInterface.NUM1); //정적으로 만들어짐 -> static 상수
		System.out.println(TestInterface.NUM2);

		//인터페이스를 상속받은 클래스의 상수필드
		System.out.println(Test2.NUM3);
		
		//인터페이스를 상속받은 클래스의 상수필드
		System.out.println(Test3.NUM4);
		
//		Test3.NUM5=1; //final 상수라서 값 변경 불가
		
		
	}

}

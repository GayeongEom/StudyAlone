package java06_class.defaultTest;

import java06_class.Class_02; //자동완성으로 작성하게 하는 것이 좋음
//import 자동완성 단축키 ctrl + shift + o

public class Main_02_defaultTest {
	public static void main(String[] args) {
		
		Class_02 cl = new Class_02();
		
		System.out.println( cl.num4 ); //public
		
//		System.out.println(cl.num3); //protected
//		System.out.println(cl.num2); //default -> 다른 패키지여서 값을 불러올 수 없음
//		System.out.println(cl.num1); //private
		
		
		
	}

}

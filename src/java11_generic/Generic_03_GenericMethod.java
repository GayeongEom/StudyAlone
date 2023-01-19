package java11_generic;
	
//일반 클래스에 제네릭 메소드
class Class03 {
	
	//일반 메소드 -> <T> -> 제네릭 메소드
	public <T> void display(int num) {
		int data;
		
	}
	
	//제네릭 메소드
	//	-> return 타입, 매개변수 타입, 지역변수 타입
	public <T> T out (T obj) {
		T data = obj;
		
		return data;
	}
	
}


//---------------------------------------------------------------
public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		//일반 클래스 생성
		Class03 cl = new Class03();
		
		//타입 파라미터를 결정하지 않고 호출
		//	-> 매개변수 전달인자의 타입을 보고 Integer로 자동 결정
		cl.out(12345);
		
		cl.<String>out("HI");
		

//---------------------------------------------------------------

		//에러, T -> Double 결정 후 호출
//		cl.<Double>out(33333);
		
		cl.<Double>out(5.76);
		
	}
}

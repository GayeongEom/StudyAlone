package java06_class.method;

//실행클래스
public class MethodEx { //Executor 실행기의 약자
	public static void main(String[] args) { //arguments
		
		//객체 생성
		Method_01 m01 = new Method_01();
		
		m01.method();
		System.out.println("---------------------");
		
		System.out.println("뺄셈 결과 : " + m01.sub(3, 2));
		//m01.sub(3,2) 자체가 결과값으로 치환됨
		
	}

}

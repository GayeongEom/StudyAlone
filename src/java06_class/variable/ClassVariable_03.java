package java06_class.variable;

//기능클래스
public class ClassVariable_03 {
	
	//----멤버필드----
	private int num1 = 777; //인스턴스 변수
	private static int num2 = 888; //클래스 변수
	
	
	//---일반 멤버 메소드---
	public void method() {
		
//		int num1;
//		int num2;
		
		System.out.println(num1); //인스턴스 변수 출력
		System.out.println(num2); //클래스 변수 출력
		//변수가 메소드 내에 있는지(가까운 중괄호 내에 있는지) 먼저 살펴보고, 없으면 한단계 넓혀서 클래스로 살펴봄
		//if) 메소드 내에 같은 이름의 num1, num2 변수가 있었다면 그 변수가 연결되었을 것
		
		//----------------------------------------------------------
		
		int num1 = 101; //지역변수
		int num2 = 202; //지역변수
		
		System.out.println("-----------------");
		System.out.println(num1); //지역변수 출력
		System.out.println(num2);  //지역변수 출력
		//클래스 영역에서 선언된 num1, num2보다 가까운 메소드 내에 있는 num1, num2변수와 연결
		
		//----------------------------------------------------------

		System.out.println("-----------------");

		//**this : 자기 객체 참조(인스턴스 자신이 자신을 지칭할 때 사용)
		//**this.멤버 형식으로 항상 멤버필드 또는 멤버메소드를 지칭할 수 있음
		//		-> 같은 이름의 더 가까운 지역변수를 건너뛰고 클래스에서 선언된 멤버필드, 멤버 메소드 호출가능
		
		System.out.println(this.num1); //일반 멤버필드
//		System.out.println(this.num2); //this는 인스턴스변수를 호출하는 것인데 현재 num2는 클래스 변수이므로 this로 호출시 경고
		
		System.out.println(ClassVariable_03.num2); //정적 멤버필드
		//클래스 변수는 static한 방식으로 접근
		
	}
	

}

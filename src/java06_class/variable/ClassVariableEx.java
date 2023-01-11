package java06_class.variable;

public class ClassVariableEx {
	public static void main(String[] args) {
		
		ClassVariable_01 cv01 = new ClassVariable_01();
		
		ClassVariable_01 cv02 = new ClassVariable_01();
		
		ClassVariable_01 cv03 = null;
		
		//** null 키워드, 널, 눌
		//	참조형 데이터의 기본값
		//	참조하고 있는 대상이 없음을 나타냄
		
		cv01.setNum(12345);
		System.out.println(cv01.getNum());
		System.out.println(cv02.getNum());
		//인스턴스 변수라서 각각 생성된 객체 내에서 따로 존재하므로 서로 영향 없음
		
		//NullPointerExeption
//		System.out.println(cv03.getNum()); //문법적으로는 맞지만 참조할 것이 없으므로 오류
		//cv03에는 객체생성 없이 null값을 대입했으므로 참조할 객체가 없음
		
		System.out.println();
		System.out.println("----클래스 변수 테스트----");
		
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		//city 변수는 static으로 제한하여 생성되는 모든 객체에서도 단 하나만 존재
		//	-> 어떤 객체에서 값을 변경하면 모든 객체에 똑같이 반영됨
		
		cv04.city = "Busan";
		
		System.out.println("-------------------");
		System.out.println(cv04.city); //static 변수는 static 방식으로 접근해야 한다
		System.out.println(cv05.city); //static 변수는 static 방식으로 접근해야 한다
		
		//클래스 변수(정적변수)를 정적인 방법으로 접근하기
		ClassVariable_02.city = "Incheon";
		System.out.println(ClassVariable_02.city);
		
		
	}

}

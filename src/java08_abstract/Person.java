package java08_abstract;

//부모 클래스

//추상클래스 ->	객체를 생성할 수 없는 클래스 / 인스턴스화 할 수 없음
public abstract class Person {
	
	protected String name; //이름
	
	public Person(String name) {
		this.name = name;
	}
	
	//추상메소드 - 실행할 수 없는 메소드 / 당연함 실행할 부분이 없음
	public abstract void display(); //abstract를 붙여 중괄호 생략하고 ; 으로 끝
	
}


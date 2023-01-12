package java07_inherit;

//부모 클래스
class Parent {
	
	//멤버필드
	String name;
	int num;
	
	//멤버 메소드
	public void display() {
		System.out.println("부모 클래스 메소드");
	}
}

//--------------------------------------------------------------------------------------------------------------

//자식 클래스
class Child extends Parent {
	
	//멤버 필드
	int score;
	
	//멤버 메소드
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}

	
	@Override //@annotation 오버라이딩 어노테이션 -> 오버라이딩 조건에 맞는지 검사해줌
	public void display() { 
		System.out.println("오버라이딩 메소드");
	}
	//부모클래스의 display() 메소드를 상속받아 재정의한 메소드
	//	->오버라이딩, Overriding / 오버로딩과 다름
	//오버라이딩을 통해 접근제한자 범위를 좁힐 수 없음 -> 넓히는 것은 가능

	
	//	@Override //자동완성으로 작성한 오버라이딩 코드 / ctrl + space
//	public void display() {
//		super.display(); //최초의 형태(부모의 메소드)를 호출하기 위해 자동추가됨
//	}
	//super. 상속을 준 부모객체를 참조 / 자식클래스에서 부모클래스의 멤버에 접근
	
	public void display(int n) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드");
	}

// 자동완성으로 생성자 작성시 부모클래스의 디폴트 생성자를 호출하는 super(); 자동 생성
	//직접 생성자를 작성하는 경우에도 제일 첫 줄에 super();가 생략으로 자동 추가됨
//	public Child(int score) {
//		super();
//		this.score = score;
//	}

}


//--------------------------------------------------------------------------------------------------------------


//실행클래스
public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent(); //default 생성자가 있음
		p.name = "Alice"; //멤버필드가 default이기 때문에 setter없이 값 저장 가능
		p.num = 123;
		p.display();
		
		System.out.println("-------------");
		
		Child c = new Child();
		c.name = "Bob"; //상속받은 필드
		c.num = 456; //상속받은 필드
		c.display(); //자식에서 재정의한 상속받은 메소드
		
		c.score = 99; //자식 클래스의 고유 멤버필드
		c.print(); //자식 클래스의 고유 멤버메소드
		
		System.out.println("-------------");

		c.display(10); //재정의한 상속받은 메소드를 오버로딩한 메소드
		
	}

}

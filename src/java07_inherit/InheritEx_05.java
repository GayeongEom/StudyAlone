package java07_inherit;

class Parent5 {
	
	//멤버 메소드
	public void display() {
		System.out.println("부모클래스");
	}
	
	
}


//--------------------------------------------------------------------------------------------------


//final 클래스는 자식 클래스를 만들지 못함
class Child5 extends Parent5 {
//final class Child5 extends Parent5 {
	
	//오버라이딩을 안했어도 상속받은 것이 있었을 것 / 자동으로 상속받은 오버라이딩은 같은 작동을 구현
	//->오버라이딩을 한 이유는 구현부를 다르게 작성하기 위해서임
	
	//final 메소드는 더이상 오버라이딩 되지 않음
	@Override
	public final void display() { //final의 영향은 자식에게로만 감 / final - 상속은 되지만 오버라이딩이 안됨
		System.out.println("자식 클래스에서 오버라이딩");
	
	}
	
}


//--------------------------------------------------------------------------------------------------


class GrandChild extends Child5 {
	//Child의 메소드를 상속받았을 것
	
//	@Override
//	public void display() {
//		super.display(); //Child5의 메소드
//		//상속은 딱 한 단계 위의 부모까지만이고 그 위로는 영향을 받지 않음. GrandChild의 super는 부모인 Child5
//	}

//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	
//	} //	->Child5 display()에 final을 지우면 오버라이딩 하여 "2번 재정의된 메소드" 출력
	
	
	//메소드를 지워도 상속받은 메소드가 있어서 실행됨
	
}


//--------------------------------------------------------------------------------------------------


public class InheritEx_05 {
	public static void main(String[] args) {
		
		new GrandChild().display(); //한번 사용하려면 변수가 필요하지 않음
		
	}

}



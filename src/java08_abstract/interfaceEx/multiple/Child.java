package java08_abstract.interfaceEx.multiple;

//자바는 다중상속이 안되도록 차단
public class Child extends Parent implements Inter_01, Inter_02 {

	//같은 헤드가 3개지만 구현된 것은 1개
	@Override
	public void out() {
		System.out.println("자식 클래스");
	}
	//	->클래스상속 오버라이드라고 떠도 인터페이스타입 변수 선언 및 자식객체 생성 후 메소드 호출시 정상 작동
	
}

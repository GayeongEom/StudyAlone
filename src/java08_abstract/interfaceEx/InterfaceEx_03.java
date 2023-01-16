package java08_abstract.interfaceEx;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

//인터페이스끼리 상속할 땐 extends 키워드를 사용
//	->다중상속 가능
interface InterC extends InterA, InterB { //인터페이스끼리 extends는 여러개 가능 -> 구현부가 하나도 없어서 충돌날 부분이 없음
	public abstract void getC();
}
//-> implements InterC만 해도 getA, B 같이 들어옴 

//class Children implements InterA, InterB, InterC {
class Children implements InterC {
	@Override
	public void getA() {
		
	}
	@Override
	public void getB() {
		
	}
	@Override
	public void getC() {
		
	}

}
//** 클래스가 클래스를 상속받을 때 extends
//** 인터페이스가 인터페이스를 상속받을 때 extends

//** 클래스가 인터페이스를 상속받을 때 implements

//interface T1 extends InterfaceEx_03 {
//	//The type InterfaceEx_03 cannot be a superinterface of T1; a superinterface must be an interface
//}
//	-> InterfaceEx_03은 현재 클래스 이므로 인터페이스의 부모가 될 수 없음
public class InterfaceEx_03 {

}

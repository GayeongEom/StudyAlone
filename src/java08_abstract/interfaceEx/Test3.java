package java08_abstract.interfaceEx;

public class Test3 extends TestClass implements TestInterface { //extends는 하나만 상속받을 수 있고 implements는 여러개 가능

	//---TestInterface에서 상속---
	@Override
	public void out() {
	}

	@Override
	public void dispaly() {
	} 
	//------------------------------
	
	//---TestClass에서 상속---
	@Override
	public void method1() {
	}
	
	@Override
	public void method2() {
	}
	//----------------------------
	
}

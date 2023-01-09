package java06_class;

//일반 클래스
//기능 클래스
//	메인 메소드가 없는 클래스 -> 스스로 프로그램을 시작할 수 없는 클래스
public class Class_01 {

	//멤버 필드, Member Field -> 선언한다
	//	객체의 데이터, 정보, 속성을 추상화한 것
	//	변수 또는 상수
	int num;
	String data;
	
	//멤버 메소드, Member Method -> 정의한다
	//	객체의 기능, 행위, 동작을 구현
	//	기능하나 = 메소드 하나 / 메소드의 묶음 = 클래스
	public void display() {
		System.out.println("dislay() 메소드 사용(호출, call)"); //수행코드는 메소드 안에서만 적을 수 있음
	}
	
}

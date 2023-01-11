package java06_class.overloading;

//실행 클래스
public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
		
		System.out.println("----display()----");
		ol.display(); //display() 메소드 호출, 멤버필드는 대입된 값이 없으므로 new로 인해 기본값으로 초기화되어 0, 0 출력
		
		ol.setX(33);
		ol.setY(78);
		ol.display();
		
		System.out.println("----display(111, 222)----");
		ol.display(111,222);
		
		
		//disply() 메소드 오버로드
		
	}

}

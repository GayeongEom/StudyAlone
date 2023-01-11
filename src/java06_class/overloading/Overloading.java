package java06_class.overloading;

//기능 클래스
public class Overloading {
	
	//멤버필드
	private int x;
	private int y;
	

	//멤버메소드
	public void display() { //멤버필드 x, y를 콘솔에 출력하는 기능
		System.out.println("(" + x + ", " + y + ")");
		
	}

	//----Getters, Setters----
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	//----Getters, Setters----

	//멤버필드 x, y에 값을 저장하고 콘솔에 출력하는 기능
	public void display(int x, int y) {		//-> display() 오버로딩
//		this.x = x;
//		this.y = y;
		this.setX(x); 
		//setX(int x) 자체가 this.x=x; 코드이므로 setX 메소드를 호출하여 값 저장
		this.setY(y);
		//set(int y) 자체가 this.y=y; 코드이므로 setY 메소드를 호출하여 값 저장
		
//		System.out.println("(" + x + ", " + y + ")");
		display();
	}
	
	//--- 오버로딩 테스트 메소드 ---
	public void display(int num) { }
//	public void display(int value) { } // 자료형이 같으면 매개변수 이름이 달라도 오버로딩x
//	private void display(int num) { } // 접근제한자가 다른건 오버로딩의 조건에 해당하지 않음
//	public int display(int num) {    // 반환타입이 다른건 오버로딩의 조건에 해당하지 않음
//		return 0;
//	}
	
	public void display(double num) { }
	public void display(int num, String data) { } //다른 메소드
	public void display(String data, int num) { } //다른 메소드
	
}

package java08_abstract;

//자식클래스

//교수
public class Professor extends Person{
	
	private String major; //전공

	//작성하지 않아도 자동으로 추가될 디폴트 생성자
//	public Professor() {
//		super(); -> 현재 부모클래스의 디폴트 생성자가 없어서 오류
//	}
	
	//Person은 객체 생성을 못해 초기화가 불가능하므로 (원래는 인스턴스를 생성하면서 생성자로 초기화)
	//자식 클래스의 생성자를 통해 부모의 멤버필드를 함께 초기화하도록
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	// ->자식클래스의 생성자를 통해 부모멤버(name)과 자기 멤버(major) 초기화

//	public void print() {
//		System.out.println("[교수]" + name + ", " + major + "");
//	} -> 같은 기능을 하는 메소드를 굳이 여러개 만들 필요 없이 오버라이딩하여 사용
	
	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + major + " 전공");
	}
	
}

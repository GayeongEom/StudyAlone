package java08_abstract;

//자식클래스

//학생
public class Student extends Person{
	
	private String subject; //수강과목

	//생성자 자동추가
	public Student(String name, String subject) { //자식의 생성자를 통해 부모 멤버필드 함께 초기화
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("[학생] " + name + ", " + subject + " 수강");
	} 

}

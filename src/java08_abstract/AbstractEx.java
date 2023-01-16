package java08_abstract;

public class AbstractEx {
	public static void main(String[] args) {
		
		Professor pf = new Professor("Alice", "컴퓨터");
		Student st = new Student("Bob", "자바");
		
		pf.display();
		st.display();
		
		System.out.println("--------------------------");
		
		//변수의 타입은 웬만하면 부모타입으로 하고 안되거나 세분화해야하는 경우 자식타입으로 하기
		Person p1 = new Professor("Clare", "인공지능");
		Person p2 = new Student("Dave", "알고리즘");
		
		p1.display();
		p2.display();
		
		System.out.println("--------------------------");
		
		//추상클래스 타입 변수선언 가능
		Person p;
		//에러, 객체생성은 불가
//		p = new Person("Edward");
		
	}

}

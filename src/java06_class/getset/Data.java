package java06_class.getset;

//기능 클래스
public class Data {

	//멤버 변수
	private int num; //번호
	private String name; //이름
	private String phone; //전화번호
	
	//private인 변수에 값을 저장 및 활용하기 위해서는 getter setter 메소드가 필요
	
	//Setter 메소드
	public void setNum(int num) {
		this.num = num; //this가 멤버를 지칭하게 됨
	}
	
	//Getter 메소드
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Getter, Setter 만드는 단축키 : alt + s, r
	//(퀵메뉴를 이용할 땐 alt대신 alt + shift 이용)
	//alt + shift + s,  r
	//alt + a, r
	
}

package test.secondTest;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private String address;
	private String phone;
	private char gender;

	//디폴트 생성자
	public User() {
		super();
	}

	//매개변수 두개 생성자
	public User(String userId, String userPwd) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
	}

	//매개변수 생성자
	public User(String userId, String userPwd, String userName, String address, String phone, char gender) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
	}

	//메소드
	public void print() {
		
		System.out.println("ID : " + userId);
		System.out.println("Password : " + userPwd);
		System.out.println("User name : " + userName);
		System.out.println("adress : " + address);
		System.out.println("Phone : " + phone);
		System.out.println("Gender : " + gender);
		
	}


	//게터세터 안써서 10점 감점

}

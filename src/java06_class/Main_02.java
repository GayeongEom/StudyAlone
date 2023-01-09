package java06_class;

//실행 클래스
public class Main_02 {
	public static void main(String[] args) {
		
		Class_02 cl = new Class_02();
		
		System.out.println(cl.num4); //public
		System.out.println(cl.num3); //protected
		System.out.println(cl.num2); //default

		//공개범위에 맞지않는 멤버를 사용하면 " is not visible"에러
//		System.out.println(cl.num1); //private -> 외부인 Main 클래스에서 보려고 해서 제한됨
		
		//private : 개인적인, 사적인
		//	->객체 내부에서만 사용 가능한 공개 범위로 설정

	}

}

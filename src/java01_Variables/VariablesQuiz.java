package java01_Variables;

public class VariablesQuiz {
	
	public static void main(String[] args) {
		
		String name = "Ddoddo";
		int age = 6;
		char sex = '여';
		double height = 65.8;
		
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
		System.out.println("성별 : " + sex );
		System.out.println("키 : " + height + "cm" );
		
		System.out.println("-------------------------");
		
		//**필요한 데이터
		//이름, 나이, 성별, 키
		
		//1. 변수에 알맞은 타입을 골라
		
		//이름 - 문자열 String
		//나이 - 정수 int
		//성별 - 단일문자 char, 문자열 String
		//키 - 실수 double
		
		//2. 선언하고
		
		String name2; //이름
		int age2; //나이
		char gender;
		String gender2; //성별
		double height2; //키
		
		//3. 대입한 후 
		
		name2 = "김개똥";
		age2 = 29;
		gender = '여';
		gender2 = "남자";
		height2 = 178.5;
		
		//4. 모든 변수의 데이터를 출력해보자

		System.out.println("이름 : " + name2);
		System.out.println("나이 " + age2);
		System.out.println("성별 " + gender);
		System.out.println("성별 " + gender2);
		System.out.println("키: " + height2);
		
		System.out.println("-------------------------");
		
		//한 줄에 모든 요소 출력하기 -> 가독성이 떨어짐
		System.out.println("이름 : " + name2 +", 나이 : " + age2 + ", 성별 : " + gender2 + ", 키 : " + height2);
		
		
		System.out.println("-------------------------");
		
		//print 사용해서 가독성 있으면서 한 줄에 모든 요소 출력하기
		System.out.print("이름 : " + name2);
		System.out.print(", 나이 : " + age2);
		System.out.print(", 성별 : " + gender2);
		System.out.println(", 키 : " + height2);
		
		System.out.println("-------------------------");

		//println은 한 줄밖에 출력하지 못함
		System.out.println("HI HELLO HOLA");

		//'\n' : 줄바꿈 문자, 개행문자 (ASCII 10 - LF, Line Feed)
		// \n 사용해서 println으로 여러 행으로 출력
		System.out.println("HI\n HELLO\nHOLA");
		
	}
	

}

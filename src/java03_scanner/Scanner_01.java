package java03_scanner;

//import 선언 코드 ->현재 소스코드에서 Scanner라는 이름으로 java.util.Scanner를 대신해서 사용하겠다
import java.util.Scanner;
//ctrl + shift + o ->임포트 최적화 Organize Import

public class Scanner_01 {
	public static void main(String[] args) {
		
		// class Scanner 스캐너 클래스
		
		//키보드로 입력한 (타이핑한) 내용을 프로그램 데이터로 가져오는 기능 클래스
		// 입력기능 클래스
		//----------------------------------------------
		
		//기본형 변수 사용법
		int num; //int형 변수 선언
		num = 123; //int형 데이터 대입
		//----------------------------------------------

		//참조형 변수 선언
		java.util.Scanner input;
		
		Scanner in;
		
		//----------------------------------------------

		//참조형 변수 사용 방법
		//	[클래스명] [변수명];	//참조형 변수 선언
		//	[변수명] = new [클래스명]( [필요한 데이터] ); //객체를 생성 (클래스 기능 활성화)
		
//		Scanner sc; //입력기능 Scanner 변수 선언(참조형)
//		sc = new Scanner( System.in ); //객체 생성, 입력기능 활성화 (System.in - 키보드랑 연결된 입력기능 활성화)
		
		Scanner sc = new Scanner(System.in); //-> 키보드 사용 항시 대기중 / 키보드 연결은 꼭 close로 닫지 않아도 됨 -> 컴퓨터가 알아서 조절
		

		//----------------------------------------------
		
		System.out.print("숫자를 입력하세요 : "); //println을 사용하지 않고 print를 사용해야 입력받을 위치가 :(콜론) 옆으로 생김
		
		int data = sc.nextInt(); //키보드에서 입력한 것을 int형으로 받아들이겠다 -> 키보드에서 입력하는 것은 문자로 인식함
		
		System.out.println("입력된 값 : " + data);
		
//		ghkkj	//입력한 값
//		Exception in thread "main" java.util.InputMismatchException			//입력한 값이 맞지않는다. ->int로 받아들이기로 했는데 문자 입력
//			at java.base/java.util.Scanner.throwFor(Scanner.java:939)		//수행하기 위해 여러 시도를 해봤지만 에러 발생
//			at java.base/java.util.Scanner.next(Scanner.java:1594)			//수행하기 위해 여러 시도를 해봤지만 에러 발생
//			at java.base/java.util.Scanner.nextInt(Scanner.java:2258)		//수행하기 위해 여러 시도를 해봤지만 에러 발생
//			at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//			at java03_scanner.Scanner_01.main(Scanner_01.java:39)			//에러는 밑에 줄부터 시작
		
		
//		10000000000		//입력한 값이 int범위 초과
//		Exception in thread "main" java.util.InputMismatchException: For input string: "10000000000"
//			at java.base/java.util.Scanner.nextInt(Scanner.java:2264)
//			at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//			at java03_scanner.Scanner_01.main(Scanner_01.java:39)

		//----------------------------------------------
		
		System.out.print("실수값 입력 : ");
		System.out.println("입력된 실수값 : " + sc.nextDouble());
		

		
		
		
		
		//자원 반납(해제) - 연결해서 사용하던 키보드의 사용종료를 알림
		sc.close(); //->종료 직전 닫기
		
	}

}

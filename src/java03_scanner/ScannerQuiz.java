package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		   //학생 정보 관리 프로그램
		   
		   //   이름, 나이, 성별, 국어, 영어, 수학
		   //   6가지 정보를 저장할 수 있는 변수를 만들고
		   //   총점과 평균을 포함한 결과를 출력한다
		   Scanner sc = new Scanner(System.in);
		
		   System.out.println("이름 \t 나이 \t 성별 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		   
		   String name = sc.next();
		   int age = sc.nextInt();
		   

		   String gender = sc.next(); //char 왜 안되는지?
		   
		   int korean = sc.nextInt();
		   int english = sc.nextInt();
		   int math = sc.nextInt();
		   
		   System.out.println(name \t age \t gender \t korean \t english \t math \t 총점 \t 평균");
		   
		//동작 예시)
		   
		//===== 입력 =====
		//Input Name : Alice
		//Input Age : 33
		   
		//Input Gender : F
		   
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//이름   나이	성별   국어   영어   	수학   		총점   			평균
		//Alice   33      F      100      99      97      296      98.666666667


	}

}

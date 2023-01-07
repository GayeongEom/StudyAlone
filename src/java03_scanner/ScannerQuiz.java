package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		//학생 정보 관리 프로그램

		//   이름, 나이, 성별, 국어, 영어, 수학
		//   6가지 정보를 저장할 수 있는 변수를 만들고
		//   총점과 평균을 포함한 결과를 출력한다

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

		Scanner sc = new Scanner(System.in);

		System.out.println("===== 입력 =====");
		System.out.print("Input Name : ");
		String name = sc.next(); 

		System.out.print("Input Age : ");
		int age = sc.nextInt();

		System.out.print("Input Gender : ");
		String gender = sc.next(); //char 왜 안되는지?

		System.out.print("\nInput Korean : ");
		double korean = sc.nextDouble();

		System.out.print("Input English : ");
		double english = sc.nextDouble();

		System.out.print("Input Mathematics : ");
		double math = sc.nextDouble();

		double total = korean + english + math;
		double ave = total / 3;
		
//		int total = korean + english + math;
//		double ave = total/(double)3;

		System.out.println("\n===== 출력 =====");


		System.out.println("이름 \t 나이 \t 성별 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println(name + "\t" + age + "\t" + gender + "\t" + (int)korean + "\t" + (int)english + "\t" + (int)math + "\t" + (int)total + "\t" + ave);

		//		   System.out.println(ave);


		//실행O, 더 깔끔하게 정리할 수 있음
		//1. next() 대신 nextLine()으로 받고 nextInt()후 nextLine()으로 받기 전에 입력버퍼 비워주면 됨
		//	-> 출력 코드에 \n 추가하지 않고  깔끔하게 기재 가능
		//2. char는 Scanner로 바로 입력받을 수 없어 String타입으로 입력받고 그 중 문자 하나를 꺼내오는 방식으로 출력해야 함
		//	-> char gender = sc.nextLine().charAt(0);
		//3. 점수를 int형으로 받으면 최종코드 출력시 (int)로 강제 형변환하지 않아도 됨
		//	-> 소숫점으로 출력되는 평균은 출력시 (double)로 나올 수 있도록 나눠주는 수를 (double)로 형변환 해줌
		
		
	}

}

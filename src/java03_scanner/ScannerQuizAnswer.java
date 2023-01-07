package java03_scanner;

import java.util.Scanner;

public class ScannerQuizAnswer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //입력객체
		System.out.println("===== 입력 =====");
		//--------------------------------------------
		
		//이름 입력
		System.out.print("Input Name : ");
		String name = sc.nextLine();
		
//		System.out.println("[Test] name : " + name);

		
		//나이 입력
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		
//		System.out.println("[Test] age : " + age);
		
		
		//입력버퍼 비우기
		sc.nextLine();
		
		
		//성별 입력 
		System.out.print("Input Gender : ");

		//String ver.
//		String gender = sc.nextLine();
		
		//char ver.
		char gender = sc.nextLine().charAt(0);
//		System.out.println("[Test] Gender : " + gender);
		
		
		//국어 입력
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		

		//영어 입력
		System.out.print("Input English : ");
		int eng = sc.nextInt();
		
		
		//수학 입력
		System.out.print("Input Math : ");
		int math = sc.nextInt();
		
//		System.out.println("[TEST] 점수 : " + kor + ", " + eng + ", " + math );
		
		
		//--- 총점, 평균 계산---
		int sum = kor + eng + math;
		double avg = sum / 3.0;
//		double avg = sum / (double)3;
		
//		System.out.println("[TEST] sum : " + sum);
//		System.out.println("[TEST] avg : " + avg);
		
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(sum + "\t");
		System.out.println(avg);
		
//		System.out.printf("%.2f", avg); //소수점 둘째자리까지 출력

		
	}

}

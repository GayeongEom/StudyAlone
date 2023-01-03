package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {

		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a<b || --a>c++; // true or false (a : 4, c : 10 -> 11) 
		//왼쪽이 true 이므로 결과값은 무조건 true가 나와 오른쪽 계산하지 않고 끝냄
		System.out.println("a=" + a + ", b=" + b + ", c=" + c); //a : 4, b : 6, c : 11
		System.out.println(res1); // true
		//오답


		boolean res2;

		res2 = c<b++ && c-->++a;  // false (c : 11, b : 6 -> 7) and true (c : 11 -> 10, a : 5)
		//왼쪽이 flase 이므로 결과값은 무조건 false가 나와 오른쪽 계산하지 않고 끝냄

		System.out.println("a=" + a + ", b=" + b + ", c=" + c); // a : 5, b : 7, c : 10
		System.out.println(res2); //false

		//논리연산자의 단축연산(shortcut)
		//	AND 연산은 왼쪽 피연산자가 false라면 오른쪽 항의 연산을 수행하지 않음
		//	OR 연산은 왼쪽 피연산자가 true라면 오른쪽 항의 연산을 수행하지 않음
		
	}
}



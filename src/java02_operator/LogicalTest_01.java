package java02_operator;

public class LogicalTest_01 {
	public static void main(String[] args) {

		int a = 5, b = 6, c = 10, d;

		d = ++a * b--; //a:6, b:6 -> 5 	/	d :  36
		System.out.println("a=" + a + ", b=" + b + ", d=" + d); //a : 6,  b : 5, d : 36


		d = a++ + ++c - b--; //a : 6 -> 7, c : 11, b : 5 -> 4	/	d : 6 + 11 - 5 = 12
		System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d); //a : 7, b : 4, c : 11, d : 12

		
		//정답
	}
}


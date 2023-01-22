package test.secondTest;

import java.util.StringTokenizer;

public class Des {
	public static void main(String[] args) {
		
		int[] iArr = new int[10];
		System.out.println(iArr);

		System.out.println(iArr[5]);
		
		
		//----------------------------------------------
		
		String[] sArr = {"빨강", "노랑", "파랑"};
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);

			}
		
		//----------------------------------------------

		String str = "Apple, Kiwi, Strawberry, Banana";
		
		String[] tokens = str.split(", ");
		
//		for(String token : tokens) {
//			System.out.println(token);
//		}
		
		System.out.println(tokens[1]);
		
//		StringTokenizer fruit = new StringTokenizer(str, ", ");
//
//		System.out.println(fruit.);
		
		
	}
	
}

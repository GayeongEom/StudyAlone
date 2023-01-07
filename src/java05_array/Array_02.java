package java05_array;

public class Array_02 {
	public static void main(String[] args) {
		
		int[] arr1; //배열 변수 선언
		arr1 = new int[5]; //배열 공간 생성
		
		//-----------------------------
		int[] arr2 = new int[7]; //변수의 선언과 동시에 초기화
		
		for(int i=0; i<7; i++) { 
			System.out.println(arr2[i]);
		}
		
		//-----------------------------

		//배열 공간의 선언과 동시에 초기화
		int[] arr3 = { 1, 2, 3, 4 };
		
//		int[] arr3 = new int[4];
//		arr3[0] = 1;
//		arr3[1] = 2;
//		arr3[2] = 3;
//		arr3[3] = 4;
		
		for(int i=0; i<4; i++) {
			System.out.println(arr3[i]);
		}
		
		 //에러, 배열 초기화는 선언할 때만 사용할 수 있음
//		arr3 = {5, 6}
		
		//-----------------------------
		System.out.println("------------");

		char[] chArr = { 'a', 'p', 'p', 'l', 'e' };
		
		double[] dArr = { 1.1, 2.2, 3.3 };
		
		boolean[] bArr = { true, true, false, true };
		
	}

}

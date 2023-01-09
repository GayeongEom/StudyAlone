package java05_array.array2D;

public class Array2D_01 {
	public static void main(String[] args) {
		
		//2차원 배열
		
		int num; 		//int형 변수 선언						->정수값 1개 저장
		
		int[] arr1D;	//int[]		->int배열 변수 선언			->정수값 여러 개 저장
		
		int[][] arr2D;	//int[][]	->int 2차원 배열 변수 선언	-> ((정수값)의 여러 개 묶음)을 여러 개
		
		int[][][] arr3D;
		
		//----------------------------------------
		
		//2차원 배열 선언
		int[][] arr;
		
		//2차원 배열 생성
		arr = new int[2][3]; //2행 3열짜리 int형 변수공간으로 이루어진 표가 생성
		
		arr[1][2] = 555;
		
		System.out.println(arr[1][2]);
		
		//--------------------------------------
		
		//배열변수의 선언
		int[] arr2; //추천
		int arr3[]; //비추천
		
		int[][] arr4; //추천
		int[] arr5[];
		int arr6[][];
		
	}

}

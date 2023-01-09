package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {

		//int형 2차원 배열 변수 선언
		int[][] arr;

		arr = new int[3][]; //(int[])[3] -> int형 배열공간 3묶음 / 뒤에서부터 읽기

		//각 int[]마다 다른 크기의 공간을 가질 수 있음
		arr[0] = new int[8]; //(int 타입) 의 배열 생성
		arr[1] = new int[3]; //(int 타입) 의 배열 생성
		arr[2] = new int[2]; //(int 타입) 의 배열 생성
		
		//-----------------------------------------------------
		
		//행의 길이
		System.out.println(arr); //2차원 배열 arr의 주소		
		System.out.println(arr.length);
		
		System.out.println("------------------------");
		
		System.out.println(arr[0]); //int형 배열 arr[0]의 주소
		System.out.println(arr[0].length); //0행의 길이
		
		System.out.println("------------------------");

		System.out.println(arr[1]);
		System.out.println(arr[1].length);
		
		System.out.println("------------------------");
		
		System.out.println(arr[2]);
		System.out.println(arr[2].length);
		
		System.out.println("------------------------");

		//2차원 배열의 모든 요소 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) { //i가 변함에 따라 j의 범위도 변함
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}	

}

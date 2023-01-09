package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1차원 배열의 선언과 동시에 초기화
		int[] arr1D = { 1, 2, 3, 4, 5};
		
		//2차원 배열의 선언과 동시에 초기화
		int[][] arr2D = { 
							{1, 2, 3}, 
							{4, 5, 6}, 
							{7, 8, 9} 
						};
		//-> 3행 3열의 2차원 배열 생성 / 3x3배열, 3 by 3 array
		
		//---------------------------------------------
		
		//2차원 배열의 모든 요소 출력
		for(int i=0; i<3; i++) { //i 행, 0~2
			for(int j=0; j<3; j++) { //j열, 0~2
				System.out.print( arr2D[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		//--------------------------------------------
		System.out.println("--------------------------");
		
		
		//5행 4열의 2차원 배열 새롭게 생성
		arr2D = new int[5][4]; // -> 전에 있던 [3][3]배열과 연결이 끊어지고 [5][4]배열 주소가 새롭게 연결됨
		//GC(Garbage Collector)가 참조주소를 잃어버린 [3][3] 배열을 자동으로 수집 및 삭제 -> memory leak을 방지
		
		//2차원 배열의 모든 요소 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++ ) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}

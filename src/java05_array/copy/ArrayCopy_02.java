package java05_array.copy;

public class ArrayCopy_02 {
	public static void main(String[] args) {
		
		//** 깊은 복사, Deep Copy
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		// 원본데이터와 사본데이터가 분리된 공간을 가진다

		//for문을 이용한 배열의 복사
		
		int[] arr1 = { 10, 20, 30 };	//원본, Source
		int[] arr2;						//사본, Destination

		//1. 데이터가 복사될 공간을 새롭게 생성한다
		arr2 = new int[arr1.length];
		
		//2. 데이터를 복사한다 - for문 이용
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i]; //사본데이터 <- 원본데이터
		}
		
		// 출력확인
		for(int i=0; i<arr2.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i] );
		}
		
		arr2[1] = 999; 

		System.out.println("----------");
		for(int i=0; i<arr2.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i] );
		}
		
	}
	
}


















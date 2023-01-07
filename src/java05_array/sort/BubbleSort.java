package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {

		//버블정렬
		int[] arr = { 3, 2, 5, 4, 1 };

		//--- 원본 출력 ---
		System.out.println("--- 정렬 전 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println();
		//----------------------------------------------------------------------		
		//--- 버블 정렬 수행 --- (구현!)
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int tmp;
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
//			System.out.println("-*-정렬중-*-");
//			for(int k=0; k<arr.length; k++) {
//				System.out.print(arr[k] + " ");
//			}
//			System.out.println();
		}

		//----------------------------------------------------------------------	
		System.out.println();
		//--- 결과 출력 ---
		System.out.println("--- 정렬 후 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}


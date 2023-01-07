package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		//배열이름.length
		//	-> 배열의 길이, 크기
		//	->배열 요소의 개수
		
		//------------------------------------------------
		
		System.out.println("배열의 길이 : " + arr.length);
		
		System.out.println("---------------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}

}

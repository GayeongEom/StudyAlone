package java05_array.copy;

public class ArrayCopy_01 {
	public static void main(String[] args) {
		
		//기본 타입 변수의 값 복사하기
		int num1 = 100;
		int num2;
		
		//num1 의 값이 num2에 복사된다
		num2 = num1;
		
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		System.out.println("--------------------");

		//---------------------------------------------------------------------------------------------------		
		
		//배열 복사하기
		int[] arr1 = { 10, 20, 30 };
		int[] arr2;

		
		//배열 복사 (얕은 복사)
		arr2 = arr1; //arr1의 데이터가 아닌 주소를 복사. -> arr1과 arr2는 같은 주소값을 가짐
		
		//** 얕은 복사, Shallow Copy
		// 참조 대상의 참조값(주소)만 복사되는 현상
		// 실 데이터를 저장하고 있는 내부 공간이 복사되지 않는다
		// 원본, 사본 참조형 변수가 모두 같은 메모리 주소를 참조하게 된다
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("--------------------");

		for(int i=0; i<arr2.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i] );
		}
		
		arr2[1] = 999; //arr1과 arr2는 같은 배열공간을 가지므로 값이같이 바뀜

		System.out.println("----------");
		for(int i=0; i<arr2.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i] );
		}
		
	}
}


















package java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
//		//String배열 타입 변수 선언
//		String[] strArr;
//		
//		//String배열 공간 생성
//		strArr = new String[3];
//		
//		//String배열에 값 대입
//		strArr[0] = "Apple";
//		strArr[1] = "Banana";
//		strArr[2] = "Cherry";
//		
		String[] strArr = {"Apple", "Banana", "Cherry"}; //선언, 생성, 대입 한 번엔
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]); //배열의 요소 하나씩 출력
			System.out.println(strArr[i].length()); //****배열 요소(문자열)의 길이 출력
			System.out.println(strArr.length); //**배열의 길이 출력
			
			//strArr		->String[] 타입
			//strArr[i]		->String 타입
			
			//strArr.length			->배열의 길이
			//strArr[i].length()	->문자열의 길이를 반환하는 메소드 사용
			
			//** strArr[i].length() ->int타입 리턴, 반환
			
		}

	}

}

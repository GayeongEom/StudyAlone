package java12_exception;

public class Exception_01_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int i=0;
		
		//if문을 이용한 예외상황 처리
		while(true) {
			
			//ArrayIndexOutOfBoundsException
			//	인덱스를 음수로 지정하여 배열에 접근했을 때
			//	인덱스를 배열의 길이와 같은 값으로 사용했을 때
			//	인덱스를 배열의 길이보다 큰 값을 지정했을 때
			
			//예외상황 처리
			if(i<0 || i>=arr.length) {
				
				System.out.println("[SYSTEM] 인덱스를 잘못 사용하였습니다.");
				break;
			} //if
			
			arr[i] = i+1; //예외 발생 지점
			
			i++;
			
		}//while
		
	}

}

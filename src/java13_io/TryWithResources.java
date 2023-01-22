package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResources {
	public static void main(String[] args) {
		
		//try - with - resources 구문 /close가 필요하면 자바가 알아서 하겠다는 코드
		//	예외처리 구문
		//	try-catch구문의 변형
		
		//JDK 1.7 추가
		
		//	-> 입출력 객체를 사용할 때 finally 블록을 이용한 close()호출을 구문에서 자동으로 대신 처리해줌
		//	-> try키워드에 ()괄호를 적용
		//	-> ()괄호에는 입출력 객체를 선언
		//	-> try{} 블록이 종료된 이후에 객체를 자동으로 close()
		//	-> Autoclosable interface의 동작
		
		//--------------------------------------------------------------------------------------------
		
		byte[] buf = "AppleBananaCherry".getBytes();
		
		try( OutputStream out = System.out ) {
			
			out.write(buf, 0, buf.length); //데이터 출력
			out.flush(); //출력 버퍼 비우기
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}

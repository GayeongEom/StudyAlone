package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamEx_ver2 {
	public static void main(String[] args) {
		
		//키보드 입력 -> 프로그램 -> 모니터 출력
		//--------------------------------------------------
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시저장소
		int len = -1; //입력데이터의 길이
		
		//try () 여러개 작성 가능
		try(	InputStream in = System.in; 
				OutputStream out = System.out ) {
		
			//입력 데이터가 EOF가 될 때까지 반복적으로 입력받는다.
			while( (len = in.read(buf)) != -1 ) {
				
				//입력받은 데이터를 모니터에 출력
				out.write(buf, 0, len); //write는 받자마자 flush 느낌
				out.flush(); //출력버퍼 비우기
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

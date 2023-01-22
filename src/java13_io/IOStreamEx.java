package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamEx {
	public static void main(String[] args) {
		
		//키보드 입력 -> 프로그램 -> 모니터 출력
		
		InputStream in = System.in; //표준 입력 스트림 객체
		OutputStream out = System.out; //표준 출력 스트림 객체
		
		//스트림별 버퍼 메모리가 있음 / 프로그램 버퍼랑 비슷한 구조 / 
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시저장소
		int len = -1; //입력데이터의 길이
		
		//<입력과 동시에 출력하기>
		try {
			
			//입력 데이터가 EOF가 될 때까지 반복적으로 입력받는다.
			while( (len = in.read(buf)) != -1 ) {
				
				//입력받은 데이터를 모니터에 출력
				out.write(buf, 0, len); //write는 받자마자 flush 느낌
				out.flush(); //출력버퍼 비우기
				
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //in과 out의 close()를 같이 입력한 경우 in에서 오류가 발생하면 out의 close()를 수행하지 않고 try를 빠져나가므로 in과 out의 close() try-catch 구문은 따로 작성해주는 것이 좋음
			
			//in의 close()
			try {
				if(in != null) in.close(); //입력 스트림 닫기
				
//				out.close(); 
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//out의 close()
			try {
				if(out != null) out.close(); //출력 스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
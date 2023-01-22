package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		//절대 경로 표기법
		//	-> root가 되는 드라이브 문자부터 파일(폴더)의 경로를 나타내는 것
		
		//상대 경로 표기법
		//	-> 상대적인 기준점을 출발위치로 삼아 경로를 나타내는 것
		//	-> . 으로 표현하며 시작
		//	-> 프로그램이 시작된 위치를 기준으로 삼음
		
		//**클래스 패스, class path
		//	-> 프로그램이 시작된 위치
		
		//-------------------------------------------------------------------------------
		
		File file = new File("./src/java13_io/fileStream/", "input"); //파일, 폴더가 업으면 오류 / 파일 낫 파운드
		
		//파일의 존재여부 확인
		if( !file.exists() ) {
			System.out.println("[SYSTEM] 파일이 존재하지 않습니다.");
			
			return; //main() 메소드 중단 -> 프로그램 중단
		}
		
		//-------------------------------------------------------------------------------
		
		byte[] buf = new byte[1024]; //입력데이터 버퍼
		int len = -1; //입력 데이터 길이
		
		StringBuilder sb = new StringBuilder(); //입력 데이터 최종 저장소
		
		//-------------------------------------------------------------------------------
		
		try(FileInputStream fis = new FileInputStream(file)) {
			
			//파일에 읽어들일 데이터가 존재하는 만큼 반복
			while( (len = fis.read(buf)) != -1 ) {
				
				//입력받은 데이터를 StringBuilder에 추가
				sb.append(new String(buf, 0, len));
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("<<입력된 데이터>>");
		System.out.println(sb);
		
		//-------------------------------------------------------------------------------
		
//		FileInputStream fis = null;
//		
//		try {
//			fis = new FileInputStream(file); //fis는 try의 지역변수
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		
		
		
		
	}

}

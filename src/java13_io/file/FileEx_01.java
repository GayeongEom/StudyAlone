package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		//	-> 파일의 정보를 관리하는 클래스
		//	-> 파일의 내용물을 관리할 수 없음
		//	-> 파일의 경로(위치, path)와 이름을 저장하고 있음
		//	-> 파일 입출력 스트림의 대상 입출력 장치로 지정할 수 있음
		
		//--------------------------------------------------------------------------------------------------
		
		File file = new File("D:\\eclipse-workspace\\JavaBasic\\src\\java13_io\\file\\", "Hello");
		
		System.out.println(file.length()); //파일 크기
		System.out.println(file.exists()); //존재하는 파일인지 확인
		
		System.out.println(file);
		
		//--------------------------------------------------------------------------------------------------
		System.out.println("-----------------------------");
		
		File again = new File("D:\\eclipse-workspace\\StudyAtHome\\src\\java13_io\\file\\HIHI");
		
		System.out.println(again.exists());
		System.out.println(again.length());
		System.out.println(again);
		
	}

}

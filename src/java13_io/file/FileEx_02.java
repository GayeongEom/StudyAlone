package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		File file1 = new File("D:\\eclipse-workspace\\JavaBasic\\src\\java13_io\\file\\", "Hello");

		System.out.println(file1.length());
		System.out.println(file1.exists());
		
		System.out.println(file1.isDirectory()); //폴더인지 확인
		System.out.println(file1.isFile()); //파일인지 확인
		
		System.out.println("---------------------------------------");
		
		File file2 = new File("D:\\eclipse-workspace\\JavaBasic\\src\\java13_io\\file\\");

		System.out.println(file2.length());
		System.out.println(file2.exists());
		
		System.out.println(file2.isDirectory()); //폴더인지 확인
		System.out.println(file2.isFile()); //파일인지 확인
		
		//---------------------------------------------------------------------------------------------------
		System.out.println("---------------------------------------");
		
		File again = new File("D:\\eclipse-workspace\\StudyAtHome\\src\\java13_io\\file\\", "HIHI"); //파일

		System.out.println(again.length());
		System.out.println(again.exists());
		System.out.println(again.isFile());
		System.out.println(again.isDirectory());
		
		System.out.println("---------------------------------------");
		
		File again2 = new File("D:\\eclipse-workspace\\StudyAtHome\\src\\java13_io\\file\\"); //파일

		System.out.println(again2.length());
		System.out.println(again2.exists());
		System.out.println(again2.isFile());
		System.out.println(again2.isDirectory());
		
	}

}

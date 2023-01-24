package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		File file = new File("./src/java13_io/fileStream/", "input"); //경로를 못찾으면 오류 / 파일 낫 파운드
		Scanner sc = new Scanner(System.in);
		
//		try(FileOutputStream fos = new FileOutputStream(file)) { //쓰기모드
//		try(FileOutputStream fos = new FileOutputStream(file, true)) { //추가모드
		try(FileOutputStream fos = new FileOutputStream(file, false)) { //쓰기모드
			
			//**파일 출력 스트림 객체는 객체생성될 때 출력 대상 파일이 없으면 파일을 생성해버림 -> 있어도 덮어씌워서 만듬
			
//			String msg = "\n며칠만 더 쉬고싶다..."; //스캐너로 입력하기로 응용 가능
			
			String msg = sc.nextLine();
			
			
			fos.write(msg.getBytes(), 0, msg.length());
			fos.flush();
			
			
		} catch (FileNotFoundException e) { //생성자
			e.printStackTrace();
		} catch (IOException e) { //.close()
			e.printStackTrace();
		}
		
	}

}

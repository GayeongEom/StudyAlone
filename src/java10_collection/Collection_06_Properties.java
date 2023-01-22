package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_06_Properties {
	public static void main(String[] args) {

		//Properties 객체 생성
		Properties prop = new Properties();

		//put() 메소드를 이용하면 Properties의 고유한 특성을 이용하지 않음
		//고유한 특성 : store, load
//		prop.put("A", 100);
//		prop.put(true, 3.456);

		//setProperty(), getProperty() 를 이용하여
		//문자열(String)타입의 키-값 쌍을 관리
//				prop.setProperty("A", 100); //에러

		prop.setProperty("A", "100"); 
		System.out.println("A : " + prop.getProperty("A"));
		System.out.println(Integer.parseInt(prop.getProperty("A"))); //숫자로 출력하고 싶을 땐 Integer.parseInteger()를 사용

		prop.setProperty("username", "Alice");
		prop.setProperty("password", "Ali12345");

		System.out.println(prop);

		System.out.println("--------------------------------");		

//		//파일 출력 스트림 객체
//		FileWriter writer = null;
//		//System.out (모니터 출력)과 같은 역할
//		
//		try {
//			
//			//파일 출력 스트림 생성
//			writer = new FileWriter("D:\\eclipse-workspace\\JavaBasic\\src\\java10_collection\\user.properties"); //이 위치에 파일을 자동 생성
//		
//			//Properties 객체의 데이터를 파일로 출력(파일로 저장)
//			prop.store(writer, "comment : User Information");
//			
//		} catch (IOException e) { //입출력을 다루는거에서 필수
//		
//			e.printStackTrace();
//		}
		
		//---------------------------------------------------------------
		
		Properties propt = new Properties();
		propt.setProperty("want", "vacation");
		propt.setProperty("hope", "Holiday");
		
		
		try {
			FileWriter fw = new FileWriter("D:\\eclipse-workspace\\StudyAtHome\\src\\java10_collection\\test"); //파일이 없으면 파일을 생성함
			
			//생성한 파일객체의 데이터를 파일로 출력(저장)
			propt.store(fw, "comment : studt again");
		
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		
		//---------------------------------------------------------------

//		//파일 입력 스트림 객체
//		FileReader reader = null;
//		
//		//입력받은 데이터를 확인할 Properties 객체
//		Properties test = new Properties();
//		
//		try {
//			reader = new FileReader("D:\\\\eclipse-workspace\\\\JavaBasic\\\\src\\\\java10_collection\\\\user.properties");
//			
//			System.out.println("불러오기 전 : " + test);
//			
//			test.load(reader);
//		
//			System.out.println("불러온 후 : " + test);
//
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		//---------------------------------------------------------------
		
//		FileReader read = null;
		
		
		try {
			FileReader read = new FileReader("D:\\eclipse-workspace\\StudyAtHome\\src\\java10_collection\\test");
			
			propt.load(read);
		
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		System.out.println(propt);
		
		
		//---------------------------------------------------------------
		
		System.out.println("--------------------------------");		

		//자바 API에서 기본으로 제공하는 Properties클래스
		
		//시스템의 설정 정보
		Properties sysProp = System.getProperties();
		
		System.out.println("\n------자바 정보------");
		System.out.println(sysProp.getProperty("java.version"));
		System.out.println(sysProp.getProperty("java.vendor")); //JDK를 제공한 회사
		
		System.out.println("\n------OS 버전------");
		
		System.out.println(sysProp.getProperty("os.name"));

	}

}

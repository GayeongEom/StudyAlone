package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		//키보드 표준 입력 스트림 객체
		InputStream is = System.in; //InputStream 추상클래스 변수의 타입은 될 수 있음
		
//		try {
//			System.out.println(is.read()); //구현체는 키보드이므로 동적바인딩 //int형으로 저장 -> 여러개 입력해도 한글자만 출력 -> 반복문으로 EOs를 만날때까지 출력하기
//			System.out.println(is.read()); 
//			System.out.println(is.read()); 
//			System.out.println(is.read()); 
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//----------------------------------------------------------------
		
		//입력받은 데이터의 저장소 역할 -> read()메소드의 매개변수로 이용
//		byte[] buf = new byte[10]; //HI\r\n
		byte[] buf = new byte[1024]; 
		
		//입력 데이터의 길이 -> read()메소드의 반환값으로 이용
		int len = -1; //사용하려는 목적 : read()의 반환값 저장 에 맞게 설정 / 어떤 용도로 쓸지 확실하게 표현
		
		//입력한 전체 문자열을 저장할 객체
		StringBuilder sb = new StringBuilder(); //동기화가 필요가 없어서(싱글 스레드라서) 버퍼가 아니라 빌더를 사용
		
		//입력한 전제 문자열의 길이
		int total = 0;
		
		try {
			System.out.println("<<입력 대기중>>");
			
			while( (len = is.read(buf)) != -1 ) { //더이상 읽어들일 데이터가 없으면 -1이 됨 //첫 입력ㅇㄹ 받아들이는 시작
				
				//입력받은 데이터 byte[]을 String으로 변환
				String data = new String(buf,0,len);
//				
//				System.out.println("입력받은 데이터 : " + data); //buf는 배열이라 참조값 나옴
//				System.out.println(len + "바이트 입력받음");
				
				//키보드 스트림의 EOF 입력
				//	윈도우 : ctrl + z
				
				//-----------------------------------------------------------------
				
				//read()가 입력받은 전체 문자열을 StringBuilder에 추가
				sb.append(data);
				
				//read()가 입력받은 전체 문자열의 길이를 total에 계산 (총합)
				total += len;
			
				//예외가 없을 때 read()의 사용이 끝나는 시점 / 예외가 있으면 try를 통과하기 때문에 안전하게 finally에 넣기
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //read()의 사용을 끝내는 시점
			
			try {
				
				//스트림 닫기
				if(is!=null) is.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println("\n<<전체 입력받은 데이터>>");
		System.out.println(sb);
		
		System.out.println("\n<< 입력받은 데이터의 전체 길이 : " + total + "B >>");
		
		
		
		
	}

}

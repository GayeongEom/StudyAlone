package java12_exception;

public class Exception_02_try_catch {
	public static void main(String[] args) {

		int[] arr = new int[5];

		int i=0;


		try {
			
			while(true) {
				arr[i] = i+1;
				i++;
			}//while
		
			
			//예외가 발생하지 않을 상황 -> 예외가 발생하지 않으면 catch블록을 실행하지 않음
//			while(i<arr.length) {
//				arr[i] = i+1;
//				i++;
//			}
			
			
		} catch( ArrayIndexOutOfBoundsException e ) {
		
			//sysout - 표준 출력 스트림
			System.out.println("[예외가 발생했습니다]");
			
			//syserr - 표준 에러 스트림 -> 빨간 글씨로 출력
			System.err.println("[예외 발생!]");
			
			//예외상황 출력(Stack Trace)
			e.printStackTrace();

		} finally {
			//예외발생 유무에 상관없이 실행될 코드
			System.out.println("예외처리 후 실행");
		}
		
		System.out.println("+ + + 프로그램 종료 + + +");

	}

}

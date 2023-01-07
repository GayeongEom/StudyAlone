package java04_control.loop;

public class For_10_long {
	public static void main(String[] args) {

		for (int i=1 ; i<=9 ;i++) { //모든 단 * n 의 형태로 위치 변경

			for (int dan=2 ; dan<=9 ; dan++) {
				System.out.print( dan + " x " + i + " = " + dan*i + "\t" ); //* n이 한 줄에 나오도록 출력
			}

			System.out.println();
		}

	}//main end

}//class end

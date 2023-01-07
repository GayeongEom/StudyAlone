package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력 ->2~9단 전부 출력
		
		int dan=2;
		while(dan<=9) {
			
			int i=1;
			while(i<=9) {
				
				System.out.println(dan + " x " + i + " = " + dan*i);
				i++;
			}
			
			System.out.println(); //i의 while반복 끝나고 개행
			dan++;
			
		}
		
	}

}

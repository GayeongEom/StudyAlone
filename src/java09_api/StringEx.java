package java09_api;

public class StringEx {
	public static void main(String[] args) {
		
		String str1 = "Apple"; //리터럴 상수
		String str2 = new String("Banana"); //동적 할당한 문자열
		//변수는 main()가 활용하는 STACK 영역에 공간이 만들어짐
		//상수는 상수 CODE영역에 공간이 만들어짐 -> 변수에는 이 상수의 공간 주소가 저장됨
		//동적할당 문자열은 HEAP에 공간이 만들어짐 -> 변수에는 이 문자열의 공간 주소가 저장됨
		

		//api가 원본을 건드는지 안건드는지 확인하고 사용
		//-------------------------------------------------------------
		
		System.out.println("------length()------");
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		System.out.println("Cherry의 길이 : " + "Cherry".length());
		
		//-------------------------------------------------------------
		
		System.out.println("\n------toLowerCase()------");

		String lower = str1.toLowerCase();
		
		System.out.println("lower : " + lower);

		
		//-------------------------------------------------------------
		//Q. 문자열의 모든 알파벳을 대문자로 변경한 결과를 반환

		System.out.println("\n------toUpperCase()------");
		
		String upper = str2.toUpperCase();
		
		System.out.println("str2 : " + str2);
		System.out.println("upper : " + upper);
		
		//-------------------------------------------------------------
		//Q. str1의 3번째 인덱스 값을 추출
		
		System.out.println("\n------charAt(int)------");

		char ch = str1.charAt(3);
		
		System.out.println("str1 : " + str1);
		System.out.println("ch : " + ch);
		
		//-------------------------------------------------------------
		//Q. str2 문자열의 'n'을 'X'로 변환
	
		System.out.println("\n------replace(char, char)------");

		String replace1 = str2.replace('n', 'X');
		
		System.out.println("str2 : " + str2);
		System.out.println("replace1 : " + replace1);
	
		String replace2 = str1.replace("pp", "XX");
		System.out.println("\nstr1 : " + str1);
		System.out.println("replace2 : " + replace2);
		
		//-------------------------------------------------------------
		
		System.out.println("\n------contains()------");
		//특정 문자열을 포함하고 있는지 확인
		
		boolean res1 = "Hello Java, Welcome".contains("ava");
		System.out.println(res1);
		
		boolean res2 = str1.contains("PP"); //대문자
		System.out.println(res2);
	
		boolean res3 = str1.contains("pp"); //소문자
		System.out.println(res3);
	
		//-------------------------------------------------------------
		
		System.out.println("\n------substring()------");
		//문자열의 일부분을 발췌하여 반환
		
		String substr1 = str1.substring(2); //2번째 인덱스부터 끝까지
		System.out.println("substr1 : " + substr1);
		
		String substr2 = str2.substring(1, 3); //1번째(포함) - 3번째(미포함) 인덱스 반환
		System.out.println("substr2 : " + substr2);
		
	}

}

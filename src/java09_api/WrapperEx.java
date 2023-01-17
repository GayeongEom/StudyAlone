package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		int num = 10; //int타입 변수(기본형)
		
		Integer iVal1 = num; //Integer타입 변수(참조형)
		Integer iVal2 = 12345;
		
//		@SuppressWarnings("deprecation")
//		Integer iVal3 = new Integer(89786); //생성자는 deprecate 되어있음
		
		//int 타입 변수(기본형)
		int i1 = iVal1;
		int i2 = iVal2;
		
		//-----------------------------------------------------
		
		//자료형에 대한 정보
		System.out.println("BYTE : " + Integer.BYTES);
		System.out.println("SIZE : " + Integer.SIZE);
		
		System.out.println("Double Bytes : " + Double.BYTES);
		
		System.out.println("----------------------------");
		
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		
		System.out.println("----------------------------");
		
		//문자열에서 데이터를 추출
		int number = Integer.parseInt("12345");		
		
		double dNum = Double.parseDouble("3.4567");
		
		boolean bData = Boolean.parseBoolean("true");
		
		char chData = "H".charAt(0); //	문자열에서 문자 추출
		
	}

}

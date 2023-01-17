package java09_api;

public class StringBuilderEx {
	public static void main(String[] args) {
		
//		StringBuilder sb;
		StringBuffer sb; 
		//몇몇개의 메소드만 다를 뿐 거의 같음
		
		//에러, String타입처럼 사용할 수 없음
//		sb = "Apple";
		
		sb = new StringBuffer();

		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity()); //Capacity - 저장가능한 StringBuffer의 총 크기
		
		System.out.println("\n------ Apple 추가 ------");
		sb.append("Apple");
		sb.append(1234);
		
		System.out.println(sb);
		
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity()); 
		
		System.out.println("\n------ 맛있는 Banana ------");
		
		sb.append("맛있는Banana");

		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity()); 
		

		System.out.println("\n------ reverse() ------");
		sb.reverse();
		System.out.println(sb);
		
		
		System.out.println("\n------ trimToSize ------");
		
		sb.trimToSize();
		
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity()); //계산 다 하고 끝났을 때 남은 필요없는 공간을 없애기 위해 사용 but, 굳이 필요 없음
		
	}

}

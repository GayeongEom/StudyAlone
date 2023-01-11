package java06_class.getset;

//실행 클래스
public class GetSetEx {
	public static void main(String[] args) {
		
		Data data = new Data();
		//------------------------------------
		
		//에러, 외부 객체의 접근이 막혀있음
//		data.num = 10;
//		System.out.println(data.num);
		
		//------------------------------------

		//setter getter메소드사용해서 값 저장 및 불러오기
		data.setNum( 10 ); //값 저장
		System.out.println( data.getNum() ); //값 불러오기
		//---------------------------------
		
		data.setNum( 444 );
//		System.out.println( data.getNum() );
		data.setNum( 888 );
//		System.out.println( data.getNum() );
		data.setNum( 999 );
//		System.out.println( data.getNum() );

		int num = data.getNum(); //변수에 값 저장
		System.out.println("반환된 값 : " + num);
		//---------------------------------
		
		data.setName("Alice");
		System.out.println( data.getName() );
		
		
	}
}

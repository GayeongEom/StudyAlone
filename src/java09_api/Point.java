package java09_api;

import java.util.Objects;

public class Point implements Cloneable {

	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
//	@Override
//	public String toString() {
//
//		
////		return super.toString(); //Object.toString() / "클래스명@참조값" 반환
////		return "하이!";
//		
////		return "(" + x + ", " + y + ")";
//		
//	}
	
	//toString -> 자동완성
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//equals 
//	@Override
//	public boolean equals(Object obj) { //Object를 Point로 바꾸면 오버라이딩이 아닌 오버로드가 됨
//		
//		//p2.equals(p3) 호출코드
////			->기준 p2 객체
////			-> .equals() 실행
////			-> 전달인자 p3
////			
////			-> this == p2
////			-> obj == p3
//		
//		if( this.x == ((Point)obj).getX() && this.y == ((Point)obj).getY()) { //Object는 x가 뭔지 모름 -> Point로 형변환 -> 연산자 우선순위때문에 괄호로 감싸줌
//			return true; //동등하다
//		}
//
//		return false; //동등하지 않음
//		//return (this == obj);	-> 동등연산자 비교중
//	}//equals 오버라이드
	
	//equals -> 자동완성
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //동일성(Identity) 확인 / 객체의 참조값 확인
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //동등성(equality) 확인 / 객체의 클래스 정보 확인
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	//Point로 자동 형변환이 안된다는 에러가 떴으므로 형변환 해주기
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	protected Point clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Point)super.clone();
	}
	
	
	
	

	//게터, 세터
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
	
}

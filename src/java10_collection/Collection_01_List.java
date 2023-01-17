package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection_01_List {
	public static void main(String[] args) {
		
		//<제네릭> -> 이 클래스에서 다룰 변수타입 정하기 / 여러 타입을 다룰 경우 부모타입
		ArrayList<Object> list = new ArrayList(); //빈(empty)리스트
		System.out.println(list); //[] (==empty) / 현재 값 대입 없이 공간만 존재
		
		System.out.println("\n------ 데이터 삽입 ------");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n------ 데이터 조회 ------");
		
		System.out.println("1번째 요소 : " + list.get(1));
		
		System.out.println("리스트의 크기 : " + list.size());
		
		//for문 사용해서 요소 전체 출력
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//for-each문 사용해서 요소 전체 출력
		System.out.println();
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		//에러
//		System.out.println(list.get(3)); // out of bound
		
		System.out.println("\n------ 데이터 수정 ------");
		
		list.set(0, "Orange"); //0번째 인덱스를 Orange로 수정
		System.out.println(list);
		
		System.out.println("\n------ 데이터 삭제 ------");
		
		list.remove(1); //인덱스 번호로 지우기 / 1번째 인덱스 삭제
		System.out.println(list);
		
		list.remove("Cherry"); //같은 내용이 있으면 지우기
		System.out.println(list);
		
		//-------------------------------------------------------------
		//데이터를 다룰 때 기본적으로 준비(수행, 서비스) 해야하는 작업들
		
		//CRUD 작업
		
		//Create 	- 추가 / 삽입 / 생성
		//Read		- 조회 / 탐색
		//Update	- 수정 / 변경
		//Delete	- 삭제 / 제거
		
		//-------------------------------------------------------------

		System.out.println("\n------ isEmpty() ------");
		
		System.out.println("리스트가 비었는가? " + list.isEmpty());
		
		ArrayList l1 = null; //리스트 객체를 생성하지 않음
		ArrayList l2 = new ArrayList(); //비어있음, 리스트 객체를 생성함
		
//		l1.isEmpty(); //에러 -> 객체가 없음 / NullPointEception
		l2.isEmpty();
		System.out.println("리스트가 비었는가? " + l2.isEmpty());
		
		if(null != l2) { //객체를 생성했는지 검사
			if(!l2.isEmpty()) { //요소가 존재하는지 검사
				
				System.out.println(l1.get(0)); //현재 요소가 없으므로 코드가 진행되지 않음
				
			}
		}
		
		//		   !!!! 이 부분에서 shortcut 당해서 뒤에는 검사 안함
		if(null!=l1 && !l1.isEmpty()) {
			
		}
		
		String str = "Apple";
		if(null!=str && "Apple".equals(str)) { //비교할 때 상수 먼저 작성
			
		}
		
		System.out.println("\n------ clear() ------");
		
		list.clear(); //모든 요소 제거 ->객체만 남아있음
		
		System.out.println(list);
		
		//**Arrays.fill(배열, 값);
		//	-> 배열의 모든 요소를 지정된 값으로 초기화
		int[] arr = new int[10];
		Arrays.fill(arr, 0); //배열 0으로 초기화하는 방법
		
		System.out.println("\n-----------------------------");
		
		//**컬렉션들은 요소의 데이터타입을 정해놓고 사용
		//	->제네릭을 이용하여 정함
		
		//**특정 데이터타입을 지정하지 않으면 Object로 사용하도록 되어있음
		
		list.add("문자열"); //String -> Object
		list.add(12345); //int -> Integer -> Object
		list.add(3.14); //double -> Double -> Object
		
		System.out.println(list);
		
	}

}

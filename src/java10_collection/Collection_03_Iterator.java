package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
	public static void main(String[] args) {


		//interface Iterator
		//	반복자
		//	컬렉션(List, Set)의 모든 요소들을 순차적으로 접근할 때 사용
		//	for-each 구문과 비슷한 역할을 수행

		//--------------------------------------------------------------------

		//Array.asList(T...a) 메소드
		//... : 여러개 작성하면 List에 add하여 넣어줌
		//	-> 매개변수로 나열된 데이터들을 순서대로 삽입함 ArrayList 객체를 생성하여 반환
		List list = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println(list);

		//--------------------------------------------------------------------

		//반복자 변수 선언
		Iterator iter = null;

		//list객체를 이용하여 Iterator객체 생성
		iter = list.iterator();

		//요소가 존재하는만큼 반복
		while (iter.hasNext()) {

			//요소를 반환하고 다음 요소를 반환할 수 있도록 준비
			Object data = iter.next();
			System.out.println(data);
		}

		System.out.println("------------------");

		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------------------");

		for(Object data : list) {
			System.out.println(data);
		}

	}

}
//println에 오버라이딩, 오버로딩 된 toString떄문에 객체, 요소가 문자열로 출력됨

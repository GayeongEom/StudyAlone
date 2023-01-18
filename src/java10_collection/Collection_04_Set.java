package java10_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_04_Set {
	public static void main(String[] args) {
		
//		Set set = new HashSet(); //기본 Set
		Set set = new LinkedHashSet(); //입력된 순서 유지 Set
//		Set set = new TreeSet(); //정렬된 상태 유지 Set
		
		//순서없이 저장
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(20);

		//중복데이터 자동 제거(hashCode()와 equals())
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println(set);
		
		System.out.println("----------------");
		
		//Set객체의 Iterator 사용
		Iterator iter = set.iterator();
		
		//Iterator를 통한 전체 데이터 출력
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("----------------");

		System.out.println("크기? " + set.size());
		System.out.println("비었는지? " + set.isEmpty());
		System.out.println("30이 존재하는지? " + set.contains(30));
		System.out.println("30 제거 : " + set.remove(30));
		System.out.println("50 제거 : " + set.remove(50));
		System.out.println(set);
	
		System.out.println("----------------");

		set.clear();
		System.out.println(set);
		System.out.println("비었는지? " + set.isEmpty());
		System.out.println("크기? " + set.size());
	
	
	}

}

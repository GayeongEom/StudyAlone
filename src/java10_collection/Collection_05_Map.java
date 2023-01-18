package java10_collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_05_Map {
	public static void main(String[] args) {
		
		//맵 객체 생성
//		Map map = new HashMap();
		Map map = new Hashtable(); //HashMap + 동기화처리
		
		
		//데이터 삽입
		map.put("a", "Apple"); //"a" = "Apple"
		map.put(1, "Banana"); //1 = "Banana"
		map.put(true, 3.345); //true = 3.345
		
		System.out.println("map : " + map);
		
		System.out.println("\n------ get(key) ------");
		
		System.out.println("\"a\" : " + map.get("a"));
		System.out.println("1 : " + map.get(1));
		System.out.println("true : " + map.get(true));
		
		//존재하지 않는 key를 이용하여 get()하면 null 반환
		System.out.println(map.get(9999));
		
		System.out.println("\n------ put(key, value) ------");
		map.put("D", "Durian");
		System.out.println(map);
		
		System.out.println("-------------------");
		
		//중복 key를 사용할 수 없음
		//기존에 존재하던 key를 이용한 데이터 삽입
		//	->key에 매핑된 value를 변경
		map.put(1, "Orange");
		System.out.println(map);
		
		System.out.println("-------------------");

		//value는 중복되어도 상관없음
		map.put(2, "Apple");
		System.out.println(map);
		
		System.out.println("\n---------contains()----------");
		
		System.out.println("Key 5 : " + map.containsKey(5));
		
		//key가 2가 없을 때만 데이터 삽입
		if(!map.containsKey(2)) {
			map.put(2, "Cherry");
		}
		System.out.println(map);
		
		System.out.println("-------------------");

		System.out.println("Value Apple : " + map.containsValue("Apple"));
		
		System.out.println("-------------------");

		System.out.println("크기? " + map.size());
		System.out.println("비었는가? " + map.isEmpty());
		
		System.out.println("\n---------values()----------");
		//value만 collection형태로 출력
		System.out.println(map.values());
		
		System.out.println("\n---------remove()----------");
		
		//key true만 확인하고 엔트리 제거
		map.remove(true);
		System.out.println(map);

		//key-value 쌍을 확인하고 일치하면 제거
		map.remove(2, "Banana"); //제거되지 않음
		System.out.println(map);
		
		map.remove("D", "Durian");
		System.out.println(map);
	
		System.out.println("\n---------null값 처리----------");

		//HashMap은 key, value로 null이 허용됨 -> 그래도 안쓰는 것이 좋음
		//Hashtable은 key, value로 null을 허용하지 않음
		
		
//		map.put(null, "Alice");
//		map.put("Bob", null);
		System.out.println(map);
		
//		map.put(null, null); //value가 Alice에서 null로 변경
		System.out.println(map);
		
		System.out.println("\n---------전체 데이터 반복----------");
		
		//key를 Set에 담아 set으로 반환
		//key들을 set으로 따로 저장
		Set keys = map.keySet();
		
		//key들의 반복자 생성
		Iterator iter = keys.iterator();
		
		while(iter.hasNext()) {
			Object key = iter.next();
			Object value = map.get(key);
			System.out.println(key + " = " + value);
		}
		
		System.out.println("-------------------");

		for(Object key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
		
	}
}

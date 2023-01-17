package java10_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_02_List {
	public static void main(String[] args) {
		
		List list2 = new ArrayList();
		List list3 = new LinkedList();
		List list4 = new Vector();
		
		//-------------------------------------------------
		
		ArrayList ar = new ArrayList();
		LinkedList lk = new LinkedList(); //고유 멤버 메소드
		Vector vc = new Vector(); //고유 멤버 메소드
		
		//각 타입의 고유한 기능(메소드)를 사용하려면 객체 변수를 부모타입인 List로 선언하면 !!안됨!!
		
		//**하지만, 보통의 경우 List를 객체변수타입으로 사용
		
	}

}

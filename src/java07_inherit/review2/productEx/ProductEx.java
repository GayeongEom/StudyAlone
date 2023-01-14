package java07_inherit.review2.productEx;

import java07_inherit.review2.person.Person;
import java07_inherit.review2.product.Computer;
import java07_inherit.review2.product.Product;
import java07_inherit.review2.product.Tv;

public class ProductEx {
	public static void main(String[] args) {
		
		System.out.println("---상속 전 테스트-----------------");
		Computer c1 = new Computer("i7", 1000);
		c1.out();
		
		Tv t1 = new Tv("Canvas", 800);
		t1.out();

		//----------------------------------------------------------------------------		
		
		System.out.println("---상속 후 테스트-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();

		//----------------------------------------------------------------------------		
		
		System.out.println("---Product 배열 테스트------------");
		Product[] products = new Product[5];
	
		int count = 0;
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println(count+"개 물건 구입");

		//----------------------------------------------------------------------------		

		System.out.println("-------Person--------");
		Person p = new Person("Alice", 2000);
		System.out.println(p.getName() + "님의 자금은 " + p.getMoney() + "원 입니다.\n");
		
		//생성한 인스턴스를 변수에 저장하지 않고 일회성으로 사용하기 위해 바로 매개변수로 사용
		p.buy( new Tv("LG", 500) ); 
		p.buy( new Computer("i5", 1000) );
		p.buy( new Tv("Pavv", 700) );
	
	}
}

















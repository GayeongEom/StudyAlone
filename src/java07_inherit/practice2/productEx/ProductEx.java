package java07_inherit.practice2.productEx;

import java07_inherit.practice2.person.Person;
import java07_inherit.practice2.product.Computer;
import java07_inherit.practice2.product.Product;
import java07_inherit.practice2.product.Tv;

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
		p1.out(); //프로덕트의 out메소드는 abstract로 날려서 없지만 어차피 동적바인딩의 연결다리이므로 결과물은 자식클래스의 out으로 잘 출력됨
		
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
		
		System.out.println("---Person------------");
		Person p = new Person("Alice", 2000);
		System.out.println("[자금] " + p.getMoney() + "원");

		p.buy( new Tv("LG", 500) ); //변수에 저장을 생략하고 바로 매개변수로 대입 -> 1회성으로 사용할것이다
		p.buy( new Computer("i5", 1000) );
		p.buy( new Tv("Pavv", 700) );
		
		p.buy(c1); //변수에 저장하고 변수를 매개변수로 대입
//----------------------------------------------------------------------------		

		System.out.println("------------------------");
		//배열 만들고, 배열의 요소 넣기
		
		//사람
		Person pp = new Person("가영", 5000);
		
		//장바구니
		Product[] prts = new Product[3];
		prts[0] = new Tv("LG", 500);
		prts[1] = new Computer("i5", 1000);
		prts[2] = new Tv("Pavv", 700);
		
		for( Product n : prts) {
			pp.buy(n);
		}
		
		//Person에 메소드 만들어보기 / 장바구니에 든 물건 다 사면 얼마인지
		
		
//----------------------------------------------------------------------------		
		
		//얼마가 부족해서 구매하지 못했다.
		
	}

}

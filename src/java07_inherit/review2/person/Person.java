package java07_inherit.review2.person;

import java07_inherit.review2.product.Product;

public class Person {
	
	//멤버필드
	private String name; //앨리스
	private int money; //2000
	private Product prod; //엘지, 500
	
	//매개변수 있는 생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//디폴트 생성자
	public Person() {
		
	}
	
	
	//메소드
	public void buy(Product obj) { //헷갈리니까 전달인자의 이름을 다른걸로 구분
		
		//전달인자로 받은 Product를 멤버필트에 저장
		this.prod = obj;
		
		//물건가격만큼 money를 차감
		if(this.money > obj.getPrice()) { //내가 가진 돈이 물건값보다 많으면
			this.money -= obj.getPrice(); //잔액에서 물건값 차감

			System.out.println(this.name + "님이 " + obj.getPrice() + "원을 지불하고 " + obj.getModel() + "을 구매함");
			System.out.println("[잔액] " + this.money + "원");
			System.out.println();
		} else { //내가 가진 돈보다 물건값이 비싸면
			System.out.println( -(this.money - obj.getPrice())+ "원이 부족하여 " + obj.getModel() + "을 구매하지 못하였습니다." );
			System.out.println();
		}
		
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

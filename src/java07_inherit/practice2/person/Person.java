package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
	
	private String name;
	private int money;
	private Product prod; //Product 임폴트
	
	//생성자
	public Person() {
		
	}
	
	//매개변수 있는 생성자
	public Person(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	//메소드        new Tv("LG", 500)
//	               	public Tv(String model, int price) {
//					super(model, price);
//}
	public void buy(Product newProd) {
		
		//전달인자로 받은 Product를 멤버필드에 저장하고
		this.prod = newProd;
		
		
		//물건가격만큼 money를 차감한다
		this.money -= newProd.getPrice();
//		setMoney(money-this.prod.getPrice());

		//진행상황 출력
		System.out.println();
		System.out.println(this.name + "님이 " +  newProd.getPrice() + "원을 지불하고 " + newProd.getModel() + "을(를) 구매하였습니다."); //***************
		
		if(money>0) {
			System.out.println("[잔액] " + this.money + "원");
		} else {
			System.out.println("잔액이 부족합니다.");
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

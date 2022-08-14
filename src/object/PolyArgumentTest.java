package object;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv11());
		b.buy(new Computer1());
		
		System.out.println("잔고 : " + b.money);
		System.out.println("보너스 포인트 : " + b.bonusPoint);

	}

}

class Product1 {
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스포인트는 제품의 10%
	}
}

class Tv11 extends Product1 {
	Tv11() {  //조상클래스에 생성자가 있어서 호출해야함
		super(100);
	}
	// 투스트링 오버라이딩
	public String toString() {
		return "Tv";
	}
}

class Computer1 extends Product1 {
	Computer1(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {  //고객 클래스 작성
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다");
	}
}














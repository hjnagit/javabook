package object;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv11());
		b.buy(new Computer1());
		
		System.out.println("�ܰ� : " + b.money);
		System.out.println("���ʽ� ����Ʈ : " + b.bonusPoint);

	}

}

class Product1 {
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // ���ʽ�����Ʈ�� ��ǰ�� 10%
	}
}

class Tv11 extends Product1 {
	Tv11() {  //����Ŭ������ �����ڰ� �־ ȣ���ؾ���
		super(100);
	}
	// ����Ʈ�� �������̵�
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

class Buyer {  //�� Ŭ���� �ۼ�
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�");
	}
}














package object;

public class CastingTest1 {

	public static void main(String[] args) {
//		Car car = null;
//		FireEngine fe = new FireEngine();  //�ν��Ͻ��� FireEngine�̴�
//		FireEngine fe2 = null;
//		
//		fe.water();
//		
//		car = (Car)fe;
//		car.water(); // Car Ŭ������ ���� �޼����� water�� ���Ұ�
//		fe2 = (FireEngine)fe; // fe2�� fe ��ü�� �ֱ�
//		fe2.water();
//		fe2 = (FireEngine)car;  // car�� �ڼ�Ÿ������ ����ȯ
//		
//		fe2.water();
		
		//���� �ν��Ͻ��� �߿��ϴ�
		Car car = new Car();
		FireEngine fe = null;
		FireEngine fe2 = null;
		
		car.drive();
		
//		fe = (FireEnginge)car; //���� 
		// ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� �����ϴ� ���� ������ �ʴ´�

	}

}

class Car {   //Ŭ���� Car
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {  // Ŭ���� FireEngine ���� Car
	void water() {
		System.out.println("water!!!!");
	}
}


package object;
//Ŭ������ 2���ִ� ��� ���� �޼��尡 �ִ� Ŭ������ �̸���
//�ҽ������� �̸��� ��ġ���Ѿ� �Ѵ�
class Test1 {
	
	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.channelDown();
		System.out.println(t.channel);
		
//		t.channel = 7;
//		t.color = "black";
//		t.power = true;
//		
//		t.channelDown();
//		System.out.println("���� ü���� " + t.channel +"�Դϴ�");
//		System.out.println("Tv�� ���� : " + t.color);
//		t.power();
//		System.out.println("���� Tv�� ���´� " + t.power + "�Դϴ�.");
		
	}

}

class Tv{
	// Tv�� �Ӽ� �������
	String color;
	boolean power;
	int channel;
	
	// Tv�� ���(�޼���)
	void power()  { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}






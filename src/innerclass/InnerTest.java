package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		out.usingClass();
		OutClass.InClass in = out.new InClass();
		System.out.println(in.inNum);
	}

}

class OutClass{
	private int num = 10; // �ܺ�Ŭ���� ����
	private static int sNum = 20; //�ܺ� Ŭ���� ���� ����
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//�̳�Ŭ����
	class InClass{
		int inNum = 100; // ���� Ŭ������ �ν��Ͻ� ����
		
		void inTest() {
			System.out.println("OutClass num = " + num + "�ܺ�Ŭ���� ����");
			System.out.println("OutClass sNum = " + sNum + "�ܺ�Ŭ���� ��������");
			System.out.println(inNum);
		}
	} // �̳�Ŭ���� ��
	public void usingClass() {
		inClass.inTest();
	}
} // �ƿ�Ŭ���� ��
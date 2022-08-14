package innerclass;

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
	}

}

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {// �޼���
		int num = 10; // ��������
		
		class MyRunnable implements Runnable{// ���� ���� Ŭ����
			int localNum = 1; // ���� ���� ����
			
			@Override
			public void run() {
				//num = 200; ������������ �Ű������� �� ���� �Ұ�
				//i = 100; ȣ���� ����
				//�������� �� ���� ����
				//outNum = 10;
				//sNum = 30;
				//localNum = 10;
				System.out.println(outNum + " " + sNum + " " + i + " " + num + " " + localNum);
				
			}
			
		}//MyRunnableŬ���� ��
		
		return new MyRunnable();
	}//getRunnable �޼��� ��
	
	
}//OuterŬ���� ��

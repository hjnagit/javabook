package innerclass;

public class AnnoymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.myRunnable(1);
		runnerble.run();
		out.runner.run();
	}

}

class Outer2{
	// Runnable 2���� ����
	Runnable myRunnable(int i) {
		int num = 10;
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		}; // �͸� Ŭ������ ���� ;
	}
	
	Runnable runner = new Runnable() {
		public void run() {
			System.out.println("�͸�Ŭ����");
		};
	};
}
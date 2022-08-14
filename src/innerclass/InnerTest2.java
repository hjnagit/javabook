package innerclass;

import innerclass.OuterClass.InnerClass;

public class InnerTest2 {

	public static void main(String[] args) {
		// static Ŭ������ ����Ʈ�ؼ� �ٷ� ��밡��. static������ �޼��常
		InnerClass.sTest();
		OuterClass.usingTesst();
		OuterClass.InnerClass.sTest();
		
		OuterClass.InnerClass sInClass = new OuterClass.InnerClass();
		sInClass.inTest();
		OuterClass oc = new OuterClass();
		oc.usingTests();
	}

}

class OuterClass{
	private int num = 100;
	private static int sNum = 200;
	
	static class InnerClass{
		int inNum = 10;
		static int sInNum = 20;
		
		void inTest() {
			System.out.println("num : ���Ұ�");
			System.out.println("sNum : " + sNum);
			System.out.println("inNum : " + inNum);
			System.out.println("sInNum : " + sInNum);
		}
		
		static void sTest() {
			System.out.println("num : ���Ұ�");
			System.out.println("sNum : " + sNum);
			System.out.println("inNum : ���Ұ�");
			System.out.println("sInNum : " + sInNum);
		}
		
	}// �̳� Ŭ���� ��
	
	// ������ �޽��带 ���� static�� ����ؼ� static ���̱� ����.
	static void usingTesst() {
		InnerClass.sTest();
		System.out.println(InnerClass.sInNum);
		//static Ŭ������ ������� ��밡�� -> static�޼���� ������...
	}
	
	InnerClass ic = new InnerClass();
	
	void usingTests() {
		ic.inTest();
		System.out.println(ic.inNum);
		InnerClass.sTest();
		System.out.println(InnerClass.sInNum);
	}
	
}// �ƿ�Ŭ���� ��
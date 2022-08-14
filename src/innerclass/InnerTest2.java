package innerclass;

import innerclass.OuterClass.InnerClass;

public class InnerTest2 {

	public static void main(String[] args) {
		// static 클래스는 임포트해서 바로 사용가능. static변수와 메서드만
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
			System.out.println("num : 사용불가");
			System.out.println("sNum : " + sNum);
			System.out.println("inNum : " + inNum);
			System.out.println("sInNum : " + sInNum);
		}
		
		static void sTest() {
			System.out.println("num : 사용불가");
			System.out.println("sNum : " + sNum);
			System.out.println("inNum : 사용불가");
			System.out.println("sInNum : " + sInNum);
		}
		
	}// 이너 클래스 끝
	
	// 변수와 메스드를 전부 static만 사용해서 static 붙이기 가능.
	static void usingTesst() {
		InnerClass.sTest();
		System.out.println(InnerClass.sInNum);
		//static 클래스는 선언없이 사용가능 -> static메서드와 변수만...
	}
	
	InnerClass ic = new InnerClass();
	
	void usingTests() {
		ic.inTest();
		System.out.println(ic.inNum);
		InnerClass.sTest();
		System.out.println(InnerClass.sInNum);
	}
	
}// 아웃클래스 끝
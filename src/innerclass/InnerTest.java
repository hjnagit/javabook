package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		System.out.println("외부 클래스 이요하여 내부 클래스 기능 호출");
		out.usingClass();
		OutClass.InClass in = out.new InClass();
		System.out.println(in.inNum);
	}

}

class OutClass{
	private int num = 10; // 외부클래스 변수
	private static int sNum = 20; //외부 클래스 정적 변수
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//이너클래스
	class InClass{
		int inNum = 100; // 내부 클래스의 인스턴스 변수
		
		void inTest() {
			System.out.println("OutClass num = " + num + "외부클래스 변수");
			System.out.println("OutClass sNum = " + sNum + "외부클래스 정적변수");
			System.out.println(inNum);
		}
	} // 이너클래스 끝
	public void usingClass() {
		inClass.inTest();
	}
} // 아웃클래스 끝
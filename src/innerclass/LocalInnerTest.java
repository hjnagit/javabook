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
	
	Runnable getRunnable(int i) {// 메서드
		int num = 10; // 지역변수
		
		class MyRunnable implements Runnable{// 지역 내부 클래스
			int localNum = 1; // 지역 내부 변수
			
			@Override
			public void run() {
				//num = 200; 지역변ㄴ수와 매개변수는 값 변경 불가
				//i = 100; 호출은 가능
				//나머지는 값 변경 가능
				//outNum = 10;
				//sNum = 30;
				//localNum = 10;
				System.out.println(outNum + " " + sNum + " " + i + " " + num + " " + localNum);
				
			}
			
		}//MyRunnable클래스 끝
		
		return new MyRunnable();
	}//getRunnable 메서드 끝
	
	
}//Outer클래스 끝

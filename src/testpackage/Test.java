package testpackage;

public class Test {

	public static void main(String[] args) {
		//round() 무조건 .5에서 올림
		//rint() 반올림한 결과가 무조건 짝수가 나온다 1.5는올림 2.5는버림
		// 결과는 rint가 더 비슷하게 나온다
		// 실제값과 비슷하게 오차를 줄이기 위해서 나온것이 rint이다
		//반반씩 올림 버림을 반복하니까
		
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d = 1.5; d <=10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}
		
		System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);

		
		
		
	}

}

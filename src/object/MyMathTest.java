package object;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5, 3);
		
		System.out.println("add(5L + 3L) = " + result1);
		System.out.println("substrat(5L + 3L) = " + result2);
		System.out.println("multiply(5L + 3L) = " + result3);
		System.out.println("divide(5 + 3) = " + result4);
		
	}
	
}



class MyMath {
	
	long add(long a, long b) {
		long result = a + b;
		return result;
		
		// return a + b; 이렇게 간단하게 작성가능
	}
	
	long substract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }
		
}
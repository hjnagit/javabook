package stringTest;

public class test1 {

	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal); // int -> String 성능 빠름
		String strVal = iVal + ""; // int -> String 
		
		double dVal = 200.0;
		String strVal2 = dVal + "";//double -> String
		
		double sum = Integer.valueOf("-" + strVal); // 문자열 -> 숫자
		System.out.println(sum);
		sum += Double.valueOf(strVal2);
		System.out.println(sum);
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		System.out.println(sum2);
		
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum2);
		//join은 double타입을 사용할 수 없다 String타입만 가능!!
	}

}

package stringTest;

public class test1 {

	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal); // int -> String ���� ����
		String strVal = iVal + ""; // int -> String 
		
		double dVal = 200.0;
		String strVal2 = dVal + "";//double -> String
		
		double sum = Integer.valueOf("-" + strVal); // ���ڿ� -> ����
		System.out.println(sum);
		sum += Double.valueOf(strVal2);
		System.out.println(sum);
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		System.out.println(sum2);
		
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum2);
		//join�� doubleŸ���� ����� �� ���� StringŸ�Ը� ����!!
	}

}

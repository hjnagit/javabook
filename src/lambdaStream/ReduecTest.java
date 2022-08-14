package lambdaStream;

import java.util.Arrays;

public class ReduecTest {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���!!", "hello00000000000000000", "Good morning", "�ݰ����ϴ�^^"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		}));
		
		
	}
}

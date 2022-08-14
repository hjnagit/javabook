package lambdaStream;

import java.util.Arrays;

public class ReduecTest {

	public static void main(String[] args) {
		String[] greetings = {"¾È³çÇÏ¼¼¿ä!!", "hello00000000000000000", "Good morning", "¹İ°©½À´Ï´Ù^^"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		}));
		
		
	}
}

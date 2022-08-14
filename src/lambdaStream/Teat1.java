package lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Teat1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		
		List<String> sList = new ArrayList<>();
		sList.add("B");
		sList.add("S");
		sList.add("S");
		sList.add("A");
		sList.add("V");
		sList.add("C");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s->System.out.println(s+" "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s+" "));
		
	}

}

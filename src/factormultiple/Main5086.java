package factormultiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5086 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
		
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
		
			String result = "neither";
			
			if(num1 == 0 && num2 == 0)
				break;
			
			if(num1 > num2) {
				if(num1%num2==0) result = "multiple";
			} else {
				if(num2%num1==0) result = "factor";
			}
			
			System.out.println(result);
		}
		
		
	}

}

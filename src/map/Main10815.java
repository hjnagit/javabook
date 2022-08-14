package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main10815 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			list.add(arr[i]);
		}
		//이분탐색을 위해 list에 넣고 정렬을 해준다
		Collections.sort(list);
		int[] card = new int[num];
		for(int i=0; i<num; i++) {
			card[i] = list.get(i);
		}
		
		int num2 = Integer.parseInt(br.readLine());
		String str2 = br.readLine();
		st = new StringTokenizer(str2);
		int[] arr2 = new int[num2];
		
		for(int i=0; i<num2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		//이분탐색을 이용하여 카드 확인하기
		for(int i=0; i<num2; i++) {
			int result = Arrays.binarySearch(card, arr2[i]);
			
			if(result<0) System.out.print("0 ");
			else System.out.print("1 ");
		}
		
		
	}

}

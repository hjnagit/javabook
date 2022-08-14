package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>(2000000);
		LinkedList<String> ll = new LinkedList<>();
		
		System.out.println(add1(al));
		System.out.println(add1(ll));
		
		System.out.println(add2(al));
		System.out.println(add2(ll));
		
		System.out.println(remove2(al));
		System.out.println(remove2(ll));
		
		System.out.println(remove1(al));
		System.out.println(remove1(ll));
		
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			list.add(i+"");
		}
			long end = System.currentTimeMillis();
			return end - start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i >=0 ; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end- start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i <10000 ; i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end- start;
	}
	
	
}

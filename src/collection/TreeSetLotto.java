package collection;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		Random rand = new Random();
		
		
		
		for(int i = 0; i < 7;i++) {
			int a = rand.nextInt(45)+1;
			t.add(a);
		}
		
		System.out.println(t);
		
		TreeSet t2 = new TreeSet();
		char ch = ' ';
		
		for(int i = 0; i < 95; i++) {
			t2.add(ch++);
		}
		System.out.println(t2);
		
		TreeSet t3 = new TreeSet();
		int[] score = {80, 95, 70, 55, 40, 35, 85, 50};
		
		for(int i = 0; i < score.length; i++) {
			t3.add(new Integer(score[i]));
		}
		System.out.println(t3);
		
		System.out.println("50보다 작은 값 : " + t3.headSet(50));
		System.out.println("50보다 큰 값 : " + t3.tailSet(50));
		
		
		
	}

}

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		String[] data = {"A","B","C","A","A","C","B","D","D","D","D","D"};
		
		TreeMap tm = new TreeMap();
		
		// TreeMap에 데이터 넣기
		for(int i = 0; i < data.length; i++) {
			if(tm.containsKey(data[i])) {
				int value = (int)tm.get(data[i]);
				tm.put(data[i], value+1);
			} else {
				tm.put(data[i], 1);
			}
		}
		
		Set set = tm.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey() + " : " + printS('#', (int)me.getValue()) + " " + me.getValue());
		}
		
		System.out.println();
		
		Set set2 = tm.entrySet();
		List list = new ArrayList(set2);
		
		Collections.sort(list, new ValueConparator());
		it = list.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			int value = (int)me.getValue();
			System.out.println(me.getKey() + " : " + printS('#', value) + " " + value);
		}
		
	}
	
	public static String printS(char c, int n) {
		char[] ch = new char[n];
		for(int i = 0; i < ch.length; i++) {
			ch[i] = c;
		}
		return new String(ch);
	}
	
	static class ValueConparator implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = (int)e1.getValue();
				int v2 = (int)e2.getValue();
				
				return v2 - v1;
			}
			return -1;
		}
	}

}

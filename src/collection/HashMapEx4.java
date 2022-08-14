package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapEx4 {

	public static void main(String[] args) {
		String[] data = {"A","B","C","A","A","C","B","D","D","D","D","D"};
		
		HashMap map = new HashMap();
		
		for(int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);
			}else {
				map.put(data[i], 1);
			}
		}
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() + " : " + printBar('#', (int)entry.getValue()) + " " + entry.getValue());

		}
		
		
	}
	
	public static String printBar(char c, int value) {
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++) {
			bar[i] = c;
		}
		return new String(bar); // String¿¡ char ³Ö±â
	}

}

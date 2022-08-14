package collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>(5);
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		print(v);
		
		v.trimToSize();
		print(v);
		
		v.ensureCapacity(6);
		print(v);
		
		// 사이즈를 설정할 때 용량이 부족하면 기존의 용량의 2배를 만들어서 생성한다
		v.setSize(7);
		print(v);
		
		v.clear();
		print(v);
		
		
		
		
		
		
	}
	
	public static void print(Vector<String> v) {
		System.out.println("Vector size : " + v.size());
		System.out.println("Vector capacity : " + v.capacity());
	}

}

package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv3> tvList = new ArrayList<Tv3>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>(); 에러!!
		List<Tv3> tvList3 = new ArrayList<Tv3>(); // ok. 다형성
		
		productList.add(new Tv3()); // 다형성 오케이
		productList.add(new Audio3());
		
		tvList.add(new Tv3());
//		tvList.add(new Audio()); 에러 
		
		printAll(tvList);
//		printAll(productList); // 에러
		
		
	}
	
	public static void printAll(ArrayList<Tv3> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}

}

class Product{}
class Tv3 extends Product{}
class Audio3 extends Product{}
package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv3> tvList = new ArrayList<Tv3>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>(); ����!!
		List<Tv3> tvList3 = new ArrayList<Tv3>(); // ok. ������
		
		productList.add(new Tv3()); // ������ ������
		productList.add(new Audio3());
		
		tvList.add(new Tv3());
//		tvList.add(new Audio()); ���� 
		
		printAll(tvList);
//		printAll(productList); // ����
		
		
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
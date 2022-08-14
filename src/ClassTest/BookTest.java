package ClassTest;

public class BookTest {

	public static void main(String[] args) {
		String str = new String("sdfsd");
		
		System.out.println(str.toString());
		
		Book b1 = new Book("å", 123);
		
		System.out.println(b1);
		
		String s1 = "123";
		String s2 = "123";
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 + " " + s2);
		System.out.println(s1.toString());
		
		String s3 = new String("123");
		
		System.out.println(s1.equals(s3));
		System.out.println();
		
		Book b2 = new Book("å2", 123);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);
		
		
		
	}

}

class Book{
	String name;
	int num;
	
	Book(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book)	{
			Book b = (Book)obj;
			if(this.num == b.num) {
				return true;
			}else return false;
		}else return false;
	}
	
	
}
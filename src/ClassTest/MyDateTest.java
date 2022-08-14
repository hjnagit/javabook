package ClassTest;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(2022, 11, 1);
		MyDate d2 = new MyDate(2022, 11, 1);
		
		System.out.println(d1.equals(d2));
		System.out.println(d1 == d2);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		
	}

}

class MyDate{
	int year;
	int month;
	int day;
	
	MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate d = (MyDate)obj;
			if(this.day == d.day && this.month == d.month && this.year == d.year) {
				return true;
			} else return false;
		} else return false;
	}
	
	@Override
	public int hashCode() {
		return year+month+day;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
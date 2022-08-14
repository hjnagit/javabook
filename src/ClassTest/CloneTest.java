package ClassTest;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c = new Circle(12,3, 5);
		
		System.out.println(c);
		
		Circle c2 = (Circle)c.clone();
		
		System.out.println(c2);
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(c2));
		
	}

}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x : " + x + ", y : " + y; 
	}
}

class Circle implements Cloneable{
	Point point; // 변수 선언
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y); //객체생성
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "이다.";
	}
	
	// 클론이 protect라서 오버라이딩한다
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

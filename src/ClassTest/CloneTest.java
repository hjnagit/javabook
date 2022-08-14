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
	Point point; // ���� ����
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y); //��ü����
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "������ " + point + "�̰�, �������� " + radius + "�̴�.";
	}
	
	// Ŭ���� protect�� �������̵��Ѵ�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

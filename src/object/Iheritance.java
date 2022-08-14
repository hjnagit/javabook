package object;

class MyPoint {
	int x;
	int y;
}
//class Circle extends MyPoint {
//	int r;
//}
class MyCircle {
	MyPoint p = new MyPoint();
	
	int r;
	void cc() {
		p.x++;
	}
	
}

public class Iheritance {
	public static void main(String[] args) {
		MyCircle c = new MyCircle();
		c.p.x=1;
		c.p.y=2;
		c.r=3;
		System.out.println(c.p.x);
		System.out.println(c.p.y);
		System.out.println(c.r);
		
		
	}

}

package object;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = { new Point(100, 100),
				      new Point(140, 50),
				      new Point(200, 100)
		             };
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 50), 50);
		
		t.draw();
		c.draw();
		
		Point a = new Point(6,7);
		System.out.println(a.getXY());
		
	}

}

class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {  // 점의 좌표
	int x;
	int y;
	
	Point(int x, int y) {   //생성자
		this.x = x;
		this.y = y;
	}
	Point() {   //기본값
		this(0,0);
	}
	String getXY() {
		return "(" + x + ", " + y + ")"; 
	}
}

class Circle extends Shape{ 
	Point center;  // 원의 원점좌표
	int r;    //반지름
	
	Circle() {
		this(new Point(0, 0), 100);
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]",
				center.x, center.y, r, color);
	}
	
	
}

class Triangle extends Shape {
	
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
		
	}
}









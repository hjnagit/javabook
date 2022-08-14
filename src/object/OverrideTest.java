package object;

class Point3 extends Object {
	int x;
	int y;
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x: "  + x + ", y: " + y;
	}
}

//class Point3D3 extends Point3{
//	int z;
//	//조상 겟로케이션 오버라이딩
//	String getLocation() {
//		return "x: "  + x + ", y: " + y + ", z: " + z;
//	}
//}



public class OverrideTest {

	public static void main(String[] args) {
		Point3 p = new Point3(1,2);
		p.x = 3;
		p.y = 5;
		
		System.out.println(p.toString());
		System.out.println(p);
		
	}

}

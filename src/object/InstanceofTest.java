package object;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine1 fe = new FireEngine1();
		
		if(fe instanceof FireEngine1) {
			System.out.println("true");
		}
		if(fe instanceof Car1) {
			System.out.println("true");
		}
		if(fe instanceof Object) {
			System.out.println("true");
		}
		System.out.println(fe.getClass().getName());

	}

}

class Car1 {
	
}
class FireEngine1 extends Car1 {
	
}

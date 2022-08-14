package object;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		Child1 c = new Child1();
		
		

	}

}

class Parent1 {
	int x = 100;
	
	void method() {
		System.out.println("Parent method");
	}
}

class Child1 extends Parent1 {
	
}

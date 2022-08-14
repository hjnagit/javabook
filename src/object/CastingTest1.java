package object;

public class CastingTest1 {

	public static void main(String[] args) {
//		Car car = null;
//		FireEngine fe = new FireEngine();  //인스턴스는 FireEngine이다
//		FireEngine fe2 = null;
//		
//		fe.water();
//		
//		car = (Car)fe;
//		car.water(); // Car 클래스에 없는 메서드인 water는 사용불가
//		fe2 = (FireEngine)fe; // fe2에 fe 객체를 넣기
//		fe2.water();
//		fe2 = (FireEngine)car;  // car를 자손타입으로 형변환
//		
//		fe2.water();
		
		//실제 인스턴스가 중요하다
		Car car = new Car();
		FireEngine fe = null;
		FireEngine fe2 = null;
		
		car.drive();
		
//		fe = (FireEnginge)car; //에러 
		// 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다

	}

}

class Car {   //클래스 Car
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {  // 클래스 FireEngine 조상 Car
	void water() {
		System.out.println("water!!!!");
	}
}


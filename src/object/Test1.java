package object;
//클래스가 2개있는 경우 메인 메서드가 있는 클래서의 이름을
//소스파일의 이름과 일치시켜야 한다
class Test1 {
	
	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.channelDown();
		System.out.println(t.channel);
		
//		t.channel = 7;
//		t.color = "black";
//		t.power = true;
//		
//		t.channelDown();
//		System.out.println("현재 체널은 " + t.channel +"입니다");
//		System.out.println("Tv의 색깔 : " + t.color);
//		t.power();
//		System.out.println("지금 Tv의 상태는 " + t.power + "입니다.");
		
	}

}

class Tv{
	// Tv의 속성 멤버변수
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	void power()  { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}






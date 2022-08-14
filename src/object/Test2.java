package object;

class Test2 {
	public static void main(String[] args) {
		
	
	Tv[] tvArr = new Tv[3];
	
	tvArr[0] = new Tv();
	tvArr[1] = new Tv();
	tvArr[2] = new Tv();

	Tv[] tvArr2 = new Tv[3];
	
	for(int i = 0; i < tvArr2.length ; i++) {
		tvArr2[i] = new Tv();
		tvArr2[i].channel = i+10;
		
		System.out.println("tv는" + tvArr2[i].channel + "채널입니다.");
	}
	
	for(int i = 0; i < tvArr2.length; i++) {
		tvArr2[i].channelDown();
		System.out.println("지금 tv의 채널은 " + tvArr2[i].channel + "입니다.");
		
	}
	
	
	
	
	}

}



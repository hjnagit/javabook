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
		
		System.out.println("tv��" + tvArr2[i].channel + "ä���Դϴ�.");
	}
	
	for(int i = 0; i < tvArr2.length; i++) {
		tvArr2[i].channelDown();
		System.out.println("���� tv�� ä���� " + tvArr2[i].channel + "�Դϴ�.");
		
	}
	
	
	
	
	}

}



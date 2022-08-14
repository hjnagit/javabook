package generics;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		//Tv타입의 객체만 저장가능
		// 참조변수의 타입과 생성자에 대입된 타입은 같아야한다
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
//		list.add(new Audio()); 오류
		
//		Tv t = (Tv)list.get(0); // 예전에는 타입이 object여서 형변환을 해야했다
		Tv t = list.get(0); // 지금은 Tv타입이란걸 정해줘서 형변환 안해도 됨
		//타입일치!!
		
	}

}


class Tv{}
class Audio{}
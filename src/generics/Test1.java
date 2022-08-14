package generics;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// 형변환 에러 실행시 발생하는 에러
		// 컴파일은 ㅇㅋ -> 실행시 에러 컴파일의 한계
		// 제네릭!!!
		// 실행시 발생하는 에러를 컴파일에서 잡아준다
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList list = new ArrayList(); 이렇게 쓰면 안됨
//		ArrayList<Object> list = new ArrayList<>(); 1.5부터 제네릭타입을 꼭 쓰자
		
		list.add(10); //list.add(new Integer(10)); 오토박싱
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		Integer i = list.get(2);  //형변환 생략가능
//		Integer i = (Integer)list.get(2);  //Integer인걸 아니까 
		
		
		
	}

}

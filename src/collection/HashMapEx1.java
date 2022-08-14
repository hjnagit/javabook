package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		h.put("myId", "1234");
		h.put("asdf", "1222");
		h.put("asdf", "1111");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = s.nextLine().trim();
			System.out.println("password : ");
			String pass = s.nextLine().trim();
			
			if(!h.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			if(!(h.get(id)).equals(pass)) {
				System.out.println("비밀변호가 일치하지 않습니다. 다시 입력해주세요");
			}
			else {
				System.out.println("아이디와 비밀번호가 일치합니다.");
				break;
			}
			
			
			
		}
		
	}

}

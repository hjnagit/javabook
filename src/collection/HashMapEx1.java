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
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.println("id : ");
			String id = s.nextLine().trim();
			System.out.println("password : ");
			String pass = s.nextLine().trim();
			
			if(!h.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			if(!(h.get(id)).equals(pass)) {
				System.out.println("��к�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			}
			else {
				System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			}
			
			
			
		}
		
	}

}

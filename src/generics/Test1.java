package generics;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// ����ȯ ���� ����� �߻��ϴ� ����
		// �������� ���� -> ����� ���� �������� �Ѱ�
		// ���׸�!!!
		// ����� �߻��ϴ� ������ �����Ͽ��� ����ش�
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList list = new ArrayList(); �̷��� ���� �ȵ�
//		ArrayList<Object> list = new ArrayList<>(); 1.5���� ���׸�Ÿ���� �� ����
		
		list.add(10); //list.add(new Integer(10)); ����ڽ�
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		Integer i = list.get(2);  //����ȯ ��������
//		Integer i = (Integer)list.get(2);  //Integer�ΰ� �ƴϱ� 
		
		
		
	}

}

package generics;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		//TvŸ���� ��ü�� ���尡��
		// ���������� Ÿ�԰� �����ڿ� ���Ե� Ÿ���� ���ƾ��Ѵ�
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
//		list.add(new Audio()); ����
		
//		Tv t = (Tv)list.get(0); // �������� Ÿ���� object���� ����ȯ�� �ؾ��ߴ�
		Tv t = list.get(0); // ������ TvŸ���̶��� �����༭ ����ȯ ���ص� ��
		//Ÿ����ġ!!
		
	}

}


class Tv{}
class Audio{}
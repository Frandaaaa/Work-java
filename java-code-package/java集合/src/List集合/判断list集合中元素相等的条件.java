package List����;

import java.util.*;
//�ж����ֻ��Ҫ�Ǹ�equals��������true����

class A{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class �ж�list������Ԫ����ȵ����� {
	public static void main(String[] args)
	{
		List book = new ArrayList();
		book.add(new String("cuiqin1"));
		book.add(new String("cuiqin2"));
		book.add(new String("cuiqin3"));
		System.out.println(book);
		
		//delete
		book.remove(new A());
		System.out.println(book);
		//�ٴ�ɾ����һ������
		book.remove(new A());
		System.out.println(book);
		//after all: we rewrite the equals() so it will always delete the first item form collection
		//attention ! the method set(int index, Object element)can't change the length of collection
	}
}

package ���ϸ���;

import java.util.*;

public class foreach�������� {
	public static void main(String[] args)
	{
		//create collection
		Collection books = new HashSet();
		
		//add items
		books.add("aa");
		books.add("cuiqinbaba");
		books.add("cuiqin");
		
		//foreach method code 
		for(Object obj : books)
		{
			//book �Ѿ����Ǽ���Ԫ�ر�����
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("cuiqin"))
			{
				//ע�⣺���������ֻ��һ��Ԫ�أ���ô�ǲ����������ǳɹ��Ƴ������Ƕ��һ������
				//һ��Ҫ��������쳣
				//��ϸԭ��	����ֻ��һ�ΰɼ���Ԫ�ص�ֵ��������������������������Ԫ�ر���
				//�����foreachѭ���еĵ�������û����
				//books.remove(book);//ConcurrentModificationException�쳣
			}
			System.out.println(books);
		}
			
		
	}
}

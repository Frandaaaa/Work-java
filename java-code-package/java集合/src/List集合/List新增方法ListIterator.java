package List����;
/**
 * @see		java����.���ϸ���.Iterator��������Ԫ��
 */

import java.util.*;

/*
 * 	List�����ṩ��һ��listIterator()��������������һ��ListIterator����������ListIterator�ӿڼ̳���Iterator�ӿڣ��ṩ��ר�Ų���List�ķ���
 * 		boolean hasPrevious():		���ص����������ļ����Ƿ�����һ��Ԫ��
 * 		Object previous():			���ظõ���������һ��Ԫ��
 * 		void add(Object o):			��ָ����λ���������һ��Ԫ��
 * 
 * 	�Զ��׼���Iterator��ͬ���ǣ����ListIterator���ܵ�����һ��Ԫ�أ��ߴ��ϵ�����������ң�����������Ԫ��
 */

public class List��������ListIterator {
	public static void main(String[] args)
	{
		String[] books = {
				"cuiqin1",
				"cuiqin2"
		};
		List bookList = new ArrayList();
		for(int i = 0; i < books.length; i++)
		{
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while(lit.hasNext())//��Ҫ�������������ʹ��next()�������е���
		{
			System.out.println(lit.next());
			lit.add("------------------------");
		}
		System.out.println("�������===========");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}
}

package ���ϸ���;

import java.util.*;

/*
 * 	Iterator��java���Ͽ���еĳ�ԱŶ��Collection and Map have the same method -- contain the items ����
 * 	but Iterator mainly is used to visit collection's items.
 * 	Iterator���󱻳�Ϊ������
 */

/*
 * 	���Ǵ�Iterator�ĵײ㹹�ܿ�ʼѧϰ
 * 	4 methods
 * 	~	boolean hasNext():	������������ʵļ���Ԫ�ػ�û�б������棬����true
 *  ~	Object next():		ɾ�������������һ��Ԫ��
 *  ~	void remove():		ɾ�������������һ��next�����еķ��ض�Ԫ��
 *  ~	void forEachRemaining(Consumer action)	����������Ĭ�Ϸ��������Ա�����ʹ�ñ�������Ԫ��
 *  
 *  ���֣�ֻ��ɾ���������ӣ�ֻ�ܵ�����һ��Ԫ��
 */

//for example
public class Iterator��������Ԫ�� {
	public static void main(String[] args)
	{
		//�������Ϻ����Ԫ��
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("cuiqinbaba");
		books.add("cuiqinhaha");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext())//ֻ�ܵ�����һ��Ԫ��
		{
			//it.next()�������ص�����������object ���ͣ������Ҫǿ��ת��
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("cuiqin"))
			{
				//�Ӽ�����ɾ����һ��next()�����з��ص�Ԫ��
				//books.remove(book);//java.util.ConcurrentModificationException�����޸ļ���Ԫ��
				//the reason why is that: fail-fast ����ʧ�ܻ��ƣ�һ���ڵ��������м�⵽�ü����Ѿ����޸���(�����е������߳��޸�),to avoid the question of resource sharing 
				it.remove();
			}
			//��book��ֵ�������ز���ı伯��Ԫ�صı���������Ժ��ַ���ֵ��û�����ã����Ƿ����ĵ��������ǰɼ���Ԫ�ر����ֱ�Ӵ����˵������������ǰѼ���Ԫ�ص�ֵ�����˵��������������޸�
			//����������ֵ�Լ���Ԫ�ر���û���κ�Ӱ�죬
			book = "test";
		}
		
		System.out.println(books);
		
		//����Collection����ʱԪ�ز��ܸı�����⣺��Ҫʹ��remove()������ɾ����һ��next()�������صļ���Ԫ�ز��ܿ��Ըı�
		//for example
		//��ȡ������
		
	}
}
package ���ϸ���;

/**
 * 	@see		�������.����import������import_static.������
 */

import java.util.*;
import java.util.function.Predicate;//Ϊʲô��Ҫ���������������������ɵ�����������ļ������������Ӱ����ף�


/*						��Ϊ�����Ǻ���ʽ�ӿڣ�����ʹ��lambda
 * 	new method removeif(Predicate filter)
 * 	fuction		����ɾ������filter������������Ԫ��,��һ��˵�����ǹ��˼���
 */

public class Predicate�������� {
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add(new String("cuiqin"));
		books.add(new String("cuiqinbaba"));
		books.add(new String("cuiqindiedie"));
		books.add(new String("cuiqinhaha"));
		books.add(new String("cuiqinxixi"));
		
		//use lambda
		books.removeIf(ele -> ((String)ele).length() < 10);
		
		//print items
		System.out.println(books);
		
		//foreach
		for(Object obj:books)
		{
			System.out.println(obj);
		}
		
		//iterator
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
		}
		
		//ͳ�ƹ���: ���Գ���cuiqin��Ԫ�أ����ȴ���10�ģ�baba��Ԫ��
		System.out.println(calAll(books, ele ->((String)ele).contains("cuiqin")));
		System.out.println(calAll(books, ele ->((String)ele).contains("baba")));
		System.out.println(calAll(books, ele ->((String)ele).length() > 10));
	}

	//�Զ����Ǹ�ͳ�Ʒ�������������ܺ�����
	private static int calAll(Collection books, Predicate p) {
		int total = 0;
		for(Object obj : books)
		{
			//ʹ��Predicate��test()�������ж϶����Ƿ�����Predicate���������
			//����������������
			if(p.test(obj))
			{
				total ++;
			}
		}
		
		return total;
	}
}

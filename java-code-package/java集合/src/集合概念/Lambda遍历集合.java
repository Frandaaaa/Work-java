package ���ϸ���;

//forEach : ������Ҫһ������ʽ�ӿ�

/*
 * 	ǡ��Iterable�ӿ���Collection�ӿڵĸ��ӿ�
 *	when use the method forEach(Consumer action) of Iterable interface, the program will convey the items to the method named accept(T t)
 *								����
 *	and accept(T t) is the only  abstract method.
 *	����ΪConsumer ��һ������ʽ�ӿڣ�����ʹ��Lambda���ʽ����������Ԫ��
 */

//for example

import java.util.*;

public class Lambda�������� {
	public static void main(String[] args)
	{
		//create the collection
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("cuiqinbaba");
		books.add("cuiqinhaha");
		//forEach()
		//send the items to obj one by one automatically
		books.forEach(obj -> System.out.println("����Ԫ�أ�" + obj));//��һ���
		
	}
}
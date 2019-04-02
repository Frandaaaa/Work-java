package ���ϸ���;

import java.util.*;

/**
 *	@see	compare with Lambda��������.java
 */

/*
 * 	forEachRemaining(Consumer action)		����ʽ�ӿڣ���������ν�����Ԫ�ش���Consumer��accept(T t)����(��Ψһ�ĳ��󷽷�)
 */

//for example
public class Lambda����Iterator {
	public static void main(String[] args)
	{
		//��������
		Collection books = new HashSet();
		books.add("cuiqinhahaha");
		books.add("baba");
		
		//��ȡ������
		Iterator it = books.iterator();
		
		//use lambda: find the order , each time you add one item the item will be
		//the frist one.
		it.forEachRemaining(obj -> System.out.println("items:" + obj));
	}
}

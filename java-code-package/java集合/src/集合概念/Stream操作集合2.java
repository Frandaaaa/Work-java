package ���ϸ���;

import java.util.*;

public class Stream��������2 {
	public static void main(String[] args)
	{
		//��������
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("patient");
		books.add("excellent");
		books.add("cuiqinhahaha");
		
		//ͳ��cuiqin
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).contains("cuiqin"))
				.count());
		//ͳ�ư���ent
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).contains("ent"))
				.count());
		//ͳ���ַ���������10
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).length() > 10)
				.count());
		//����Collection�����stream()����������ת����ΪStream
		//����Stream mapToInt()��������ȡԵ�ɵ�Stream��Ӧ��IntStream
		//		attention: mapToInt is a middle method so we still can use last method to progress
		books.stream().mapToInt(ele -> ((String)ele).length())
		//use forEach() method to show up all items of IntStream
		.forEach(System.out::println);
		
		//�����ظ�ʹ�÷����Լ��������Ԫ�ؽ��в���
		//����ֻҪ����Collectoin �е�stream()�����Ϳ��Է��ؼ��϶�Ӧ��Stream,Ȼ��Ϳ���ʹ���Ǹ��ķ�������
		
	}
}

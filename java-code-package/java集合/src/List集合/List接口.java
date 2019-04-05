package List����;
/**
 * @see		java����.���ϸ���.����
 * @author ����
 *
 */

/*
 *	List : Ԫ�����򡢿��ظ��ļ��ϣ������е�ÿ��Ԫ�ض��ж�Ӧ��˳������ ���ͺ�����Ĳ�����
 *
 *		void add(int index, Object element) ��Ԫ�ز��뵽list�����е�index��
 *		boolean addAll(int index, Collection c):������c������������Ԫ�ض����뵽List���ϵ�index��
 *		Object get(int index) ���ؼ���index��������Ԫ��
 *		int indexOf(Object o) ���ض���o��List�����е�һ���г��ֵ�λ������
 *		int lastIndexOf(Object o) ���ض���o��list���������һ�˳��ֵ�λ������
 * 		Object remove(int index, Object element) ��index��������Ԫ���滻��Ϊelement���󣬷��ر��滻�ľ�Ԫ��
 * 		List subList(int fromIndex, int toIndex) ���ش�����fromIndex(����)������toIndex(������)
 * 	�����м���Ԫ����ɵ��Ӽ���
 * 		��set���ϵ�����:���Ը������������롢�滻��ɾ������Ԫ�صķ���,list�ӿ���������µ�Ĭ�Ϸ���
 * 			void replaceAll(UnaryOperator operator) ����operatorָ���ļ��������������List���ϵ�����Ԫ��
 * 			void sort(Comparator c) ����Comparator ������List���ϵ�Ԫ������
 */

import java.util.*;
public class List�ӿ� {
	public static void main(String[] args)
	{
		List books = new ArrayList();
		//���Ԫ��
		books.add(new String("cuiqin1"));
		books.add(new String("cuiqin2"));
		books.add(new String("cuiqin3"));
		System.out.println(books);
		//�ڶ���λ�ò���
		books.add(1, new String("cuiqin1.5"));
		//forѭ��������Ԫ��
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println(books.get(i));
		}
		//delete the third item
		books.remove(2);
		System.out.println(books);
		//�ж�ָ��Ԫ����List�����е�λ��,�����������ֵ
		System.out.println(books.indexOf(new String("cuiqin1")));
		//�滻
		books.set(1, new String("cuiqinahha"));
		System.out.println(books);
		//��ȡ���ܣ� ���ڶ���Ԫ�ذ�������������Ԫ�ز������Ľ�ȡ��Ϊ�Ӽ���
		System.out.println(books.subList(1, 2));
		//�ܽ᣺�Բ�����ô̫�����˰�
	}
}

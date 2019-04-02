package Set����;

import java.util.*;
/**
 * 
 * @author ����
 *
 *
 *	��SortedSet��ʵ���࣬����ȷ������Ԫ�ش��������״̬������ķ�����������
 *		Comparator comparator(); �Ż���ʹ�õ�comparator
 *		Object first/last();			return the first/last item
 *		Object lower(Object e)			����ָ��Ԫ��֮ǰ��Ԥ��
 *		Object higher(Object e)			����ָ��Ԫ��֮���Ԫ��
 *		SortedSet subSet(Object formElement, Object toElement)���ش�Set���Ӽ���
 *			ע��:����ǰ�治��������
 *		SortedSet headSet(Object toElement):���ش�Set�Ӽ�����С��toElement��Ԫ�����
 *		SortedSet tailSet(Object fromElement)			���ڻ����
 *
 *
 *	��������������������ģ������˷��ʵ�һ�����һ����һ��ǰһ��Ƭ�εķ���
 *			Ĭ����Ȼ���򣬻��ж�������
 */

public class TreeSet�� {
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		//����ĸ����Ͷ���
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		
		//��������ֺ����ģ������Ѿ��ǰ��մ�С�����˳������
		System.out.println(nums);
		
		//first
		System.out.println(nums.first());
		//last
		System.out.println(nums.last());
		//����С��4���Ӽ�
		System.out.println(nums.headSet(4));
		//����5
		System.out.println(nums.tailSet(5));
		//����ʽ��-3<x<4
		System.out.println(nums.subSet(-3, 4));
	}
		
}

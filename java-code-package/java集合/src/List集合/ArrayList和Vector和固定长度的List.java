package List����;

import java.util.*;
/*
 * 	first of all�� ArrayList and Vectior class completely hold the function of list
 * 		��װ��һ����̬�ġ������ٴη����Object ���飻ʹ��initialCapacity��������������ĳ��ȣ�������initialCapacity����
 * 		�Զ�����
 * 		��Ӵ���Ԫ�أ�ensureCapacity(int minCapacity)һ��������initialCapacity,���ٷ���������������
 * 			��ʼ��ָ��initialCapacity ��ʼֵΪ10 
 * 	 �µķ���
 * 		void ensureCapacity(int minCapacity) ��ArrayList or Vector �� Object[] ���鳤�����Ӵ��ڻ����minCapacity
 *		void trimTosize():		��������ĳ���Ϊ��ǰԪ�صĸ��������Լ����ڴ�ռ��
 *
 * 	 ���ϵ�Vector ���Ӱ�ȫ ArrayList �� Collections �������¿��Ա�ð�ȫ�����ܸ���
 * 		Vector �ṩ��Stack ���� ����ģ�����ȳ��ġ�ջ�������ݽṹ
 * 			Object peek() ����ջ�ĵ�һ��Ԫ�أ����ὲԪ��pop��ջ
 * 			Object pop()  ����ջ�ĵ�һ��Ԫ�أ����ҽ���Ԫ��pop��ջ
 * 			void push(Object item) ��һ��Ԫ��push ��ջ�� ���һ����ջ��Ԫ���൱������λ��ջ��
 * 		��ģ�����ô���˰�����ֽ��������˵������ϵ������þ��У�������ʹ��ջ�������ģ�����ʹ�ú�����ܵ���ArrayDeque
 */

public class ArrayList��Vector�͹̶����ȵ�List {
	public static void main(String[] args)
	{
		//���ڹ̶����ȵ�list
		List fixedList = Arrays.asList("cuiqin1","cuiqin2");
		System.out.println(fixedList.getClass());
		
		//��������Ԫ��
		fixedList.forEach(System.out::println);
		
		//error
		fixedList.add("cuiqin3");
		fixedList.add("cuiqin4");
	}
}
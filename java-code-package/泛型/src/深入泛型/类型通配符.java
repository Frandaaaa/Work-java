package ���뷺��;

import java.util.*;

/*
 * 	�������治ȷ���ļ����βζ���
 */

public class ����ͨ��� {
	public void test(List c)//List��һ���з��ͽӿ������Ľӿڣ�ʹ��List �ӿ�û�д���ʵ�����͵Ĳ�����������List�е�Ԫ�ص������ǲ�ȷ����
	{
		for(int i = 0; i < c.size(); i++)
		{
			System.out.println(c.get(i));
		}
	}
	
	//����һ�������д��
	public void test2(List<Object> c)//���ô˷��������ʵ�ʲ���ֵ���ܲ����������ڴ���
	{
		for(int i = 0; i < c.size(); i++)
		{
			System.out.println(c.get(i));
		}
	}
	//for example
	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<>();
		//��Ϊ����������ǰ���test2����
		//test2(strList);//The method test2(List<Object>) in the type ����ͨ��� is not applicable for the arguments (List<String>)
		
		//�ֿ��Կ�������
		Integer[] ia = new Integer[5];
		Number[] na = ia;//�����Ʋ���ȫ
		
		//na[0] = 0.5;//����ͨ���������в���
		
		List<Integer> iList = new ArrayList<>();
		//List<Number> nList = iList;//����ͳ���
		
		//�����뷺�͵�����Foo �� Bar �������� �������� Foo[] ��Ȼ�� Bar[] �����ͣ����Ƿ��Ͳ��ǣ�F<Foo> is not G<Bar>'s son-type
	}
}

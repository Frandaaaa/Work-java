package ���ͷ���;

import java.util.*;

//����һ��Object ���������Ԫ����ӵ�һ��Collection����
public class ���巺�ͷ��� {
	static void fromArrayToCollection(Object[] a, Collection<Object> c)//�������ޣ�����String����Object������
	{
		for(Object o : a)
		{
			c.add(o);
		}
	}
	public static void main(String[] args)
	{
		String[] strArr = {"a", "b"};
		List<String> strList = new ArrayList<>();
		//fromArrayToCollection(strArr, strList);//���뼴�����������໥��ͨ
	}
/*
 * 	��ʼ��ʽ���ܶ��巺ʽ������
 * 		��������ʱ������һ�����߶�������β�
 * 	���η� <T , S> ����ֵ���� ������(�β��б�)
 *  {
 *  	//������...
 *  }
 */
}

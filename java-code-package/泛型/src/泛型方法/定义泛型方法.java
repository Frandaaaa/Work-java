package ���ͷ���;

import java.util.*;

//����һ��Object ���������Ԫ����ӵ�һ��Collection����
public class ���巺�ͷ��� {
	
	/*
	static void fromArrayToCollection(Object[] a, Collection<Object> c)//�������ޣ�����String����Object������
	{
		for(Object o : a)
		{
			c.add(o);
		}
	}
	*/
	//����һ�����ͷ����������д�һ��T�����β�
										//T���飬		T����
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o: a) {
			c.add(o);
		}
	}
	
	public static void main(String[] args)
	{
		String[] strArr = {"a", "b"};
		List<String> strList = new ArrayList<>();
		//fromArrayToCollection(strArr, strList);//���뼴�����������໥��ͨ
		
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		
		//oa:Object���顢co:Object���ϡ�sa���ַ������顢cs���ַ�������
		
		//T=Object		
		fromArrayToCollection(oa, co);
		//T=String
		fromArrayToCollection(sa,cs);
		//T=Object������������ַ�����������Object����
		fromArrayToCollection(sa,co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList();
		
		//ia:�����ͣ�fa�������ͣ�na�������ͣ�cn�������ͼ���
		
		//T=Number
		fromArrayToCollection(ia,cn);
		//T=Number
		fromArrayToCollection(fa,cn);
		//T=Object
		fromArrayToCollection(na,cn);
		//T=Object��˵����Number�ǰ�����Object�������
		fromArrayToCollection(na,co);
		
		//ֱ�ӱ�����ΪNumber�Ȳ���String����Ҳ�����������࣬���Իᱨ��
		//fromArrayToCollection(na,cs);
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

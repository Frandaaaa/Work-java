package ������ת��;

import java.util.*;

//����ԭ������һ�����з�����Ϣ�Ķ��󸳸���һ��û�з�����Ϣ�ı���ʱ�������ڼ�����֮���������Ϣ�������ӵ���
// List<String> -> List ������Ԫ�ص����ͼ���������Ͳ���������(Object)

//��һ�������β�������Number����
class Apple<T extends Number>
{
	T size;
	public Apple() {}
	public Apple(T size) 
	{
		this.size = size;
	}
	public void setSize(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		return this.size;
	}
}
public class ���� {
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<>(6);
		//a��getSize()�������ص�Integer����
		Integer as = a.getSize();
		//��a���󸳸�Apple��������ʧ�����������������Ϣ
		Apple b = a;
		//��ʱb֪��a��size������Number,������Integer
		Number size1 = b.getSize();
		//�㿴�����������Integer����洢b��getSize�������ص�ֵ���ᱨ����
		//Integer size2 = b.getSize();//Type mismatch: cannot convert from Number to Integer
		
		//���ڷ��Ͷ��ԣ�����ֱ�Ӱ�һ��List ����ֱ�Ӹ���һ��List<String>���󣬱�����������ʾδ������ת��
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li;//�ᶪʧli�ķ�����Ϣ�����Ǽ��������������Ϣ�����͵Ĳ���
		//����־�����ʾ������objk��Java����ֱ�Ӱ�List���󸳸�һ��List<Type>(Type��������������)���͵ı���
		List<String> ls = list;
		//ֻҪ����ls�����Ԫ�أ�������쳣��
		System.out.println(ls.get(0));//���ǰ����е�Ԫ�ص���String���Ͷ���ȡ����ʱ��ͻ������쳣
		
		//һëһ���Ĵ��󣬿��Կ��������������ԭ��
//		List<Integer> li2 = new ArrayList ();
//		li2.add(4);
//		li2.add(5);
//		System.out.println((String)li2.get(0));
	}
}

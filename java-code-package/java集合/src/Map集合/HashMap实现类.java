package Map����;

import java.util.*;
/*
 * �� Hashtableʵ���������
 * 	Hashtable �̰߳�ȫ��Mapʵ�֣�����HashMap���̲߳���ȫ��ʵ�֣����ߵ����ܸ��ߣ�����̷߳���ͬһ��Map�����ǣ�ʹ��Hashtableʵ�������
 * 	Hashtable ������ʹ��null��Ϊkey��value��������HashMap����ʹ��null��ΪKey����Value
 */

/*
 * 	�жϻ��ƣ�
 * 		Hashtable �ж�value������һ������ͨ��equals()�����ȽϷ���true���ɣ������е�ht�����а�����һ��B����
 * 		Ҫ��дequals(Object obj) �� hashCode()�����ǣ�Ӧ�ñ�֤�����������жϱ�׼һ��--����equals()��ͬ����ôkey �� hashCode()����ֵҲӦ����ͬ
 */
class A
{
	int count;
	public A(int count)
	{
		this.count = count;
	}
	//�޸��ж���ȵķ���������countֵ
	public boolean equals(Object obj)
	{
		if(obj == this)
			return true;
		if(obj != null && obj.getClass() == A.class)
		{
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
	//����count������hashCodeֵ
	public int hashCode()
	{
		return this.count;
	}
}
class B
{
	//����b�࣬���˵ķ���
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashMapʵ���� {
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		//���Է�һ��keyֵ��null��
		hm.put(null, null);
		hm.put(null, null);
		
		//��ôvalueΪnull����
		hm.put("a", null);
		
		//���Map����
		System.out.println(hm);
		System.out.println("===========================");
		//���꣬����һ�����Ƽ�ʹ�õ���
		
		
		//�жϻ���
		Hashtable ht = new Hashtable();
		ht.put(new A(60000), "cuiqin1");
		ht.put(new A(87563), "cuiqin2");
		ht.put(new A(1232), new B());
		System.out.println(ht);
		//ֻҪ��������ͨ��equals()�����ȽϷ���true��Hashtable����Ϊ��������ȵ�value
		//Hashtable����һ��B���������κζ���ͨ��equals()�����Ƚ϶���ȣ�����
		System.out.println(ht.containsKey(new A(87563)));
		//delete the last key-value
		ht.remove(new A(1232));
		System.out.println(ht);
	}
}

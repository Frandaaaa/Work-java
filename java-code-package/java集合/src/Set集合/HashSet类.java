package Set����;

import java.util.HashSet;

/**
 * 	@see		java.����.���ϸ���.����		
 * 
 * 	as for the set collection : the program can't remmber the order of items and it can't include the 
 * 	same items or it will return error.
 * 
 * 	now we need to learn about the HashSet class
 */

class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}

class B
{
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	public int hashCode()
	{
		return 1;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}

public class HashSet�� {
	//����hash�㷨���洢�����е�Ԫ��
	/*	special points
	 * 		���ܱ�֤Ԫ������˳��˳����������˳��ͬ��˳��Ҳ�п��ܷ����仯
	 * 		HashSet����ͬ���ģ��������߳�ͬʱ����һ��HashSet �ж���߳�ͬʱ�޸���HashSet�����ǣ�����ͨ����������֤ͬ��
	 * 		����Ԫ��ֵ������null
	 * 
	 * 	�洢���̣����ö����hashCode() to get the hashCode --> �������ֵ������������HashSet�еĴ洢λ�ã����������Ԫ��ͨ��equals
	 * 	�����ȽϷ�����true �������ǵ�hashCode��������ֵ��ͬ����ô�ͻ�洢�ڲ�ͬ��λ��
	 * 		���ϣ�	�ж�����Ԫ����ȵı�׼�ǣ� ��������ͨ��equals()�Ƚ���ȣ��������������hashCode()��������ֵҲ���
	 */
	public static void main(String[] args)
	{
		HashSet books = new HashSet();
		//��Ӷ���
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		//������������󣬵���ֻ�������ĸ���A��B��������equals��hashcode��ֵ��ͬ�Ͳ����ж����
		System.out.println(books);
	}
	/*
	 * �ܽ᣺
	 * 		ʹ��hash������������(�洢�ٶ����(����Ϊhash����ͨ�������hashֵ���������λ�ã������鲻�ܸı䳤�ȶ�������ֵ�ǰ���˳������
	 * 
	 * 	��HashSet�д洢Ԫ�صĵط������Ǹ��ӣ���ͨ��equals�����ж�Ϊfalseʱ����洢�ڲ�ͬ�ĸ��ӣ���˻ᵼ�������½�
	 * 
	 * 	��дhashCode����ʱ����Ҫע�������
	 * 		ͬһ�������ε���hashCode() method needs to return the same pointer
	 * 		��������ͨ��equals����trueʱ�����������hashCode����Ӧ�÷�����ͬ��ֵ
	 * 		Ȼ����Ƕ���������equals()�����Ƚϱ�׼��ʵ��������Ӧ�����ڼ���hashCodeֵ
	 */
}

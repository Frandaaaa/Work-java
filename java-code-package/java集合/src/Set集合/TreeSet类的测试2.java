package Set����;

import java.util.TreeSet;

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	//��д�����������ж����
	public boolean equals(Object obj)
	{
		return true;
	}
	//�ٴ���д����:���Ƿ���һ������������Ϊ�������
	public int compareTo(Object obj)
	{
		return 1;
	}
}

public class TreeSet��Ĳ���2 {
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//���ͬһ������
		System.out.println(set.add(z1));//add successfully!
		
		System.out.println(set);
		//�޸ĵ�һ�����ϵı���
		((Z)(set.first())).age = 9;
		//����ڶ������Ϸ���Ҳ���޸��� -- �ɿ��������Ѿ����жϳ�Ϊ��ͬ�Ķ���
		System.out.println(((Z)(set.last())).age);
	}
	
}

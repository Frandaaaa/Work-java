package Set����;

import java.util.*;
/*
 * 	����Ȼ�����������Ȼ����������������
 */

//for example
class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "M[age:" + age + "]";
	}
}
public class TreeSet��Ķ������� {
	public static void main(String[] args)
	{
		//ʹ��lambda���ʽ
		TreeSet ts = new TreeSet((o1, o2) ->
		{
			M m1 = (M)o1;
			M m2 = (M)o2;
			//����M�����age������������С ,ageֵԽ��M���󷴶�ԽС
			return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
	}
	/*	ʵ�ֶ��������ʱ�򣬲�����TreeSet ��������Ͳ�ͬ�Ķ��󣬷���������쳣
	 * 	TreeSet��Ŭ����������Ԫ����ȵı�׼��ͨ��Comparator �Ƚ�����Ԫ�ط��� 0 ��ʱ�����Ԫ����ӵ�������
	 */
}

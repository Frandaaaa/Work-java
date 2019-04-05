package Set����;

import java.util.*;

/*
 * ��Ҫ��һ���������TreeSet��ʱ����Ҫ��֤�÷�����compareTo()��������һ�µĽ����ͨ��equals()���ǻ�true
 * ͨ��compareTo()����0	
 * �����������ͨ��compareTo(Object obj)�����ȽϷ���0����ͨ��equals��������false,������ӳɹ�
 * 
 * 	�����һ���ɱ�����Ժ󣬲��Һ���ĳ����޸��˸ÿɱ�����ʵ���������⽫�������������Ҷ���Ĵ�С˳�����ı䣬������
 * 	TreeSet�����ٴε������ǵ�˳���������ܵ���TreeSet�б�֤������������ͨ��compareTo()�����ȽϷ���0,
 */

//for example
class T implements Comparable
{
	int count;
	public T(int count)
	{
		this.count = count;	
	}
	public String toString()
	{
		return "T[count:"+ count + "]";
	}
	//��д���󷽷�
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == T.class)
		{
			T r = (T)obj;
			return r.count == this.count;
		}
		return false;
	}
	//�ٴ���д
	public int compareTo(Object obj)
	{
		T r = (T)obj;
		return count > r.count ? 1 : count <r.count ? -1 : 0;//������Ŀ���ʽ
	}
}

public class TreeSet��Ĳ���3 {
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new T(5));
		ts.add(new T(-3));
		ts.add(new T(9));
		ts.add(new T(-2));
		
		//�������������С��TreeSet
		System.out.println(ts);
		
		//get the first item
		T first = (T)ts.first();
		
		first.count = 20;
		
		T last = (T)ts.last();
		last.count = -2;
		
		//��ӡ��ʾ:û��˳���˶�
		System.out.println(ts);
		//ɾ�����ı��˵�Ԫ�أ�����
		//System.out.println(ts.remove(new R(-2)));//ɾ��ʧ��
		//System.out.println(ts);
		
		//ɾ��û�иı��˵�Ԫ�أ�����
		//System.out.println(ts.remove(new R(5)));
		//System.out.println(ts);
	}
}

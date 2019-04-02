package Set����;

import java.util.*;

class R
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode()
	{
		return this.count;
	}
}

public class rewriteHashCode {
	public static void main(String[] args)
	{
		System.out.println("��HashSet����ӿɱ�����ʱ�򣬿��ܵ��¸ö����뼯���е�����������ȣ�����HashSet�޷�׼ȷ���ʸö���");
		//�����ܵı����޸ļ���Ԫ���в�������hashCode(),equals()ʵ������������ᵼʦHashSet�޷���ȷ������Щ����Ԫ��
		HashSet<R> hs = new HashSet<R>();
		hs.add(new R(5));
		hs.add(new R(4));
		hs.add(new R(-9));
		hs.add(new R(-2));
		//print 
		System.out.println(hs);
		//first item
		Iterator<R> it = hs.iterator();
		R first = (R)it.next();
		first.count = 4;//���ڸ�д�������жϵ�equals()������hashCode()�������Ѿ�������׼ȷ����λ����
		//��ֵ�����ظ�Ԫ��
		System.out.println(hs);
		//delete the 4
		hs.remove(new R(4));
		
		System.out.println(hs);
		System.out.println("hs�Ƿ����4������" + hs.contains(new R(4)));
		System.out.println("hs�Ƿ����countΪ-2��R����" + hs.contains(new R(-2)));
	}
}

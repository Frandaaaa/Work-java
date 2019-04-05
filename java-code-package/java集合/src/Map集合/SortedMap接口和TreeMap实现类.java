package Map����;
import java.util.*;

/**
 * @author ����
 * 
 *  TreeMap�洢key-value ��ʱ����Ҫ����key�Խڵ��������TreeMap���Ա�֤���е�key-value�Դ���
 *  �����״̬
 * 
 * TreeMap Ҳ������������Ȼ���� �� ��������
 * 
 * �ж���ȵ������ǣ�����keyͨ��compareTo()��������0��TreeMap��Ϊ������key����ȵ�
 * 	��дequals()������compareTo()����ʱӦ�ñ���һ�µķ��ؽ��������equals()����true��ô
 * 	compareTo()��������0����һ��TreeMap��Map�ӿھͻ��ͻ������
 */

/*
 * Set �� Map ��ϵ�� java ��ʵ����HashMap and TreeMap ����
 * 	ͨ����װһ�����е�value��Ϊnull�ļ���ʵ����Set������
 * 	
 * 
 * 	TreeMap ���� --�� P244
 */

//for basic function

class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:"+ count + "]";
	}
	//����count �ж��Ƿ����
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	//�жϴ�С--����count����ֵ
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}

public class SortedMap�ӿں�TreeMapʵ���� {
	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "cuiqin1");
		tm.put(new R(-5), "cuiqin2");
		tm.put(new R(9), "cuiqin3");
		System.out.println(tm);

		//return the first Entry target��ע���ǰ����������Ժ��˳��
		System.out.println(tm.firstEntry());
		//���һ��key
		System.out.println(tm.lastKey());
		//���ر�new R(2) �����С key ֵ
		System.out.println(tm.higherKey(new R(2)));
		//����TreeMap��new R(2) С������key-value��, �Ƚϵ���value
		System.out.println(tm.lowerEntry(new R(2)));
		//�Ż�TreeMap����TreeMap
		System.out.println(tm.subMap(new R(-1), new R(4)));		
	}
}

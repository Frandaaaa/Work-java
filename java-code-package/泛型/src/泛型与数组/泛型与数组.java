package ����������;
import java.util.*;

public class ���������� {
	public static void main(String[] args)
	{
		List<?>[] lsa = new ArrayList<?>[19];
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(23));
		oa[1] = li;
		Object target = lsa[1].get(0);
		//��Ҫ����һ������Ԫ�صĵ�һ������Ԫ��ǿ������ת��ΪString����
		//������Ӧ���Լ�ͨ��intanceof ���������֤������������
		if (target instanceof String)
		{
			String s = (String) target;
		}
	}
}

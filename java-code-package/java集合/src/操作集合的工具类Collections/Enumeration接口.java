package �������ϵĹ�����Collections;

import java.util.*;

/**
 * 	����ӿں��ǹ��ϣ��򵥽���һ�¹��ϵķ���
 * 		only two methods
 * 			boolean hasMoreElement() ����������ʣ�µ�,����true
 * 			Object nextElement()	 ���ص���������һ��Ԫ��
 *
 *	Ϊ���չ���Щ���ϵĳ���û��ɾ������
 */

//��ֹ�ʵ����java��ʷ����򵥽���һ�·�����ʹ��
public class Enumeration�ӿ� {
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("cuiqin1");
		v.add("cuiqin2");
		Hashtable scores = new Hashtable();
		scores.put("A", 1);
		scores.put("B", 2);
		Enumeration em = v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		Enumeration keyEnum = scores.keys();
		while(keyEnum.hasMoreElements())
		{
			Object key = keyEnum.nextElement();
			System.out.println(key + "--->" + scores.get(key));
		}
	}
}

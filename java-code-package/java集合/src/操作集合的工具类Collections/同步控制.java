 	 	package �������ϵĹ�����Collections;

import java.util.*;

/**
 * 	�ṩ�˶��synchronizedXxx() method,�����ܹ����ƶ��ļ��ϰ�װ��Ϊ�߳�ͬ���ļ���
 * 		�Ӷ����Խ�����̲߳������ʼ���ʱ���̰߳�ȫ����
 *	����෽������װһ��
 */
public class ͬ������ {
	public static void main(String[] args)
	{
		//������4���̰߳�ȫ�ļ��϶���
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
		//ţ�ƣ�ֱ�ӻ�ȡ�̰߳�ȫ�ķ���
		
	}
}

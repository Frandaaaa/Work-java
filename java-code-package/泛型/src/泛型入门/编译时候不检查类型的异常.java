package ��������;

import java.util.*;

/*
 *	��ǿ������ת���й�
 *	����˵���Լ�ס�����е�Ԫ�ص����ͣ�������Ԫ�ص����ͣ������򼯺�����Ӳ��������͵Ķ���
 *
 * 	������⣺������뼯�ϣ����ϻ��������������������ͣ��ٴ�ȡ��ʱ���������;ͱ��object
 */

public class ����ʱ�򲻼�����͵��쳣 {
	public static void main(String[] args)
	{
		//����һ��ֻ�뱣���ַ����ļ���
		List strList = new ArrayList();
		strList.add("cuiqin1");
		strList.add("cuiqin2");
		//�Ž�ȥ����
		strList.add(5);
		strList.forEach(str -> System.out.println(((String)str).length()));
		//�����쳣!
	}
}

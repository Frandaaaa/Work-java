package ����ת��;
/**
 * Description:���ʽ���Զ�ת��
 * <br>��վ:<a href="https://www.baidu.com">�ٶ�</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author ����
 * @version 1.0
 */

public class ���ʽ�Զ�ת�� {
	public static void main(String[] args)
	{
		//���ʽ�е���int�Զ����
		//���������Զ�����������ʽ����ߵȼ�������ͬ��������
		//short a = 3;���ʽ������int
		//a = a - 2;��a��short ����ֵ �� int ���ͱ���
		
		byte b = 29;
		char c = 'a';
		int i = 234;
		double d = .23;
		//���ϱ��ʽ�����Ϊdouble���ʹ��double
		double result = b*c+d*i;
		System.out.println(result);
		
		//���Ϊ����ֵint
		int  a = 23;
		int resulter = a/7;
		//���������ؼ��ʱ���
		System.out.println(resulter);
		
		//��⣡
		//�ַ��������Զ���Ϊ�ַ������㡣���ʽ�����Զ�ת����������
		System.out.println("Hello\t"+'a'+7);
		System.out.println('a'+7+"\tHello");
		//���ʽ�������Ҽ���
	}
}

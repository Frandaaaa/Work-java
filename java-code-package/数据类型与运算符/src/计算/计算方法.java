package ����;
/**
 * Description:���������
 * <br>��վ:<a href="https://www.baidu.com">�ٶ�</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author ����
 * @version 1.0
 */

public class ���㷽�� {
	public static void main(String[] args)
	{
		/** ����������У�
		 * +
		 * -
		 * *
		 * /	-->	
		 * 			�����������͵õ����ݽ��������һ�������������Ը��Ӿ�ȷ
		 * %	-->	
		 * ++
		 * --
		 */
		//��������������������������һ�������������Ǹ�������������ڶ���������������0or0.0��֪ʶ��������Ľ����NaN��
		System.out.println(5%0.0);
		/**
		 * �Լӣ�++
		 * ��������Ϊ������������Ϊ������ֵ�͵ı�����������λ��Ӱ�������� 
		 */
		int a = 5;
		//���������Լӣ����ҷ��֣��Լ��൱�ڶ���һ�У�a = a + 1;
		int b = a++ + 9;
		//��ʱa=6;
		//���Լ�������
		int c = ++a + 9;
		System.out.print(b+"\n"+c);
		
	}
}

package ����ת��;
/**
 * Description:ǿ��ת��
 * <br>��վ:<a href="https://www.baidu.com">�ٶ�</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author ����
 * @version 1.0
 */
public class ǿ��ת�� {
	public static void main(String[] args)
	{
		//˵��ת������char -->
		//						int --> long --> float --> double
		//	  byte --> short -->
		//ǿ��ת������������ݶ�ʧ
		int iValue = 233;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		
		double dValue = 3.43;
		
		int tol = (int)dValue;
		
		System.out.println(tol);
		
		//��������ַ���ѭ������
		String result = "";
		for(int i = 0; i<6;i++)
		{
			int intVal = (int)(Math.random() * 26 + 97);
			result = result + (char)intVal;
		}
		System.out.println(result);
		
		//����С���Զ�Ĭ��Ϊdouble�������ֱ��ת��
		//float a = 2.3;
		float a = (float)2.354565415;
		System.out.println(a);
	}
}

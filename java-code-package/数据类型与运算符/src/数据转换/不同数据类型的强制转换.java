package ����ת��;
/**
 * Description:���ܰ�װ����
 * <br>��վ:<a href="https://www.baidu.com">�ٶ�</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author ����
 * @version 1.0
 */

public class ��ͬ�������͵�ǿ��ת�� {
	public static void main(String[] args)
	{
		//�ַ���ת��Ϊint��������
		String a = "";
		String b = "123";
		//��װ����
		//Integer�������� ����
		//int --> Integer.parseInt
		//boolean --> Boolean.parseBoolean
		//byte --> Byte.parseByte
		//short --> Short.parseShort
		//long --> Long.parseLong
		//float --> Float.parseFloat
		//double --> Double.parseDouble
		boolean iValue = Boolean.parseBoolean(a);
		int in = Integer.parseInt(b);
		System.out.print(iValue + b);
	}
}

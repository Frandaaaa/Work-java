package DataChanges;
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

public class firstMethod {
	public static void main(String[] args)
	{
		//�ַ���ת��Ϊint��������
		String a = "23";
		//��װ����
		//Integer�������� ����
		//boolean --> Boolean.parseBoolean
		//byte --> Byte.parseByte
		//short --> Short.parseShort
		//long --> Long.parseLong
		//float --> Float.parseFloat
		//double --> Double.parseDouble
		double iValue = Double.parseDouble(a);
		
		System.out.print(iValue);
	}

}

package Hello_Java;
/**
 * Description:ֵ��һ����ǣ����ڶ���������ת����Ҫ�����˽�
 * <br>��վ:<a href="https://www.baidu.com">�ٶ�</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:�����������
 * <br>Date: 2019.2.28
 * @author ����
 * @version 1.0
 */
public class ������ {
	public static void main(String[] args)
	{
		byte s = 34;
		//����������ݹ�����Ҫʹ��long��������������Ҫ����Ҫ�����ݵ�ĩβ����L����Ȼ���ִ�Сд������l���׻���
		long a = 9999999999999L;
		//����ֵ��==����������
		int ocaralValue = 013;//�˽��ƣ�0
		int hexValue = 0x23;//ʮ������:0x��0X
		int binValue = 0b1000000;//������:0b����0B
		
		//����������Զ�ת����Ϊ��ʮ������
		System.out.println(a+s);
		System.out.println(ocaralValue);
		System.out.println(hexValue+"\n"+binValue);
	}
}

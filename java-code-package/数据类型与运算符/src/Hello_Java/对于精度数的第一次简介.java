package Hello_Java;
/**
 * Description:��鸡����
 * <br>��վ:<a href="https://www.baidu.com">�ٶ�</a>
 * <br>Copyright (C), 2019-2024, Cuiqin
 * <br>This program is protected by copyright laws,
 * <br>Program Name:
 * <br>Date: 2019.2.28
 * @author ����
 * @version 1.0
 */
public class ���ھ������ĵ�һ�μ�� {
	public static void main(String[] args)
	{
		//float����Ҫ�ڸ�ֵ�����ݺ������f/F��ͬ��double����Ҫ����d/D
		
		float af = 3.343434f;
		
		System.out.println(af);
		
		//�������
		double a = 0.0;
		
		System.out.println(34/a);
		//����System.out.println( 0/0);
		
		//���������ĸ���,���ָ��������͵�����һ��
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		
		System.out.println(c==d);
	}
}

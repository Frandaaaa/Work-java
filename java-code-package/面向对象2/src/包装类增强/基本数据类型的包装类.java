package ��װ����ǿ;
/**
 * @see		���������������.����ת��.��ͬ�������͵�ǿ��ת��
 * @date	2019/3/12
 * @author 	����
 */
public class �����������͵İ�װ�� {
/**
 * 	ע�����õ��ļ��Ѿ������˰��ֻ����������͵İ�װ����
 * 	byte/short/long/float/double/boolean�İ�װ�����ƽ�����ĸ��д
 * 	���⣺	int	--	Interger
 * 			char--	Character
 */

/**
 * 	�Զ����䣺ֱ�ӰѰ�װ�����ֱ�Ӹ���һ����Ӧ�Ļ������ͱ���
 * 	�Զ�װ�䣺��һ����������ֱ�Ӹ�����Ӧ�İ�װ��������򸳸�Object����
 * 	!�Զ���װ������ͱ���һһ��Ӧ
 */
	public static void main(String[] args)
	{
		Integer inObj = 5;
		Object boolObj = true;
		int it = inObj;
		if(boolObj instanceof Boolean)
		{
			boolean b = (Boolean)boolObj;//object -- boolean
			System.out.println(b);
		}
/**
 * 	���������������ַ������͵�ת��
 * 	����Character��������а�װ�඼�ṩ�˾�̬������paraseXxx()
 */
	//�ַ���ת���ɻ�����������
	String intStr = "123";//�Ը���
	int it1 = Integer.parseInt(intStr);
	int it2 = new Integer(intStr);//�����˹����� Xxx()
	System.out.println(it2);
	
	String floatStr = "4.56";
	float ft1 = Float.parseFloat(floatStr);
	float ft2 = new Float(floatStr);//���԰ѻ������͵ı������Ƶ�������ʹ��	Ҳ���԰ɰ�װ���ʵ�����ɻ��������ı���ʹ��
	System.out.println(ft2);
/**
 * 	�ַ������͵�ֵת����Ϊ�������ͣ�valueOf()
 */
	//������������ת����Ϊ�ַ���,��������""������������
	String ftStr = String.valueOf(2.23f);
	String SeStr = String.valueOf(3.114);
	String thStr = String.valueOf(true);
	System.out.println(ftStr+" "+SeStr+" "+thStr);
	
	String inStr = 3 + "";
	System.out.println(inStr);
	}
}

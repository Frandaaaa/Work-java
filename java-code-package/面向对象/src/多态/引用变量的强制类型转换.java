package ��̬;
/**
 * 	@see ���̿���������.ʹ������||���������������.����ת��.ǿ��ת��
 * 	@author ����
 * 
 * 	���ñ���ֻ�ܵ���������ʱ���͵ķ���
 *	��ʹ�ã�ǿ������ת��
 *	(type)variable
 *
 *	ע�⣺
 *		��������֮���ת��ֻ������ֵ����֮�����!��ֵ����!��int��float��double;������boolean
 *		�������͵�ת��ֻ���ھ��м̳й�ϵ����������֮��ת����
 *			ͬʱ��ͼ��һ�������ʵ��ת�����������ͣ�Ӧ���ǣ�����ʱΪ���࣬����ʱΪ����
 */ 
public class ���ñ�����ǿ������ת�� {
	public static void main(String[] args)
	{
		double d = 23.4;
		long l = (long)d;
		//String l = (String)d;
		System.out.println(l);
		
		int in = 8;
		//boolean b = (boolean)in;
		//Object��String���ڼ̳й�ϵ������ǿ������ת��
		//���е�objʵ��������String������ͨ��
		Object obj = "Hello";
		String objStr = (String)obj;
		System.out.println(objStr);
		//����~
		//Object objPri = new Interger(5);
		//Object��Interger���ڼ̳й�ϵ
		//String str = (String)objPri;
		//����[Interger](https://www.cnblogs.com/zwxblog/p/7788573.html)
		
		//ʹ����׳�ķ���:���ڴ�����Ч��ȫ��ע��
		//Object objPri = new Interger(5);
		//if(objPri instanceof String)//����instanceof�����ж�
		//{
		//		String str = (String)objPri;
		//}
	}
/**
 * 		����-->���ࣺupcasting:����ת�ͣ����ǿ��Գɹ���ֻ�Ǳ�������ʱ�����Ǹ��࣬ʵ��ִ�����ķ�������Ȼ���ֳ�����������Ϊ��ʽ
 * 		����<--���ࣺǿ������ת��
 */
	 
}

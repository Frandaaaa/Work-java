package ���ͷ���;
/*	����
 * 		����ͨ�����÷��������������ƶ����Ͳ�����Ŀ������
 * 		�����ڷ��������������ƶϵĵ������Ͳ������ݵ����һ������
 */

class MyUtil<E>
{
	public static <Z> MyUtil<Z> nil() 
	{
		return null;
	}
	public static <Z> MyUtil<Z> cons(Z head, MyUtil<Z> tail)//ǰ�������һ�£��Ϳ���ͨ��ǰ������ƶϺ����
	{
		return null;
	}
	E head()
	{
		return null;
	}
}

public class Java8�Ľ��������ж� {
	public static void main(String[] args)
	{
		//����ͨ��������ֵ��Ŀ��������ƶ����Ͳ���String
		MyUtil<String> ls = MyUtil.nil();
		//���������鷳������
		//MyUtil<String> mu = MyUtil.<String>nil();
		//����cons()��������Ĳ����������ƶ����Ͳ���ΪInteger
		MyUtil.cons(42, MyUtil.nil());
		//���������鷳������
		//MyUtil.cons(42,MyUtil.<Integer>nil());
	}
}

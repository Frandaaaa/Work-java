package �ڲ���;
/*
 * 	�ڷ����ж�����ڲ�����һ���ֲ��ڲ��࣬�����ڸ÷�������Ч������ʹ�÷��ʿ��Ʒ���static���η�����
 * 
 * 	���еľֲ���Ա������ʹ��static���Σ������������ڷ����������ĳ�������ԶҲ�����ܷ�����һ�������еľֲ���Ա�����еľֲ���Ա������ʹ�÷��ʿ��Ʒ�����
 * 
 * 	������̫С����ʵ����ʹ�õĲ���
 */
public class �ֲ��ڲ��� {
	public static void main(String[] args)
	{
		class InnerBase
		{
			int a;
		}
		//�����ڲ��������
		class InnerSub extends InnerBase
		{
			int b;
		}
		//�����ֲ��ڲ���Ķ���
		InnerSub is = new InnerSub();
		is.a = 4;
		is.b = 7;
		System.out.println("�ڲ����к��ڲ���������������Ա�����ĺͣ�"+(is.a+is.b));
	}
}

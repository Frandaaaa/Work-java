package final���η�;

public class final�ֲ����� {
	public void test(final int a)
	{
		//final���ε��ββ��ܱ���ֵ
		//a = 5;
		System.out.print(a);
	}
	public static void main(String[] args)
	{
		//����ʱ���Ը�ֵ�����û�У����ҽ���һ�λ��ḳֵ
		final int a;
		a = 6;
		final String str = "cuiqin";
		//str = "xiaocui";
		final�ֲ����� p = new final�ֲ�����();
		//ϵͳ���ݴ���Ĳ�������ɳ�ʼ��
		p.test(34);
	}
}

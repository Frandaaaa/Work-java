package thisʵ��;

public class this�ڹ����� {
	//��Ա����
	public int foo;
	public this�ڹ����� ()
	{
		//����������
		int foo = 0;//�ֲ������
		//this:�ù��������ڳ�ʼ���Ķ���
		//���������ڳ�ʼ���Ķ���foo��Ա������Ϊ5
		this.foo = 5;//�����ⲿ�����
		/**
		 * this�������ù��������ڳ�ʼ���Ķ���
		 * this.foo = 5;��ִ�г�ʼ�������ڶ����foo��Ա������Ϊ����
		 * �󲿷�ʱ�򣬹������з���������Ա�����ͷ���ʱ������ʡ��this
		 * �����㿴������������һ��ͬ���ľֲ�������������this
		 */
	}
	public static void main(String[] args)
	{
		System.out.println(new this�ڹ�����().foo);//��������������еĳ�Ա����
	}
}

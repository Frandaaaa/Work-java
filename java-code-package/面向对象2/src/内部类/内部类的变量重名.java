package �ڲ���;

//�������ⲿ���Ա�������ڲ����Ա�������ڲ�����ķ����ֲ�����ͬ��
//��ʹ��this������
public class �ڲ���ı������� {
	private String prop = "�ⲿ���ʵ������";
	private class InClass
	{
		private String prop = "�ڲ����ʵ������";
		public void info()
		{
			String prop = "�ڲ���ķ����ľֲ�����";
			//�ⲿ����.this.varName �����ⲿ���ʵ������
			System.out.println("�ⲿ���ʵ������"+�ڲ���ı�������.this.prop);
			//ͨ��this.varName �����ڲ������
			System.out.println("�ڲ����ʵ������:"+this.prop);
			//ֱ�ӷ����Լ���
			System.out.println(prop);
		}
	}
	public void test()
	{
		InClass in = new InClass();
		in.info();
	}
	public static void main(String[] args)
	{
		new �ڲ���ı�������().test();
	}
}

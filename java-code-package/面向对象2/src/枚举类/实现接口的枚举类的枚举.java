package ö����;

//
public enum ʵ�ֽӿڵ�ö�����ö�� implements ʵ�ֽӿڵ�ö����Ľӿ� {
	//ʵ�ֽӿں����з�����

	//�˴���ö��ֵ��������Ӧ�Ĺ�����������
//	MALE("��"),FAMALE("Ů");//�൱��newһ������
//	private final String name;
//	//ö�ٵĹ�����ֻ����private ������
//	private ʵ�ֽӿڵ�ö�����ö��(String name)
//	{
//		this.name = name;
//	}
//	public String getName()
//	{
//		return this.name;
//	}
//	
//	//ʵ�ֽӿڱ���ʵ�ֵķ���
//	public void info()
//	{
//		System.out.println("���ڶ����Ա��ö����");
//	}
	
	//ö������ʵ�ֽӿ���ķ�����ÿ��ö��ֵ�ڵ��ø÷���ʱ������ͬ�ģ���������ͬ��
	//��ͬö��ֵ�Ĳ�ͬ����Ϊ��ʽ
	
	//MALE and FAMALE ʵ�������������ʵ���������ǳ���ö�����ʵ��
	MALE("��")
	{
		//���岿�֣��൱�ڴ������������ࣺ����ö���಻����final������������������࣬ʹ��abstract����
		public void info()
		{
			System.out.println("ö��ֵ��������");
		}
	},
	FAMALE("Ů")
	{
		public void info()
		{
			System.out.println("ö��ֵ����Ů��");
		}
	};
	private final String name;
	//ö�ٵĹ�����ֻ����private ������
	private ʵ�ֽӿڵ�ö�����ö��(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
}

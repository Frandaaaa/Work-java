package ö����;

/**
 * 	ö����ͨ��Ӧ����Ƴɲ��ɱ��࣬��Ա����������ı䣺Ӧ�ý�����private final����
 * 	��ʱ����Ҫ��ʾ����������Ĺ��������ڹ�������Ϊ��Щ��Ա����ָ����ʼֵ
 * 	��ʾ�����˴������Ĺ��������г�ö��ֵʱ�ͱ����Ӧ�ش������
 */

public enum Gender {
	//�˴���ö��ֵ��������Ӧ�Ĺ�����������
	MALE("��"),FAMALE("Ů");//�൱��newһ������
	private final String name;
	//ö�ٵĹ�����ֻ����private ������
	private Gender(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}

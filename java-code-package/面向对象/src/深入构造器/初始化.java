package ���빹����;
public class ��ʼ�� {
	//�������һ�������ϣ�û��ϵͳ�Զ�����
	//��ʼ�����������ã�ʵ������
	public String name;
	public int age;
	public ��ʼ��(String name,int age)//woc�����������
	{
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args)
	{
		��ʼ��  p = new ��ʼ��("����",18);
		System.out.println(p.name);
		System.out.println(p.age);
	}
}

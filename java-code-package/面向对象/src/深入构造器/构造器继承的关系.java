package ���빹����;

class Creature{
	public Creature()
	{
		System.out.println("үү�Ļ����޲���������");
	}
}

class Animal extends Creature{
	public Animal(String name)
	{
		//������������
		System.out.println("�ְִ�һ�������Ĺ�������ʱ��name��"+name);
	}
	public Animal(String name, int age)
	{
		this(name);
		System.out.println("�ְִ����������Ĺ����������������ͱ���ֵΪ��"+age);
	}
}
public class �������̳еĹ�ϵ extends Animal {
	public �������̳еĹ�ϵ()
	{
		super("����",18);
		System.out.println("�����޲����Ĺ�����");
	}
	public static void main(String[] args)
	{
		new �������̳еĹ�ϵ();
	}
	//Ĭ��ִ���޲�������������������
}

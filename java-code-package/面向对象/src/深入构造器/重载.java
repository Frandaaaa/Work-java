package ���빹����;

public class ���� {
	//������������������һ�£����ؼ��������������β��б���벻һ��
	public String name;
	public int count;
	//�޲���������
	public ����() {}
	//��һ���ṩ������
	public ����(String name , int count)
	{
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args)
	{
		//�޲�����������
		���� p1 = new ����();
		//�в���
		���� p2 = new ����("����",18);
		System.out.println(p1.name+" "+p1.count);
		System.out.println(p2.name+" "+p2.count);
	}
	
}

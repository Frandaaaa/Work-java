package ��ʼ����;
//static ���Σ����ʼ��/��̬��ʼ�� �� ||û�У���ͨ���Զ���
//���ң���̬��ʼ�����������ʼ���׶ξ�ִ�У�����ͨ��ʼ�������ȣ���̬��Ա����
//����һ�����е�����

class Root{
	static {
		System.out.println("Root�ľ�̬��ʼ");
	}
	{
		System.out.println("Root����ͨ");
	}
	public Root()
	{
		System.out.println("Root�Ĺ�����");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid�ľ�̬��ʼ");
	}
	{
		System.out.println("Mid����ͨ");
	}
	public Mid()
	{
		System.out.println("Mid���޲���������");
	}
	public Mid(String msg)
	{
		//����ͬһ��Ĺ�����
		this();
		System.out.println("Mid�Ĳ���������");
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf�ľ�̬��ʼ");
	}
	{
		System.out.println("Leaf����ͨ");
	}
	public Leaf()
	{
		//���õ����Ĺ�����
		super("aa");
		System.out.println("Leaf���޲���������");
	}
}
public class ��̬��ʼ���� {
	public static void main(String[] args)
	{
		new Leaf();
		new Leaf();
	}
}
//������ֱ�ӿ���ִ��˳��
//ע�⣺java���ز���ʼ��ĳ���࣬���Ǳ�֤���и���ȫ�����ز��ҳ�ʼ��
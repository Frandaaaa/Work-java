package ������;

public class ���󷽷��ͳ���������� extends ���󷽷��ͳ����� {
	//��ʵ�ɣ�����һ����������
	private double a;
	private double b;
	private double c;
	public ���󷽷��ͳ���������� (String color, double a, double b, double c)
	{
		super(color);
		this.setSides(a,b,c);
	}
	public void setSides (double a, double b, double c)
	{
		if(a >= b + c || b >= a + c || c >= a + b)
		{
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//��д����ĳ��󷽷�
	public double calPerimeter()
	{
		return a + b + c;
	}
	//��д���ص���״����
	public String getType()
	{
		return "������";
	}
}

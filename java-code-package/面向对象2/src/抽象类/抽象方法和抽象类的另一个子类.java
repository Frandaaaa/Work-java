package ������;
/**
 * @see	         ��Զ���.��̬.��̬����
 * @author ����
 *
 */

public class ���󷽷��ͳ��������һ������ extends ���󷽷��ͳ����� {
	
	//��ʵ�ɣ�����һ����������
	private double radius;
	public ���󷽷��ͳ��������һ������ (String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	//��д����ĳ��󷽷�
	public double calPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	//��д���ص���״����
	public String getType()
	{
		return getColor() + "Բ��";
	}
	public static void main(String[] args)
	{
		//�����˶�̬�������˴Ӹ���̳еķ���
		���󷽷��ͳ����� s1 = new ���󷽷��ͳ����������("black", 3, 4 ,5);
		���󷽷��ͳ����� s2 = new ���󷽷��ͳ��������һ������("yellow",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
/**
 *	ʹ��abstract������ʱ����ʾ�����ֻ�ܱ��̳�	�������������������ṩʵ��(��д)
 *	finalǡ���෴���������ͬʱʹ���������η�
 *	ע�⣺static��abstract���ǻ���ģ���Ȼ����ͬʱ����ĳ�����������ǿ���ͬʱ�����ڲ���
 *	ע�⣺��������뱻������д�������壬���򷽷�û�з����壬�����಻�ܶ���Ϊprivate��������������ͬʱ���η���
 */
}

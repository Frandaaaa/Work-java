package ������;
/**
 * @see
 * @author ����
 *
 */

/**	���壿
 * 	�������һ�����������в�ͬ�ķ�����a()
 * 	������������a��������Ҫǿ��ת����Ϊ�������Ͳſ��Ե���a����
 * 	Ϊ�˰���a�����������跽��ʵ�֣�ʹ�ó��󷽷�
 */

/**
 * 	������ͳ��󷽷���
 * 		������ʹ��abstract������
 * 		���󷽷������з�����
 * 		�������󷽷�����ֻ�ܱ�����Ϊ�����࣬�������п��Բ���Ҫ�������󷽷�
 * 		�����಻�ܱ�ʵ����������newһ���������
 * 		�����ࣺ��Ա������������������(��Ҫ��Ϊ�����������)����ʼ���顢�ڲ���(�ӿں�ö��)
 * 		ֻ�ܱ�����Ϊ�����ࣺ
 * 			ֱ�Ӷ�����һ�����󷽷�
 * 			�̳��˳����࣬����û����ȫʵ�ָ�������ĳ��󷽷�
 * 			ʵ����һ����ڣ�û����ȫʵ�ֽӿڰ����ĳ��󷽷�
 * 	�ܽ᣺��������԰������󷽷������ܴ���ʵ��
 */

//���󷽷���public abstract void test();�շ����壺public void test(){}

public abstract class ���󷽷��ͳ����� {
	{
		System.out.println("ԭʼ�����ͨ��ʼ����");
		
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	
	//��������õĹ�����
	public ���󷽷��ͳ����� () {}
	public ���󷽷��ͳ����� (String color)
	{
		System.out.println("ִ��Shape�Ĺ�����");
		this.color = color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
}

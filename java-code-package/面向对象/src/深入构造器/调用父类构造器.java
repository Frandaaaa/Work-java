package ���빹����;

//һ��Դ�ļ���������ж����ͨ�࣬���ܱ�public �����Σ�
//ֱ���ڹ����������ø��׵Ĺ�����
class base {
	public double size;
	public String name;
	public base(double size,String name)
	{
		this.size = size;
		this.name = name;
	}
}
public class ���ø��๹���� extends base {
	public String color;
	public ���ø��๹����(double size ,String name, String color)
	{
	/**	
	 * �������й����������ƶ�һ������Ǹ����β��б��ж�����Ҫ���õĹ��������
	 * ����super�����ø��๹���������������ڵ�һ��
	 * 
	 * ���๹�������ø��๹������
	 * 	super
	 * 	this���Ե��ñ��������صĹ�������ϵͳ����this�����ﴫ��ʵ���б���ñ����е���һ������������ʱִ��ʱ����ø��๹����
	 * 	û��super��this��ϵͳ������ִ�����๹����֮ǰ����ʽ���ø����޲����Ĺ�����
	 */
		super(size,name);
		this.color = color;
	}
	public static void main(String[] args)
	{
		���ø��๹���� p = new ���ø��๹����(5.6,"����","red");
		//���Գɹ��õ��ı���ֵ
		System.out.println(p.color+" "+p.name+" "+p.size);
	}
}

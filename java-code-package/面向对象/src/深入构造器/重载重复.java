package ���빹����;

public class �����ظ� {

	//������ϵ�Ĺ�����������
	public String name;
	public String color;
	public double weight;
	public �����ظ�() {}
	public �����ظ�(String name , String color)
	{
		this.name = name;
		this.color = color;
	}
	public �����ظ�(String name , String color , double weight)
	{
		//ͨ��this��������һ�����صĹ������ĳ�ʼ������
	/**
	 * 	ע�����ʹ��this������һ�����صĹ�����ֻ���ڹ�������ʹ�ã�������Ϊ������ִ����ĵ�һ�����
	 *  ��Ҫ���Ÿ������ã�Υ�����������˼��
	 */
		this(name,color);
		//���ô˹�����
		this.weight = weight;	
	}
	public static void main(String[] args)
	{
		�����ظ� p = new �����ظ�("����","yellor",120);
		System.out.print(p.name+" "+p.color+" "+p.weight);
	}
}

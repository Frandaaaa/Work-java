package �������;

class Apple
{
	//toString��Ϊ�˸��õ�������������ڵ�
	private String color;
	private double weight;
	public Apple(){}
	
	//�в����Ĺ�����
	
	public Apple(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	//��дtoString�����������򵥵�������
	//	public String toString()
	//	{
	//		return "һ��ƻ������ɫ�ǣ�" + color + "�������ǣ�" + weight;
	//	}
	//��׼��ʽ������[field1 = 1,field2 = 2,...]
	public String toString()
	{
		return "Apple[color="+color+",weight="+weight+"]"; 
	}
}

public class �Զ���toString���� {
	public static void main(String[] args)
	{
		Apple a = new Apple("red",488);
		System.out.println(a);
	}
}


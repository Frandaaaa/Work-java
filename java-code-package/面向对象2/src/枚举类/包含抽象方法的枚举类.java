package ö����;

public enum �������󷽷���ö���� {
	//ʵ�ּӼ��˳�
	PLUS
	{
		public double eval(double x, double y)
		{
			return x + y;
		}
	},
	MINUS
	{
		public double eval(double x, double y)
		{
			return x - y;
		}
	},
	TIMES
	{
		public double eval(double x, double y)
		{
			return x * y;
		}
	},
	DIVIDE
	{
		public double eval(double x, double y)
		{
			return x / y;
		}
	};
	//����Ϊ�����ö�ٶ�����󷽷�
	//ö�����ɲ�ͬ��ö��ֵ���ṩ�Ĳ�ͬ��ʵ��
	public abstract double eval(double x, double y);
	public static void main(String[] args)
	{
		System.out.println(�������󷽷���ö����.PLUS.eval(2, 3));
		System.out.println(�������󷽷���ö����.MINUS.eval(2, 3));
		System.out.println(�������󷽷���ö����.TIMES.eval(2, 3));
		System.out.println(�������󷽷���ö����.DIVIDE.eval(2, 3));
	}
}

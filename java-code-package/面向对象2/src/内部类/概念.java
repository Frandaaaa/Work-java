package �ڲ���;
/**
 * 	@see	�������.���غͷ�װ.���ʿ��Ʒ�
 * 	Ƕ�׹�ϵ���ڲ��������==�ⲿ��/������
 * 	��װ!�ڲ����������ⲿ���в�����ͬ�����������
 * 	��ϰɣ����࣬��Ҫ��������࣬������ֻ���������ڲ���Ч������ûɶ�ã�������Զ����Ϊ�ڲ���
 * 	�ڲ���������ɷ����ⲿ�������,�����������صı���(private)�����ⲿ�಻�ܷ���ϸ�ڣ��ڲ����Ѿ����Ա��������ⲿ��ĳ�Ա����Ա֮������໥����
 *	�����ڲ��������ڽ���Ҫʹ��һ�ε���
 */
/**
 * 	�ڲ���--���� private protected static �ⲿ�಻��ʹ��(���)
 * 	�Ǿ�̬�ڲ��಻��ӵ�о�̬��Ա��
 * 
 * 	public class OuterClass
 * {
 * 	//�����ڲ��ࣺ����������ڲ����κ�λ��
 * }
 * 
 * 	ֻ�г�Ա�ڲ������һ�����Ա�����е��Ǿֲ��ڲ���ͺ������ڲ���
 * 	��̬�ڲ���ͷǾ�̬�ڲ���
 */
/**
 * 	�ⲿ��ֻ������������ͬ�ڸ����ں��κ�λ�ã�ֻ��Ҫ���ַ���Ȩ�а��������ʺ͹������� Ȩ�� ʡ�Է��ʿ��Ʒ���public���ʿ��Ʒ�
 * 	һ���ⲿ�಻ʹ���κη��ʿ��Ʒ����Σ���ôֻ�ܱ�ͬһ�����е��������
 *	�ڲ�����ĸ�������ͬ�࣬ͬ���������������λ�ã�������Ӵ���ַ��ʿ��Ʒ�
 */
public class ���� {
	private double weight;
	//�ⲿ��Ĺ�����
	public ����(){}
	public ����(double weight)
	{
		this.weight = weight;
	}
	//����Ǿ�̬�ڲ��ࣺ��ʹ��ƽ����û�������
	private class ������ڲ���
	{
	/**
	 * 	���Ǿ�̬�ڲ��෽������ĳ�������������ڲ��ľֲ����� --�� �������ڲ��� --�� ���������ڲ��� --�� �ڲ��������ⲿ��
	 */
		//ʵ������
		private double length;
		private String color;
		private int a = 23;//�ⲿ��Ҫ���ʣ���Ҫ����������ֱ�ӷ���
		
		public ������ڲ���() {}
		public ������ڲ���(double length, String color)
		{
			this.length = length;
			this.color = color;
		}
		public void setLn(double length)
		{
			this.length = length;
		}
		public double getLn()
		{
			return this.length;
		}
		public void setColor(String color)
		{
			this.color = color;
		}
		public String getColor()
		{
			return this.color;
		}
		//ʵ������
		public void info()
		{
			System.out.println("��ǰ����ɫ��"+color+",��"+length);
			//����ֱ�ӷ����ⲿ�����صĳ�Ա����
			System.out.println("��һ�����ӵ�������"+weight);
		}
	}
	
	//�ⲿ����
	public void test()
	{
		������ڲ��� p = new ������ڲ���(1.12,"red");
		p.info();
	}
	public static void main(String[] args)
	{
		���� s = new ����(321.5);
		s.test();
	}
}

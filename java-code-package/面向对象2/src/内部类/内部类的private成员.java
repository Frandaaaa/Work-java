package �ڲ���;

public class �ڲ����private��Ա {
	private int outprop = 5;
	class Inner
	{
		private int inprop = 7;
		public void accessOuterProp()
		{
			//�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ���private���εĳ�Ա����
			System.out.println("�ⲿ�ࣺ"+ outprop);
		}
	}
	public void accessInnerProp()
	{
		//�ⲿ�಻��ֱ�ӷ����ڲ����ʵ������
		//System.out.println("�ڲ��ࣺ"+inprop);
		//��Ҫ��ʾ��������
		System.out.println("�ڲ��ࣺ"+new Inner().inprop);
		Inner p = new Inner();
		p.accessOuterProp();
	}
	public static void main(String[] args)
	{
		//ֻ�Ǵ����ⲿ�����
		�ڲ����private��Ա out = new �ڲ����private��Ա();
		out.accessInnerProp();
		
		//�ⲿ�����ʱ�����в�һ�������ڲ��࣬���ڲ������ʱ��һ�����ڱ����������ⲿ�ࡣ��������ⲿ��������ڲ�����ܾͲ�����
		//������̬��Ա���ʷǾ�̬��Ա
		//new In();
	}
	private class In {
		//�����ڷǾ�̬�ڲ����ж��徲̬
	  	//static {
	  	//	System.out.println("--");
	  	//}
	  	//private static void test() {}
	  	//private static int inProp;
	 
	} 
}

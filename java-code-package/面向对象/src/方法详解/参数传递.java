package �������;

public class �������� {

	public static void swap(int a ,int b)
	{
		//���Խ���ֵ
		int tmp = a ;
		a = b;
		b = tmp;
		System.out.println("�����е�ֵ"+a+"\b"+b);
	}
	public static void main(String[] args)
	{
		//ֵ���ݣ�ʵ�ʲ����ĸ���Ʒ
		int a = 6;
		int b = 9;
		//���÷�������֤�˸���Ʒ������ı��ֻ��swap�����е�ֵ
		swap(a,b);
		System.out.print("�����ⲿ��ֵ"+a+"\n"+b);
	}
}

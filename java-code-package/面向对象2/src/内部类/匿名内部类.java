package �ڲ���;
/**
 * 	@see	�������.���󷽷�||�������2.���󷽷��ͳ�����
 * 	�����ڲ��ֻࣺ��Ҫʹ��һ�Σ�command
 * 	ִ�й��̣�����ʱ��������һ�������ʵ�����ඨ��������ʧ�������ڲ��಻���ظ�ʹ��
 * 
 * 	�﷨��
 * 	new ʵ�ֽӿ�() | ���๹����(ʵ���б�)
 * 	{
 * 		//�����ڲ�������岿��
 * 	}
 * 
 * 	�ɼ�������̳�һ�����࣬����ʵ��һ���ӿڣ��������һ��
 * 	
 * 	�ƶ�����
 * 	�����ǳ����ࣺ�����ڲ����ǣ����������������ڲ���Ķ��󣬶��������ǲ���ʵ�����Ĺ�
 * 	��������û�У����ܶ��幹����������ʱ��ʼ�����ǲ���Ҫ�����Ĺ�
 * 	
 */

interface Product
{
	public double getPrice();
	public String getName();
}

public class �����ڲ��� {
	public void test(Product p)
	{
		System.out.print("������һ��"+p.getName()+",������"+p.getPrice());
	}
	public static void main(String[] args)
	{
		�����ڲ��� ta = new �����ڲ���();
		//��Ҫ����ò���
		//��������������ʵ�ֵ�ʵ��
		ta.test(new Product() {//��ʹ�������ڲ��࣬ҲҪʵ�ֽӿ��е����г��󷽷�Ŷ
			public double getPrice()
			{
				return 56.4;
			}
			public String getName()
			{
				return "great one";
			}
		});
		//�൱�ڼ�������Ĵ��룺�Ǿ�̬�ڲ���
		class AnonymousProduct implements Product
		{
			public double getPrice()
			{
				return 56.4;
			}
			public String getName()
			{
				return "great one";
			}
		}
		System.out.println("\n");
		ta.test(new AnonymousProduct());
	}
}
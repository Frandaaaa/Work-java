package �ڲ���;

/**
 * @author ����
 *	ʵ�ֽӿ������������ڲ����ǲ�����ʾ������������ֻ��һ����ʽ���޲�����������new���ܴ������
 *	����ͨ������̳��أ����ǣ���������ӵ�к͸������ƵĹ�������ָ�������Ƶ��β��б�
 */

abstract class Device
{
	private String name;
	public abstract double getPrice();
	public Device() {}
	public Device(String name)//�Ӹ����е��ü̳й�����
	{
		this.name = name;
	}
	//setter getter
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}

//�ӿڣ�
interface A
{
	void test();
}

public class �����ڲ���Ĺ����� {
	public void test(Device d)
	{
		System.out.println("������һ��"+d.getName()+"��������"+d.getPrice());
	}
	public static void main(String[] args)
	{
		�����ڲ���Ĺ����� ai = new �����ڲ���Ĺ�����();
		//�����в����Ĺ���������Device����ʵ����Ķ���
		ai.test(new Device("����ʾ����") {
			public double getPrice()
			{
				return 65.8;
			}
		});
		//�޲����Ĺ���������Device����ʵ����Ķ���
		//����������ԭ�Σ�
		//���� ������ = new ����(){};
		Device d = new Device()
		{
			//��ʼ��
			{
				System.out.println("�����ڲ���ĳ�ʼ����...");
			}
			//ʵ�ֳ��󷽷�
			public double getPrice()
			{
				return 56.2;
			}
			//��д�����ʵ������
			public String getName()
			{
				return "����";
			}
		};
		ai.test(d);
		
		//�����ڲ��ࡢ�ֲ��ڲ���������ʷ�final�ľֲ�����
		int age = 23;
		//���ýӿ�
		A a = new A()
		{
			public void test()
			{
				//����ֲ������������ڲ�������ˣ�������ʾage�൱�ڱ�final���Σ�effectively final�����밴����final��������
				//һ�θ�ֵ�Ժ��ܸ�ֵ
				//age =3;
				System.out.println(age);
			}
		};
		a.test();
		
	}
}

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
	public Device(String name)
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
	}
}

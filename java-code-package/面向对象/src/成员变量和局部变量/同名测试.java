package ��Ա�����;ֲ�����;
/**
 * 
 * @author ����
 *
 * Attention:	���������������������
 */
public class ͬ������ {
	private String name = "���";
	private static double price = 23.4;
	public static void main(String[] args)
	{
		//�ֲ��������ȣ����������Ա������Ҫ�ض��ķ�������
		int price = 43;
		
		System.out.println("��ͬ�ı���"+price+"\n"+ͬ������.price);
		//���з���
		new ͬ������().info();
	}
	public void info()
	{
		String name = "�����";
		System.out.println("��ͬ������"+name+"\n"+this.name);
	}
	
}

package ģ�����д�ȡ��;

public class test {
	public static void main(String[] args)
	{
		bank bank = new bank();
		//���������߳�
		new Thread(new Into(bank)).start();
		new Thread(new Get(bank)).start();
	}
}

package �߳�;
 
class myThread extends Thread {//�̳�Thread��ͳ�Ϊ��һ���߳�
	public void run() {//�̷߳�����һ����Ҫ��д
		System.out.println(getName() + " �߳���������");
	}
}
//�̻߳��CPU��ʹ��Ȩ�������
class moThread extends Thread {
	public moThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName() + "������" + i + "��");
		}
	}
}
public class �����߳� {
	public static void main(String[] args)
	{
		/*
		System.out.println("���߳�1");
		myThread mt = new myThread();
		mt.start();//ֻ�ܵ���һ���̣߳�ͨ��start()��������
		System.out.println("���߳�2");
		*/
		
		//���Զ��߳�
		moThread mt1 = new moThread("�߳�1");
		moThread mt2 = new moThread("�߳�2");
		mt1.start();
		mt2.start();
		//��ȡcpuռ��Ȩ�������
	}
}
//�������java�������̳У�������Ҫʹ�ýӿ�ʵ�ֽ���

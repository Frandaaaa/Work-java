package �߳�;

class mThread implements Runnable {
	public void run() {
		for(int i = 0; i < 30;i++)
		{
			System.out.println("����" + Thread.currentThread().getName() + "ִ����" + i + "��");
			try {
				Thread.sleep(1000);//���������Ժ���һ���̻߳��cpuʹ��Ȩ����ʾ���߶��ٺ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class �������̷���Sleep {
	public static void main(String[] args)
	{
		mThread mt = new mThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
	}
}

package �߳�;

class meThread implements Runnable {
	int i = 1;//������ִ�д���
	@Override
	public void run() {
		while(i<=10)
			System.out.println(Thread.currentThread().getName() + "������" + (i++) + "��");
	}
}
public class ͨ���ӿ� {
	public static void main(String[] args)
	{
		meThread mt = new meThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
	}
}

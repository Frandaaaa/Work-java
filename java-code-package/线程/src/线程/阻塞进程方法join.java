package �߳�;

class oThread extends Thread {
	public void run() {
		for(int i = 0;i < 500;i++)
			System.out.println(getName() + "ִ����" + i + "��");
	}
}
public class �������̷���join {
	public static void main(String[] args) {
		oThread mt = new oThread();
		mt.start();
		try {
			mt.join(2);//��ʾ����ִ�е�ʱ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0;i < 10; i++) {
			System.out.println("���߳�ִ����" + i + "��");
		}
		System.out.println("���߳�ִ�����");
	}
}

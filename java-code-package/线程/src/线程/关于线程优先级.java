package �߳�;
/**
 * �߳����ȼ������ܾ��Ծ����߳�ִ�е��Ⱥ�˳����ʱ���ȵ��õ���ִ�У����ȼ�������int������1~10����MAX_PRIORITY��ʾ���MIN_PRIORITY��ʾ��С
 * @author ����
 */
class mmThread extends Thread {
	private String name;
	public mmThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(name + "ִ����" + i + "��");
		}
	}
}

public class �����߳����ȼ� {
	public static void main(String[] args) {
		//��ȡ���̵߳����ȼ�
		int mainPriority = Thread.currentThread().getPriority();
		System.out.println(mainPriority);
		mmThread mt1 = new mmThread("�߳�һ");
		mmThread mt2 = new mmThread("�̶߳�");
		mt2.setPriority(Thread.MIN_PRIORITY);
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt1.start();
		mt2.start();
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
	}
}

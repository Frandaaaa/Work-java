package ģ���������ѹ���;

public class Productor implements Runnable{
	Queue queue;
	Productor(Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			queue.set(i++);
			try {
				Thread.sleep(1000);//ģ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

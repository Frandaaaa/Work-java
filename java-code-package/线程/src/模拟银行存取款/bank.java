package ģ�����д�ȡ��;

import java.util.Random;
/**
 * ģ������߼��Ĵ�ȡ�����
 * @author ����
 *
 */

public class bank {
	//�˻����
	private int count = 500;
	
	//���
	public synchronized void set(int money) {
		System.out.println("���"+money+"��");
		this.count += money;
		System.out.println("���˻���"+count+"��");
		notifyAll();//һ��Ҫ���ѵȴ��������߳�
	}
	//ȡ��
	public synchronized int get() {
		int money = new Random().nextInt(100)+100;//ȡ�Χ100~200
		System.out.println("��Ҫȡ��"+money+"��");
		if(money>count) {
			System.out.println("����");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ȡ��"+money+"��");
		this.count -= money;
		System.out.println("���˻���"+count+"��");
		notifyAll();
		return count;
	}
}

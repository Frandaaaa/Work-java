package ����ģʽ�µ����ִ�������;

public class Lazyman {
	private Lazyman() {
		
	}
	
	private static Lazyman instance = null;//δʵ������ʱ�򲻴�������
	
	public static Lazyman getInstance() {
		if(instance==null) {//��ʵ������ʱ��Ŵ���
			instance = new Lazyman();
		}
		return instance;
	}
}

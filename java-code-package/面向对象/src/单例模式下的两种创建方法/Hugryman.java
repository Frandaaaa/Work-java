package ����ģʽ�µ����ִ�������;

public class Hugryman {
	private Hugryman() {
		
	}
	
	private static Hugryman instance = new Hugryman();//δʵ������ʱ��ʹ������󣬿ռ任ʱ��
	
	public static Hugryman getInstance() {
		return instance;
	}
}

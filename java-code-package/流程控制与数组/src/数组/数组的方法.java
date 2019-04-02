package ����;

import java.util.Arrays;

public class ����ķ��� {
	private int[] items;
	private int size;
	
	public ����ķ���() {
		items = new int[100];
		size = 0;
	}
	
	/** ������������ķ��� */
	private void resize(int capacity) {
		int[] a = new int[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}
	
	/**�������в���ָ����Ԫ��*/
	public void addLast(int x)
	{
		if(size == items.length) {
			//resize(size + RFACTOR)
			//resize(size * RFACTOR)��Ȼ����˷���ʽ���Դ����������ٶ�
			resize(size + 1);//����������ò�Ҫ�üӷ�
		}
		items[size] = x;
		size += 1;
	}
	
	/** ��������Ԫ����		 */
	public int getLast() {
		return items[size - 1];
	}
	
	/**�õ�����ֵ��Ӧ������Ԫ�� */
	public int get(int i) {
		return items[i];
	}
	
	/**�õ�����ĳ���*/
	public int size() {
		return size;
	}
	
	/** ɾ����������Ԫ��
	 * ���ҷ��ر�ɾ����Ԫ�� */
	public int removeLast() {
		int x = getLast();
		size = size - 1;
		return x;
	}
	public static void main(String[] args)
	{
		����ķ��� p = new ����ķ���();
		p.addLast(12);
		for(int i = 0; i < p.items.length; i++)
			System.out.println(p.items[i]);
	}
}

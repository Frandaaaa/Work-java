package ����;

//ͨ�ã�
				//Glorp
public class ͨ������<Item> {//��ֻ�Ǳ�������
	private Item[] items;
	private int size;
	
	public ͨ������() {
		items = (Item[]) new Object[100];
		size = 0;
	}
	
	/** ������������ķ��� */
	private void resize(int capacity) {
		Item[] a = (Item[]) new Object[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}
	
	/**�������в���ָ����Ԫ��*/
	public void addLast(Item x)
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
	public Item getLast() {
		return items[size - 1];
	}
	
	/**�õ�����ֵ��Ӧ������Ԫ�� */
	public Item get(int i) {
		return items[i];
	}
	
	/**�õ�����ĳ���*/
	public int size() {
		return size;
	}
	
	/** ɾ����������Ԫ��
	 * ���ҷ��ر�ɾ����Ԫ�� */
	public Item removeLast() {
		Item x = getLast();
		size = size - 1;
		return x;
	}
	
	
}

package final���η�;
/**
 * @see		�������.��ļ̳�.��д����||�������.��ļ̳�.��д��������� ||��Զ���.���빹����.����
 * @author ����
 */

/**
 * final���εķ������ܱ���д
 * ��ϣ��ʹ��������д���ࣺfinalһ��
 * ���磺getClass()
 */
public class final���� {
	public final void test() {}
	private final void cuiqin() {}
}

class Sub extends final���� {
	//public void test() {}//��д��Ч
	//�����Լ�����һ���͸���һ�����Ǳ�private���εķ���
	public void cuiqin() {}
	//final���εķ���ֻ�ǲ��ܱ���д����������
	//public final void test() {}//ide��Ҫ��
	public final void cuiqin(String arg) {}
}

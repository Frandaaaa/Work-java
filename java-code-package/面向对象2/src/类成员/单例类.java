package ���Ա;
/**
 * @see		�������.��Ա�����;ֲ�����.����||
 * @author ����
 *
 */
/**
 * 	ĳЩϵͳ���ɴ���ĳ��Ķ���ûɶ���壬���뵥���ࣺ
 * 	һ����ʼ��ֻ�ܴ���һ��ʵ��
 * 	�������ɣ�ʹ��private���ι�������Ȼ��������������public�����࣬��Ϊ���ʵ�
 *	���÷�����Ҫ��static����Ϊ���õ�ֻ������
 *
 *	��Ҫ�����Ѿ������Ķ��󣬷���֪���Ƿ�ֻ�Ǵ�����һ��������Ҫһ����Ա�����������
 *	��Ա������Ҫ������ķ������ʣ���Ҫ��static������
 */

class Singleton {
	//���������������������ʵ��
	private static Singleton instance;
	//���ع�������
	private Singleton() {}
	//ʹ�þ�̬����������instanceʵ�������ұ�ֻ֤������һ��
	public static Singleton getInstance()//�Զ��巽��
	{
		//�ж��Ƿ��Ѿ�������������
		if(instance == null)
		{
			//���������ұ���һ������
			instance = new Singleton();
		}
		return instance;
	}
}
public class ������ {
	public static void main(String[] args)
	{
		//�����ù�����������������
		//Singleton p1 = new Singleton();
		//ֻ��ͨ���෽��
		Singleton p1 = Singleton.getInstance();
		Singleton p2 = Singleton.getInstance();
		System.out.println(p1==p2);//true ָ����ͬһ����ַ������ͬһ������
	}
}

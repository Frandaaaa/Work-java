package ��̬;
//����ʱ����	�������ñ���ʱ��ʹ�õ����;���
//									}�������Ͳ�һ�£����ܳ�����ν�Ķ�̬
//����ʱ����	��ʵ�ʸ����ñ����Ķ������	

//�����ʵ���������߱���̬��,������Ǹ�����
//�������ֱ�ͬʱӵ��ͬ������������ֶ�̬��

class BaseClass {
	public int book = 4;
	public void base()
	{
		System.out.println("��������ͨ����");
	}
	public void test()
	{
		System.out.println("���������ǵķ���");
	}
}
public class ��̬���� extends BaseClass{
	//���ظ����ʵ������
	public String book = "ʲô��";
	public void test()
	{
		System.out.println("����ĸ���");
	}
	public void sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args)
	{
		//�����ڶ�̬
		BaseClass bc = new BaseClass();
		//�Զ��׼��Ǹ��෽��
		bc.base();
		bc.test();
		//���෽��
		��̬���� sc = new ��̬����();
		System.out.println(sc.book);
		sc.base();
		sc.test();
	/**
	 * ʵ���ϱ�������е������׶��Ǳ�����������
	 * BaseClass p;//���� 	-->		����׶�
	 * p = new BaseClass();//����  --> ���н׶�
	 */
		//��̬����
		BaseClass dt = new ��̬����();
		//ֻ����ʸ����ʵ������
		System.out.println(dt.book);
		//���ж�̬�ķ���
		//�̳еķ���,��ִֻ�е�ǰ���µķ���
		dt.test();
		//ֻ�и����еķ���
		dt.base();
		//���������û�еķ���
		//dt.sub();
	}
/**		���֣���̬�����£�ʵ�������Ǳ���ʱ����(����)	
 *		����ʱ����(����)���е��Ǳ���ʱ����(����)			
 *  	����ʱ����(�ӱ�)�̳��˵�������ʱ����(�ӱ�)			
 *  	
 *  	Person p = new child()
 *  	���ñ����ڱ���׶�ֻ�ܵ��������ʱ����Person�����еĵķ���������ʱִ����child����ʱ���������еĵķ��� -����ִ��child���ǵķ���
 *  	�����������Personû�еķ����ǻᱨ���,�еķ�������
 *  	
 *  	ֻ����Person���еķ��������ܵ���child�ж���ķ���
 *  
 *  	ͨ�����ñ������÷����������ʵ������ʱ��ϵͳ������ͼ����������ʱ����������ĳ�Ա����
 */	
}


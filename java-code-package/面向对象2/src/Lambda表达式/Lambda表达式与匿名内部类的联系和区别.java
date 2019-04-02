package Lambda���ʽ;
/**
 * 	���䣺����ʽ�ӿ�
 * 		XxxFunction
 * 		XxxConsumer
 * 		XxxPredicate
 * 		XxxSupplier
 * 		Comparator
 * 		XxxOperator
 */

/**
 *	��ͬ�㣺
 *		������ֱ�ӷ���"effectively final"�ľֲ��������Լ��ⲿ�ĳ�Ա����
 *		�����Ķ����������ڲ������ɵĶ���һ��������ֱ�ӵ��ôӽӿ��м̳е�Ĭ�Ϸ���
 */

/**
 * 	����
 * 		�����ڲ������Ϊ����ӿڴ���ʵ����ֻҪ�����ڲ���ʵ�����г��󷽷�������Ϊ��������������ͨ�ഴ��ʵ����
 * 			����lambda���ʽֻ��Ϊ����ʽ�ӿڴ���ʵ��
 * 		�����ڲ���ʵ�ֵĳ��󷽷��ķ�����������ýӿ��ж����Ĭ�Ϸ��������Ǻ��߲�ѭ����ýӿ��ж����Ĭ�Ϸ���
 *
 */
@FunctionalInterface
interface Displayable
{
	//����һ�����󷽷���Ĭ�Ϸ���
	void display();
	default int add(int a, int b)
	{
		return a + b;
	}
}
public class Lambda���ʽ�������ڲ������ϵ������ {
	private int age = 12;
	private static String name = "����";
	public void test()
	{
		String book = "��ͨ������";
		Displayable dis = () -> {
			//�������ڲ������ƣ�lambda���ʽ�����˾ֲ���������ô�þֲ������൱����һ����ʽ��final����
			System.out.println("book�ֲ�������"+book);
			//�ⲿ���ʵ�������������
			System.out.println("�ⲿ���ageʵ������Ϊ��"+age);
			System.out.println("�ⲿ���name�������"+name);
			//System.out.println(add(2,5));//���ʽ���ܵ���Ĭ�Ϸ���
		};
		dis.display();
		//���õ���dis����ӽӿ��м̳е�add()����
		System.out.println(dis.add(3,5));
	}
	public static void main(String[] args)
	{
		Lambda���ʽ�������ڲ������ϵ������ lambda = new Lambda���ʽ�������ڲ������ϵ������ ();
		lambda.test();
	}
}

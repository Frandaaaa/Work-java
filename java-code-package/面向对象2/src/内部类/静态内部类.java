package �ڲ���;

//��̬�ڲ��࣬���������ڲ���
/**
 * 	��̬�ڲ��������ⲿ�౾��
 * 	static���������ⲿ��
 * 	��̬�ڲ��಻�ܷ����ⲿ���ʵ����Ա��ֻ�ܷ����ⲿ��ľ�̬��Ա��
 */
public class ��̬�ڲ��� {
	private int propl = 3;
	private static int prop2 = 6;
	static class StaticInnerClass
	{
		private static int age=5;
		public void accessOuterProp()
		{
			//ʵ������Ҳ���ܷ��ʷǾ�̬��Ա
			//System.out.println(propl);
			System.out.println(prop2);
		}
	}
	public static void main(String[] args)
	{
		StaticInnerClass p = new StaticInnerClass();
		p.accessOuterProp();
		//��������
		System.out.println(StaticInnerClass.age);//���������ڲ����������ʾ�̬�ڲ���ľ�̬��Ա����
		System.out.println(new StaticInnerClass().age);//Ҳ���Դ���һ������/ʵ��
	}
	//��̬�ڲ��಻�Ǽ������ⲿ���ʵ���������౾��.֧�����ⲿ��������ã�û�г����ⲿ���������á�
	//�ӿ�Ҳ�ǿ��Զ����ڲ��ֻ࣬����public static
}

package ö����;

/**
 * 
 * @author ����
 *
 *	Enum���а����ķ�����
 *		int compareTo(E o):	������ָ��ö�ٶ���Ƚϣ�˳�򣡣�ֻ������ͬ���͵�ö��ʵ���Ƚϡ�ö�ٶ���λ��ָ��ö�ٶ���֮��N*��ǰ��-N������0
 *		String name():		���ش�ö��ʵ�������ƣ����ƾ��Ƕ���������ʿ�г�������ö��ֵ֮һ��������toString
 *		int ordinal():		����ö��ֵ��ö�����е�����ֵ��ö��ֵ��ö�������е�λ�ã���һ��ö��ֵ������ֵΪ�㣩
 *		String toString():	ö�ٳ��������ƣ�name��࣬toString����	
 *		public static<T extends Enum<T>> T valueOf(Class<T> enumType, String name):
 *			���ڷ���ָ��ö������ָ�����Ƶ�ö��ֵ�����Ʊ������ö����������ö��ֵ�����õı�ʶ����ȫƥ�䣬������ʹ�ö���Ŀհ��ַ�
 */

public class ʵ��ö�ٵ��� {
	public void judge(ö�� s)
	{
		//switch�����ı��ʽ������ö��ֵ
		switch (s)
		{
		case SPRING:
			System.out.println("��ů����");
			break;
		case SUMMER:
			System.out.println("��������");
			break;
		case FALL:
			System.out.println("�����ˬ");
			break;
		case WINTER:
			System.out.println("����ѩƮ");
			break;
		}
	}
	public static void main(String[] args)
	{
		//ö����Ĭ����һ��values()���������ظ�ö���������ʵ��
		for (ö�� s:ö��.values())
		{
			System.out.println(s);
		}
		//ʹ��ö��ʵ��ʱ����ͨ��EnumClass.variable��ʽ������
		new ʵ��ö�ٵ���().judge(ö��.SPRING);
	}
}

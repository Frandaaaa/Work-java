package ϵͳ���;

/*
 * 	�ṩ�˴����ķ���	etc��
 * 		��������	gc()
 * 		֪ͨϵͳ������Դ�����runFinalization()
 * 		��ȡ��ǰʱ�䣺currentTimeMillis() nanoTime() ==?>����long����		
 *  				����ȷ�ĺ�����			������ϵͳ��֧�ֵ����뵥λ
 *  	System	in	��׼����
 * 				out	��׼���
 * 				er	���������
 * 	�ı����������
 * 		setIn()	
 * 		setOut()
 * 		setErr()
 * 
 * 	�ṩ��identityHashCode(Object x)�˷�������ָ������ľ�ȷhashCodeֵ		ע�⣬����Ľ���Ǹ��ݶ���ĵ�ַ�����
 * 			���������identityHashCode��ͬ��ô�������������ͬһ������
 */

public class System�����ϸ���� {
	public static void main(String[] args)
	{
		//��ͬ����
		String s1 = new String("1");
		String s2 = new String("1");
		//�Ϻ�����ģ�String ��д�� hashCodeֵ -- �����ַ��������������hashCodeֵ
		//�ַ���������ͬ��ˣ�
		System.out.println(s1.hashCode() + "----" + s2.hashCode());
		//����ͬ���identityHashCode()��ֵ��ͬ
		System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));
		//��������ͬ���ַ�������������ǵ�identityHashCode()��ͬ��
		String a = "java";
		String b = "java";
		System.out.println(System.identityHashCode(a) + "----" + System.identityHashCode(b));
	}
}

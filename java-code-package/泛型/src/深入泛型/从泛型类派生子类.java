package ���뷺��;
/**
 * @see
 * 		�������.��̬.instanceof�����
 */

/**
 * 	ʹ�ô�����ʵ����Ľӿں͸����ʱ�Ͳ��ܰ��������β�(���������������ʽ��Ҳ��Ϊ�����β�)�����ܰ����븸��һ�����β�
 *	error:public class A extends x<T>{}
 *	��Ҫ��ʱ��Ӧ��Ϊ�����βδ���һ��ʵ�ʵ�����
 *	correct: public class A extends x<String>
 *
 * 	���÷���ʱ�����Ϊ���е������βδ������ֵ��ʹ���ࡢ�ӿ�ʱҲ���Բ�Ϊ�����βδ���ʵ�ʵ����Ͳ���
 * 	correct: public class A extends x
 * 
 * 	��Ȼ������һ��ʵ�ʵ����ͣ���ô�̳еķ����ͱ���ע��Ҫ��ʵ�ʵ����ͱ���һ��
 * 
 * 
 * 	��û�д�����Ӧ�ķ����ࣺ����˵��������������x<String> is the son class of x but actually it doesn't create a new class file
 * 
 * 	����Ϊ���͵������βδ�������һ������ʵ�Σ���Ȼ��������ͬһ���ദ��ռ�õ���ͬһ���ڴ������ھ�̬��������̬��ʼ������߾�̬�����������ͳ�ʼ���в�����ʹ�������β�
 */
//

//for example
public class �ӷ�������������<T> 
{
	//static T info;//Cannot make a static reference to the non-static type T
	T age;
	public void foo(T msg) {}
	//�����ھ�̬����������ʹ�����Ͳ���
	//public static void bar(T msg) {}//Cannot make a static reference to the non-static type T
	
	public static void main(String[] args)
	{
		//ϵͳ�в����������ɷ����࣬���ע��instanceof �������Ҫ���������������治��ʹ�÷�����

		java.util.Collection<String> cs = new java.util.ArrayList<>();
		//if(cs instanceof java.util.ArrayList<String>) {
		//	//Cannot perform instanceof check against parameterized type ArrayList<String>. Use the form ArrayList<?> instead since further generic type information will be erased at runtime
		//}
	}
}

package ��̬;

public class instanceof����� {
	// (ͨ��)�������ͱ��� instanceof ��(�����ǽӿ�),�����ж�ǰ��Ķ����Ƿ��Ǻ�����࣬���������ࡢʵ�����ʵ����
	//	������
	//Ҫô����������ͬ��Ҫô����������и��Ӽ̳й�ϵ
	
	public static void main(String[] args)
	{
		Object hello = "Hello";//object��������ĸ��ף���
		//instanceof ��������һ������� �� +-*/��Ч
		System.out.println("d");
		System.out.println("�ַ���--<Object:"+ (hello instanceof Object));
		System.out.println("�ַ���--<String:"+ (hello instanceof String));
		System.out.println("�ַ���--<Math:"+ (hello instanceof Math));
		//comparable�ӿ�
		System.out.println("�ַ���--<comparable:"+ (hello instanceof Comparable));
		//String �� Math
		String a = "Hello~";
		//�ַ�����math�޼̳й�ϵ������
		//System.out.println("String--<Math:"+ a instanceof Math);
		System.out.println(a+"ͨ���ȱ�֤Instanceof���ж�Ȼ������(type)ת��");
	}
}

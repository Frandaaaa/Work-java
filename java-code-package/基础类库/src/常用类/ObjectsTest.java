package ������;

//����������������������������������������������һ������ʹ�õķ�����һ�������ֵ�����������˶�Ӧ�Ķ�����ô�Ļ��ͻ��֮ǰ�ķ������ǣ�

/*
 * 	��һ�������࣬�ṩ��һЩ���߷������������󣬷�������ǡ���ָ�롱��
 * 		������ö�����null ���þͻᱨ��
 * 			������ʱʹ�ù������е�toString(Object o)�������Ϳ��Ի��ָ����Ϣ������oΪnullʱ�ͻ᷵��null�ַ���
 */
import java.util.*;

class Bar
{
	public int bar;
}

public class ObjectsTest {
	//Ĭ��ֵ��null
	static Objects obj;
	public Bar bar = null;
	public static void main(String[] args)
	{
		System.out.println(Objects.hashCode(obj));
		
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����Ϊnull�������쳣
		//System.out.println(Objects.requireNonNull(obj, "obj����������null!!"));
		//���Զ�����Ľ���У�飺����������ֵΪNull��ô�ͻ��쳣������ֵ
	}
	
	public void Foo(Bar bar)
	{
		this.bar = Objects.requireNonNull(bar);
		System.out.println(this.bar);
	}
}


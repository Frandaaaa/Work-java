package ������;

/*
 * 	֪ʶ���գ�String �� StringBuffer��װ�ַ���
 * 	String �ǲ��ɱ���	�����Ժ���ַ������ܱ��޸�����ָ�������������
 * 		StringBuffer ����һ���ַ����пɱ���ַ���������ͨ���������ת����Ϊ��һ����Ҫ���ַ��������Ե�������toString��������ת����Ϊһ��String����
 * 			append() insert() reverse() setCharAt() setLength()
 * 
 * 	������StirngBuilder :	û��ʵ���̰߳�ȫ�������ܸ߰�	������������ɱ���ַ���������ȿ��������
 * 		���ַ�����ʵ���� CharSequence() �ӿڣ�������Ϊ����ӿ���һ���ַ�����Э��ӿ�
 */

/**
 * 	���ֹ����������Լ����飡����P190
 *	
 *	ע�⿩��String		�����ǲ��ɱ�ģ�������;����������ʱ�����أ�
 *		����ʹ��StringBuffer��StringBuilder��û���������Ŷ�����ң����������ǵ��ַ����ĳ����ǿ��Ըı����
 *		���Ƕ��е��������ԣ�	length		--		length()/setLength(int len)���������ʺ��޸��ַ����еĳ���
 *						capacity	--		StringBuilder 	������һ���length�󣬲��ù���
 */

public class String�� {
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		//׷���ַ���
		sb.append("java");//sb = "java"
		//����
		sb.insert(0, "hello ");//sb = "hello java"
		//�滻
		sb.replace(5, 6, ",");//sb = "hello, java"
		//ɾ��
		sb.delete(5, 6);//sb = "hellojava"
		System.out.println(sb);
		//��ת
		sb.reverse();//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());//����
		System.out.println(sb.capacity());//����
		//�ı䳤�ȣ�ֻ�Ǳ���ǰ���
		sb.setLength(5);//sb = "avajo"
		System.out.println(sb);
		
	}
}

package ��װ����ǿ;

public class ��װ��ıȽ� {

	public static void main(String[] args)
	{
		//��װ���͵ı����������������ͣ����ǰ�װ���ʵ����������ֵ���͵�ֵ���бȽϣ��Ƚ���ֱ��ȡ����װ��ʵ������װ����ֵ���Ƚϵ�
		Integer a = new Integer(5);
		System.out.println("�������͵ıȽϣ�" + (a > 1));
		
		//������װ��ıȽϣ��������������ͣ�ֻ��������װ������ָ��ͬһ�������󣡲Ż᷵��true
		System.out.println(new Integer(2) == new Integer(2));
		
		//�߼��������
		Integer b = 2;
		Integer c = 2;
		System.out.println(b==c);//true
		Integer d = 128;
		Integer e = 128;
		System.out.println(d==e);//faulse
	/**
	 * 	��JAVA��Ĺ����йأ�������һ��256���ȵ����飺ֻ�ܴ�-127~127֮��������Դ������cache������ȥ
	 * 	���������������ޣ�ϵͳ���Զ�����һ���е�Integerʵ��
	 * 	ע�⣺�����JAVA�Ļ�������йأ�������߳������������Ŷ~
	 */
		//JavaΪ���еİ�װ�඼�ṩ��һ����̬�ıȽϷ���compare(x,x)
		System.out.println(Boolean.compare(true, false));//1
		System.out.println(Boolean.compare(true, true));//0
		System.out.println(Boolean.compare(false, true));//-1
		
	/**
	 *	 ����һ��Java��ΪCharacter��װ�������˴����Ĺ��߷�������һ���ַ������жϣ��ο�API
	 *	java�����˺ܶ��װ��Ĺ��� -- 128
	 *	��Ҫ���޷�������
	 */
		byte b1 = -3;
		System.out.println("byte���͵�-3��Ӧ���޷�������"+Byte.toUnsignedInt(b1));
		
		//�޷������������ص�������λ���Ƿ���λ����������޷���������������b1 -3 -- 10000011���λ�����ֵλ
	}
	
}

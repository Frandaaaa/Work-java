package final���η�;
/**
 * @see			�������2.�������.������
 * @author ����
 *
 */

/**
 * ֱ��������������
 *  ʹ��final����
 * 	�ڶ���final����ʱָ���˳�ʼֵ
 *  ��ʼֵ�����ڱ���ʱ�ͱ�ȷ��
 *  
 *  ���������������ѳ����������õ�������ĵط�ֱ���滻��Ϊ�ñ�����ֵ
 *  ����final��˵��ֻ��������final���ܴﵽ�������Ч��
 */
public class final�ĺ��滻 {
	public static void main(String[] args)
	{
		//��ͨ�ֲ�����
		final int a = 4;
		System.out.println(a);
		System.out.println(4);//�ȼ�
		
		//��������ı��ʽֻ�ǻ������������ʽ�����ַ����������㣬û�з�����ͨ���������÷�����ͬ�����������
		final int b = 35+12;
		final double c = 1.2/3;
		final String d = "����"+"baba";
		final String book = "cuiqin" + 10.4;
		//���÷������е�
		final String book2 = "cuiqin" + String.valueOf(10.4);
		//�ж�
		System.out.println(book == "cuiqin10.4");//true
		System.out.println(book2 == "cuiqin10.4");//false,�����ڱ����ʱ��ȷ��
		
		//java�������ʹ�ù����ַ������볣�����б���
		//����ڶ���ʹ����ͬ���ַ���ʱ��java���������һ�ָ��ͬһ���ַ�����==�᷵��true
		String A = "cuiqinbaba";
		String B = "cuiqin" + "baba";
		System.out.println(A ==B);//true
		String C = "cuiqin";
		String D = "baba";
		System.out.println((C+D)==A);//��������ͨ����,false
		//���滻ʹ������ڱ����ȷ��ֵ
		final String C1 = "cuiqin";
		final String D1 = "baba";
		String E = C1 + D1;
		System.out.println(E==A);//true
	}
}

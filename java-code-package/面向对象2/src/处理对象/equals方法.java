package �������;

class human
{
	//���ˣ������жϵ����
	public boolean equals(Object obj)
	{
		return true;
	}
}

class pig {}

public class equals���� {
/**	
 * 	�Ƚ�ϣ���õ�һ�ַ��������ơ�ֵ��ȡ����жϷ���
 *	String ����� equals()���� ��==���жϱ�׼ûɶ����ѽ Ҳ��Ҫ�������ñ���ָ��ͬһ�������true
 *	������д�˷���
 *	String�Ѿ���д�˴˷����������ַ����ıȽ��жϣ�ֻҪ�����ַ������������ַ�������ͬ��ͨ��equals()�ȽϽ�����true
 */
	//��д���� -- ��������
	public static void main(String[] args)
	{
		human p = new human();
		System.out.println("�޸ķ����Ժ��ǲ��ǾͿ���Ϊ����Ϊ���أ�"+p.equals(new pig()));
		System.out.println("û��"+p.equals(new String("hello")));
		
	}
	
}

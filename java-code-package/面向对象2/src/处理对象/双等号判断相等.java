package �������;

public class ˫�Ⱥ��ж���� {

	//ֻҪ����������ֵ��ȣ�==�ȽϾͻ᷵��true�����ǱȽ����ñ�����ʱ��ֻ������ָ��ͬһ�������ʱ��Ż᷵��true
	public static void main(String[] args)
	{
		int it = 34;
		float f1 = 34.0f;
		
		System.out.println("int��float��"+(it==f1));
		
		char ch = 'A';
		//��һ��˵����ֻҪ������ȼ���
		System.out.println("65�� 'A'��"+(65 == ch));
		
		//���ǱȽ���������ʱֻ��������ָ�����һ�µ�ʱ��Ż�true
		String a = new String("a");
		String b = new String("a");
		System.out.println("����һ�£�����ֵһ��ʱ��"+(a==b));
		//����equals����
		System.out.println(a.equals(b));
	}
}

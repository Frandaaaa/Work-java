package �������;

/**
 * 
 * @author 	����
 * function 	
 */
public class �βθ����ɱ� {
	//���巽��������β����ͺ��...
	public static void testa(int a, String... books)
	{
		//books���������鴦��
		for(String tmp:books)
		{
			System.out.println(tmp);
		}
	}
	//�����ɱ��βΣ�public static void testa(int a, String... books);
	//��ͬ�������������βΣ�public static void test(int a, String[] books);
	//ע�⣺������ʽ�βο��Գ����β��б������λ�ã����Ǹ����ɱ���β�ֻ�ܴ����β��б�����
	//һ�����������ֻ����һ�������ɱ���βΣ��ȿ��Դ�����������Ҳ���Դ���һ������
	public static void testb(int b, String[] papers)
	{
		for(String tmp:papers)
		{
			System.out.println(tmp);
		}
	}
	public static void main(String[] args)
	{
		testa(54,"cu","ch","lo");
		//���ó��������
		//testb(2,"emmmm");
		//�����ʽ:���ն�������ķ�ʽ���룬���ԱȲ��������ķ�ʽ����
		testb(2,new String[] {"cu","ch","lo"});
	}
}

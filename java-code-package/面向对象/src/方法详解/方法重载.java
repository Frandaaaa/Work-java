package �������;

//�������أ�������ķ�������;����������β��б�����ͬ
//�򲻷��ʱ�򲢲��Ƽ������βθ����ɱ�ķ����������˿ɶ���
public class �������� {
	//����һ��ķ���
	public static void test()
	{
		System.out.println("�޲���");
	}
	public static void test(String a)
	{
		System.out.println("�ǽ������صķ����ǰɣ�"+a+":><");
	}
	
	//�����βοɱ�ķ���
	public void test0(String... books)
	{
		System.out.println("****�βοɱ�ķ���");
		System.out.println(books[0]+books[1]);
	}
	public void test0(String earth)
	{
		System.out.println("���ɱ�"+earth);
	}
	public static void main(String[] args)
	{
		�������� ev = new ��������();
		//����������β�����ȷ������
		//�����ַ������ص�ʱ��this�Ҳ������ʵķ������Բ���
		ev.test();//������޲���
		ev.test("�����Ӧ�����ͼ���");//����+
		
		//�����βθ������Ըı��
		�������� en = new ��������();
		en.test0("love you");//love you
		en.test0("a","b");
		en.test0(new String[] {"love you","?"});//������µ������ֱ�����������Ԫ��һ������Ҫ�������
		//�������ͬʱ���ڵ������Ԫ�ظ��������ϻᱨ��
	}
	
}

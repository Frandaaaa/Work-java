package �ڲ���_ʹ���ڲ���;

//��Ҫ���ڲ��಻����static����
//�Ǿ�̬
/*
 * 	ʡ�Է��ʿ��Ʒ�����ͬ���µ������
 * 	protected ͬ������̫�ۺ��ⲿ����������
 * 	public����ط����ʣ��﷨��OuterClass.InnerClass varName�а����Ӱ���
 */
/*
 * 	�Ǿ�̬�ڲ���ֻ�ܼ����ⲿ������ⲿ����������﷨��
 * 	OuterInstance.new InnerConstructor()
 * 	�ⲿ��ʵ��		  newһ��	������
 */
//��̬
/*	�ⲿ����أ����ô����ⲿ������﷨��
 * 	new OuterClass.InnerConstructor()
 * 	
 */
class out 
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
	//���徲̬�ڲ���
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}
public class �ⲿ������ʹ���ڲ��� {
	public static void main(String[] args)
	{
		out.In in = new out().new In("baba");//��Ҫ�ȵ����ⲿ����ٴ�newһ���ڲ���
    /*	�ȼۣ�
     * 	out.In in;//�����ڲ������
     * 	out out = new out();
     *  in = out.new In("baba"); 
     */
	//SubClass p = new SubClass();?��ε�����
		//��̬�ڲ���
		out.StaticIn a = new out.StaticIn();//�Ѿ�̬�ڲ��൱������
	}
	//���������ⲿ������ĵط�����������
}

/*
 *	�Ǿ�̬���ڲ�������಻һ�����ڲ��࣬������һ���ⲿ�࣬���ǷǾ�̬�ڲ��������ʵ��һ����Ҫ����һ�����ã�������ָ���丸�������ⲿ��Ķ���
 *	�������һ���ڲ�������Ķ�����ڣ�һ��������֮��Ӧ���ⲿ�����
 */
class SubClass extends out.In
{
	public SubClass(out out)
	{
		out.super("hello");
	}
}

//��̬������
class StaticSubClass extends out.StaticIn {}

//���ԣ���Ϊ����������ʹ�þ�̬�ڲ���

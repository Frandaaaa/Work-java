package �ڲ���_ʹ���ڲ���;

//��Ҫ���ڲ��಻����static����
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
class out 
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}
public class �ⲿ������ʹ���ڲ��� {
	public static void main(String[] args)
	{
		out.In in = new out().new In("baba");
    /*�ȼۣ�
     * 	out.In in;//�����ڲ������
     * 	out out = new out();
     *  in = out.new In("baba"); 
     * 	 
     */
	}
}

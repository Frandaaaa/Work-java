package �쳣�������;

import java.sql.Date;

//try catch ����Ļ����Ŷ�����ʡ��
//�����쳣һ��Ҫ�Ȳ���С�쳣�ٲ�����쳣
public class �쳣����쳣��ϵ {
	public static void main(String[] args)
	{
		//������Ҫ�Լ����쳣
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("���������������Ľ����" + c);
		}
		catch (IndexOutOfBoundsException ie)
		{
			System.out.println("����Խ�磬���г���ʱ����Ĳ�����������");
		}
		catch (NumberFormatException ne)
		{
			System.out.println("���ָ�ʽ�쳣������ֻ�ܽ��������Ͳ���");//�������������ĸ
		}
		catch (ArithmeticException ae)
		{
			System.out.println("�����쳣");//�����ĸΪ��
		}
		catch (Exception e)
		{
			System.out.println("δ֪�쳣");
		}
		
		//��ֵ�����쳣
		Date d = null;
		try
		{
			System.out.println(d.after(new Date(0)));
		}
		catch (NullPointerException ne)
		{
			//����ͼ����һ��null�����ʵ����������ʵ������ʱ�ͻ�����
			System.out.println("��ָ���쳣");
		}
		catch (Exception e)
		{
			System.out.println("δ֪�쳣");
		}
	}
}

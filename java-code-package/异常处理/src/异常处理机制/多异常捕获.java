package �쳣�������;
import java.util.*;

/*	����������͵��쳣�������쳣ʱ��Ҫע�⣺
 * 		��������쳣ʱ�������쳣����֮�������߸�����
 * 		����������͵��쳣ʱ���쳣��������ʽ��final���Σ���˳����ܶ��쳣�������¸�ֵ
 */
public class ���쳣���� {
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("�����������������Ľ����: " + c);
		}//����ͬʱ��׽���
		catch(IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie)
		{
			System.out.println("������������Խ�磬���ָ�ʽ�쳣�������쳣֮һ");
			//ie = new ArithmeticException("test");//�쳣������final����
		}
		catch(Exception e)
		{
			System.out.println("δ֪�쳣");
			e = new RuntimeException("test");//�쳣����û����final����
		}
	}
}

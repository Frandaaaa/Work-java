package �쳣�������;

import java.io.FileInputStream;
import java.io.IOException;

public class �����쳣��Ϣ {
	//�ۣ������һЩ�����catch���з����쳣��Ϣ����ô����ͨ������catch������쳣�β�����ã�������catch����쳣���쳣����ᱻ����catch�������쳣���������򼴿�ͨ���Ĳ���������쳣�������Ϣ
	//���÷�����
	//	getMessage()						�����쳣����ϸ�����ַ���
	//	printStackTrace()					�����쳣�ĸ���ջ��Ϣ�������׼�������
	//	printStackTrace(PrintStream s)						   ָ�������
	//	getStackTrace()						���ظ��쳣�ĸ���ջ��Ϣ
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("a.txt");
		}
		catch (IOException ioe)
		{
			System.out.print(ioe.getMessage());//�����쳣������Ϣ
			ioe.printStackTrace();
		}
	}
}

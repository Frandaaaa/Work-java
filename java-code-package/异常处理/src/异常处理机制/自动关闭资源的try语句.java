package �쳣�������;
import java.io.*;

public class �Զ��ر���Դ��try��� {
	public static void main(String[] args) throws IOException 
	{
		try (		
			//������ʼ���������Թرյ���Դ��try�����Զ��ر���������Դ,������ʼ��������������Զ��ر����ǣ������������ǰ�ȫ��
			BufferedReader br = new BufferedReader(new FileReader("�Զ��ر���Դ��try���.java"));
			PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
			)
		{
			//ʹ��
			System.out.println(br.readLine());
			ps.println("����");
		}
		//�Զ��ر���Դ��try��������Դ����catch���һ��finally��
	}
}

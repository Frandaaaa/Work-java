package �쳣�������;

import java.io.FileInputStream;
import java.io.IOException;
//û�б�Ҫʹ�ó��������Ƕ���쳣����
public class �쳣����Ƕ�� {
	//������try�д���������Դ(���ݿ����ӡ��������ӡ������ļ��ȵ�)����Щ�������Ӷ���Ҫ����
		public static void main(String[] args)
		{
			FileInputStream fis = null;
			try
			{
				fis = new FileInputStream("a.txt");			
			}
			catch (IOException ioe)
			{
				System.out.println(ioe.getMessage());
				//return ;//������return �ɼ���Ȼ����ִ��
				//System.exit(1);	//�˳�������Ժ��ʾֱ���˳�������ˣ�����û�еõ�ִ��,�������ַ�����finally�ܻ�ִ��
			}
			finally	//��finish����Ҳ������һ���������쳣�������̣�������try�飬catch�����finally���а����������쳣�������̵����α���Ϊ
			{//�쳣�����Ƕ��,���쳣�������̵����α���Ϊ�쳣�����Ƕ�ף�
				//�رմ����ļ�
				if(fis != null)
				{
					try
					{
						fis.close();
					}
					catch (IOException ioe)
					{
						ioe.printStackTrace();
					}
				}
				System.out.print("ִ�л��ղ���");
				
			//��Ҫ��finally����ʹ��return ���� throw ������������ʹtry�е�return �� throw ʧȥ���ã��������һЩ����ֵ�����
			}
		}
}

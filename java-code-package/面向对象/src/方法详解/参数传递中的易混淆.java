package �������;

class DataWrap
{
	int a ;
	int b ;
}

public class ���������е��׻��� {
	//�����βεķ�ʽ��ֵ����
	public static void swap(DataWrap dw) 
	{
		//������ʵ��ֵ����
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap�����"+dw.a+"\n"+dw.b);
		
		//֤��swap()��main()�е�dw�ǲ�ͬ��ֵ��
		//swapʧȥ��DataWrap�����ã�����main�������������Ȼ����
		dw = null;
		
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		//ʵ�����õ��Ǹ����˵�һ���µ�,������µ�Ҳ��ֱ��ָ��DataWrap
		swap(dw);
		//�������뷽���ı���DataWrap�е�ֵ
		//������µ��õ����Ѿ��ı��˵�ֵ���Ӷ��γɡ������
		System.out.println("���������Ժ�"+dw.a+"\n"+dw.b);
		//�ܶ���֮��ֻ��ָ����ͬһ������
	}
}

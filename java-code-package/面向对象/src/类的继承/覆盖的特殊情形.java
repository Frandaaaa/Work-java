package ��ļ̳�;

class mather {
	
}

class father {
	public String tag = "����";
}
class son extends father{
	//
	private String tag = "cuiqin";
}
public class ���ǵ���������{
	public static void main(String[] args)
	{
		son p = new son();
		//���ܷ���˽�б���
		//System.out.println(p.tag);
		//��ʾ����ת�ͣ����ʰְֵĹ���ʵ������
		System.out.println(((father)p).tag);//ʹp����ǿ������ת��Ϊ���������ע������������Ǹ��׵�����
	}
}

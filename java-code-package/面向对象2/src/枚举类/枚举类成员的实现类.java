package ö����;

public class ö�����Ա��ʵ���� {
	public static void main(String[] args)
	{
		//ͨ����valueOf()������ȡָ��ö�����ö��ֵ
		//ö����ĳ�Ա g = Enum.valueOf(ö����ĳ�Ա.class, "FEMALE");
		//ֱ��Ϊö��ֵ��nameʵ��������ֵ
		//g.name = "girl";
		//ֱ�ӷ���ö��ֵ��nameʵ������
		//System.out.println(g + "����" + g.name);
		
		ö����ĳ�Ա g = ö����ĳ�Ա.valueOf("FEMALE");
		g.setName("girl");
		System.out.println(g+"����"+g.getName());
		//�����ظ��������ƣ��������ʾ����������ѡ�����FAMALE
		g.setName("man");
		System.out.println(g+"����"+g.getName());
	}
	/*
	 * 	��ʹ����ͨ��ķ���������	��������ʽ��ͬ��ö�����ʵ��ֻ����ö��ֵ�������������ͨ��new
	 */
}

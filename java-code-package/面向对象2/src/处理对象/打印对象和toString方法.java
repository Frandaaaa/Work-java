package �������;

class Person//�������������ִ�Сд��
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
}

public class ��ӡ�����toString���� {
	public static void main(String[] args)
	{
		//��ӡ����
		Person p = new Person("����");
		System.out.println(p);//ʵ����������˺�toString �ķ���
		//toString��Object�������һ��ʵ�����������е�Java����Object��ķ��������е�Java������toString����
		System.out.println(p.toString());
		//ͬʱ��������������һ��ֻҪ�Ǻ�""�ӷ�����ͻ�ֱ�ӵ���toString����
		String pStr = p + "����";
		String pStr2 = p.toString() + "����";
		System.out.println(pStr + pStr2);
		
		//toString ��һ�����������Ĺ���,��ӡ�����ʱ������ "����+@+hashcode"
	}
	
}

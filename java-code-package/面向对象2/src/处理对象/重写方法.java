package �������;
/**
 * @see		�������.��̬.instanceof�����||equals����
 * @author 	����
 */

/**
* 	��дequals������Ҫ���ϵ�Ҫ��
* 	�Է���					x.equals(x) ����true
* 	�Գ���					y.equals(x) �� x.equals(y) ���ؽ��һ��
* 	������					x.equals(y) ����true y.equals(z) ����true �� x.equals(z) ҲҪ����true
* 	һ����					x.equals(y) ���۵��ü��Σ���Ҫ����ͬ�Ľ��
* 	������x					x.equals(null) һ������false
*/

class ��
{
	private String name;
	private String idStr;
	public ��() {}
	
	public ��(String name, String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	public String getName()
	{
		return this.name;
	}
	public String getStr()
	{
		return this.idStr;
	}

	//�Զ���equals����
	public boolean equals(Object obj)
	{
		//ͬһ������
		if(this == obj)
		{	
			return true;
		}
		//obj���˶���
		//�ж��Ƿ�Ϊ����ʵ������ʹ��instanceof ��a instanceof b ��a��b��ʵ����������ʱ���᷵��true�����ʹ��a.getClass()==��.class
		if(obj != null && obj.getClass() == ��.class) 
		{
			�� personObj = (��)obj;
			//��ǰ�����idStr������idStr���ʱ�ſ����ж������������
			if(this.getStr().equals(personObj.getStr()))
			{
				return true;
			}
		}
		return false;
	}

}

public class ��д���� {
	//ϣ������������ͬ�Ķ�����ȣ����ҹؼ�������ͬ����Ҫ��д����
	public static void main(String[] args)
	{
		�� p1 = new ��("����", "123132121");
		�� p2 = new ��("�ش�", "123132121");
		�� p3 = new ��("����", "12313212");
		
		//id��ͬ��������ͬ������ͬ�����ֲ�ͬ
		System.out.println("p1��p2" + p1.equals(p2));
		//id��ͬ��������ͬ������ͬ
		System.out.println("p1��p3" + p1.equals(p3));
	}
	
}

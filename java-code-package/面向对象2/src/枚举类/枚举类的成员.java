package ö����;

/**
 * 	ö�������࣡�����г�Ա������������������
 * 
 *
 */
public enum ö����ĳ�Ա {
	MALE,FEMALE;
	//ʵ������
	//public String name;
	//�����������������װ�����ã����Ҫ���������Ըı�͵���ֵ���п���
	private String name;
	public void setName(String name)
	{
		switch (this)
		{
		case MALE:
			if(name.equals("man"))
			{
				this.name = name;
			}
			else
			{
				System.out.println("��������");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("girl"))
			{
				this.name = name;
			}
			else
			{
				System.out.println("��������");
				return;
			}
			break;
		}
	}
	public String getName()
	{
		return this.name;
	}
}


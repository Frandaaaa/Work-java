package ���غͷ�װ;

public class ���ʿ��Ʒ� {
/**
 * 	�ṩ��������private protected public
 * 	���ʿ��Ƽ���private --> default --> protected --> public
 * 	default:��ʹ���κο��Ʒ���������������Ա
 * 	private:ֻ���ڴ�����ڲ�������
 * 	default:������Ȩ��=����ͬ�İ��µ���������ʣ����ǲ���package?��
 * 	protected:���Ա�һ�����е���������ʣ�Ҳ���Ա���ͬ���е��������
 * 	public:����������ʣ������κι�ϵ 
 */
	//Դ�ļ��е������඼û��ʹ��public���Σ��ļ���������һ�кϷ���
	private String name;//���ر���
	private int age;
	//�ṩ�˷���������name��Ա����
	public void setName(String name)
	{
		//�Ϸ���У��
		if(name.length() > 6 || name.length() < 2)
		{
			System.out.println("������Ҫ���õ��û���������2~6֮��");
			return;//���ط���
		}
		else
		{
			this.name = name;
		}
	}
	public String getName()
	{
		return this.name;
	}
	//�ṩ����age�ĳ�Ա����
	public void setAge(int age)
	{
		//�������У��
		if(age >100 || age < 12)
		{
			System.out.println("������䲻����Ҫ��");
		}
		else
		{
			this.age = age;
		}
	}
	public int getAge()
	{
		return this.age;
	}
/**
 * 	���һ�����е����е�ʵ������ȫ��private���η�ղ��ң�ӵ�ж�Ӧ��setter��getter��������������һ������JavaBean�淶����
 * 	����һ����װ���õ���
 *  ���ʿ��Ʒ���
 *  	������Ĵ󲿷ֳ�Ա������Ӧ��ʹ��private���� 
 *  	static������ȫ�ֱ����ĳ�Ա���� ==����ʹ��public
 *  	ĳ������Ҫ��������ĸ��ࣺ����������Ĵ󲿷ַ������ܽ�ϣ������������д�����������ֱ�ӵ��ã�Ӧ��ʹ��protected������Щ����
 *  ϣ����¶�����������ɵ��õķ��� == public == ��Ĺ�����ʹ��public�Ӷ������������ط����������ʵ���� -- �ⲿ��ͨ����ϣ��������������ʹ��
 */
}

package thisʵ��;

public class this��Ϊ����ֵ {
	public int age;
	public this��Ϊ����ֵ grow()
	{
		age++;
		return this;//this���ص��ø÷����Ķ���
	}
	public static void main(String[] args)
	{
		this��Ϊ����ֵ rt = new this��Ϊ����ֵ();
		
		rt.grow().grow().grow();
		
		System.out.println("new����rt��age��Ա������"+rt.age);
	}
}
//ʹ��this��Ϊ�����ķ���ֵ�����ô�����Ӽ�࣬���ǿ������ʵ�������ģ����
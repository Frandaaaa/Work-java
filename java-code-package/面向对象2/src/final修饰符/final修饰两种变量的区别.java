package final���η�;
/**
 * @see	���̿���������.����.�����˽�����
 * @author ����
 */

/**
 * *����final���λ������ͱ������ܱ��ı䣬�������ͱ���ֻ�Ǳ�֤������������ͱ��������õĵ�ַ����ı䣬һֱ�����õ���ͬһ�����󣬶�����ȫ���Է����ı�
 * 
 */
import java.util.Arrays;;
class Person
{
	private int age;
	public Person() {}
	public Person(int age)
	{
		this.age = age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}

public class final�������ֱ��������� {
	public static void main(String[] args)
	{
		//final�����������,ע�⣬iArr��һ�����ñ���
		final int[] iArr = {6,8,5,6};
		System.out.println(Arrays.toString(iArr));
		//����
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//��ֵ
		iArr[2]=3;
		System.out.println(Arrays.toString(iArr));
		//��ֱ�Ӷ����鸳ֵ
		//iArr = null;//�Ƿ�
		//final�������ñ���
		final Person p = new Person(18);
		//�ı�ʵ���������Ϸ�
		p.setAge(19);
		System.out.println(p.getAge());
		//�����ö���ֵ,�Ƿ�
		//p = null;
	}
	//kao!!final�����ѽ
}

package ������;

/*
 * 	boolean	equals(Object obj)		ָ��������ö����Ƿ����	һ��ʱtrue
 * 	protected void finalize()		û�����ñ������õ��ö����ǣ����������ڵ��ô˷���������������Դ
 * 	Class<?>getClass()				���ظö��������ʱ��
 * 	int hashCode()					Ĭ�����С�Ǹ��ݶ���ĵ�ַ������hashֵ��Ȼ��������෽������д��	
 * 	String toString()				���ظö�����ַ�����ʾ
 */

/*
 * 	�Զ�����ʵ�֣�	Clonebale			ʵ�ָýӿڵĶ������ʵ��"���ҿ�¡"
 * 	�Զ�����ʵ���Լ���clone()����
 * 	������clone()����ͨ��super.clone()
 * 
 * 	Objedct ��� .clone����ֻ��ǳ��¡��ֻ�ǿ�¡�˸ö�������г�Ա����ֵ��������������͵ĳ�Ա����ֵ�����õĶ�����п�¡
 * 		���¡���ݹ��¡����֤���е��������ͳ�Ա����ֵ�����ö��󶼱���¡
 */
class Address
{
	String detail;
	public Address(String detail)
	{
		this.detail = detail;
	}
}

class User implements Cloneable
{
	
	int age;
	
	Address address;
	public User(int age)
	{
		this.age = age;
		address = new Address("����");
	}
	//ͨ������super.clone()��ʵ��clone()����
	public User clone()	
		throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}

public class Object {
	//���ҿ�¡
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		//����һ������
		User u1 = new User(23);
		//���u1����
		User u2 = u1.clone();
		//�ж� u1 �� u2 �Ƿ���ͬ
		System.out.println(u1 == u2);
		//
		System.out.println(u1.address == u2.address);
	}
}

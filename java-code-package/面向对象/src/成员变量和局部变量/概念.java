/**
 * @author ����
 */
package ��Ա�����;ֲ�����;
/**
 * 						ʵ��(��⣺��Ա)����������static
 * 			��Ա����      {
 * 						��(��⣺��Ա)��������static
 * 	���б���      {	
 * 						�βΣ�����ǩ���ж���ı���
 * 						
 * 			�ֲ�����      {		�����ֲ��������ڷ����ڶ���
 *						
 *						�����ֲ��������ڴ���鶨��
 *
 *	����һ����һ������ʹ��֮ǰҪ��������ء�����֤����׼��������������ʼ���ȼ����׶�
 *
 *	���ʱ���������﷨��
 *
 *	�������
 *	ʵ��.ʵ������
 *	ʵ��.�����		--	������ʵ���Ȼ�Ǵ�ʵ��������������
 *
 */

class Person
{
	//ʵ������
	public String name;
	//�����
	public static int eyeNum;
}

public class ���� {
	public static void main(String[] args)
	{
		//���������
		System.out.println("Person��eyeNum�����ֵ��"+ Person.eyeNum);
		//����Person����
		Person p = new Person();
		System.out.println("ʵ����ȡ�ı�����"+p.name+"\n"+p.eyeNum);
		p.name = "����";
		p.eyeNum = 2;
		System.out.println("ʵ����ȡ�ı�����"+p.name+"\n"+p.eyeNum);
		//����һ���µĸ���Ʒ
		Person p1 = new Person();
		System.out.print("�¶���ı�����"+p1.name+"\n"+p1.eyeNum+"\n");
		//ʵ��������������䣺
	/**
	 *	����������������ͬһ���������ʵ�����ʵĶ���ͬһ���������ͬһ���ڴ���
	 *	ͨ��ʵ��������static��Ա���������Σ������Խ����滻��ͨ���౾��������static��Ա����
	 */
		//�ֲ�����
	/**
	 * 	�β�				����Ҫ��ʾ��ʼ��	
	 * 	�����ֲ�����					}	��Ҫ�ı��룬�����ܷ���
	 * 				}	��Ҫ��ʾ��ʼ��
	 * 	�����ֲ����� 	
	 * 	
	 */
		//�����ֲ�����
		int a ;
		//System.out.print(a);//û�г�ʼ���ᱨ��
		a = 5;
		System.out.println(a);
	}
		//bucunzai
		//System.out.println(a);
}

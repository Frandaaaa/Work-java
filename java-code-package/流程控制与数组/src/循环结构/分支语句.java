package ѭ���ṹ;
/**
 * @author 		����
 * @function	ѭ��
 * 
 */

public class ��֧��� {
	public static void main(String[] args)
	{
		int a = 23;
		//if-else ��֧��䣬������Ĵ���ֻ��һ���ʱ����Ҫ�û�����
		if(a > 20)
			System.out.println("a����20");
		else
			System.out.println("aС��20");
		//ͨ������������,������������Ĵ���ֻ��һ��
		//�����ж� ע��ѭ��˳��,else����������,����ִ�з�Χ��С��
		int age = 48;
		if (age > 60)
		{
			System.out.println("old man");
		}
		else if (age > 40)
		{
			System.out.println("mid man");
		}
		else if (age > 20)
		{
			System.out.println("young");
		}
		
		//Swith-case
		char s = 'c';
		//s��ֻ��Ϊbyte short char int�������͡�string Ҫ�ڸ��߰汾
		switch (s)
		{
		case 'a':
			System.out.println("ţ��");
			break;
		case 'b':
			System.out.println("�Ҿ��ú���");
			break;
		case 'c':
			System.out.println("����");
			break;
		default:
			break;
		}
	}
}

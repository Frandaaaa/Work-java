package ѭ���ṹ;

public class ѭ����� {
	public static void main(String[] args)
	{
		//��ʼ��ѭ������
		int count = 0;
		while (count < 10)
		{
			System.out.println(count);
			count++;
		}
		System.out.println("ѭ������");
		//��Ȥ����ѭ��
		//int num = 0;
		//while (num < 10)
		//{
		//	System.out.println("��ѭ������"+num);
		//	num++;
		//}
		
		//do-while���ص��ǲ����������㶼��ѭ��һ��
		int fix = 1;
		do 
		{
			System.out.println(fix);
			fix++;
		}while(fix<10);//��������ֺ����𣡣���
		System.out.println("do-whileѭ������");
		//for(1;2;3)
		for (int b = 0,s = 0,p = 0;b < 10 && s < 4 && p < 10;p++)
		{
			System.out.println(b++);
			System.out.println(++s + p);
		}
		//ֵ��ע�����ѭ��
		//for (;;)
		//{
		//	System.out.println("=========");
		//}
		//�����forѭ��ǰ�������������ȫ������
		//ѭ������i/j/k
	}
}

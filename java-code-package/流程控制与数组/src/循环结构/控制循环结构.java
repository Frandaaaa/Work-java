package ѭ���ṹ;

public class ����ѭ���ṹ {
	public static void main(String[] args)
	{
		//break��ȫ����ѭ��,continueֻ�Ǹ㶨һ��ѭ�����̣�һ���������ض���ѭ��
		//ֱ�ӿ���
		int i = 0;
		for(i = 0;i<10;i++)
		{
			System.out.println(i);
			if(i ==2)
			{
				break;
			}
		}
		//ѭ���ı�ʶ��:���ڸ��õı�ʶѭ��
		System.out.println("��һ��ѭ������");
		outer0:
		for(i = 0;i<3;i++)
		{
			for (int j = 0;j < 9;j++) 
			{
				System.out.println("i��ֵΪ��"+i+"j��ֵΪ��"+j);
				if(j == 1)
				{
					break outer0;//������ã�������ʶ��������break�������֮ǰ�����������
				}
			}
		}
		System.out.println("��er��ѭ������");
		for(i = 0; i<5;i++)
		{
			System.out.println("i��ֵ��"+i);
			for(int j = 0;j<3;j++) {
				if(j == 1)
				{
					//�������������һ��ѭ��
					continue;
				}
				System.out.println("j��ֵΪ��"+j);
			}
			System.out.println("haha");
		}
	}
}

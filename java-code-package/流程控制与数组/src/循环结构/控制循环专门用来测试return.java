package ѭ���ṹ;

public class ����ѭ��ר����������return {
	public static void main(String[] args)
	{
		int i = 0;
		for(i = 0; i<5;i++)
		{
			System.out.println("i��ֵ��"+i);
			for(int j = 0;j<3;j++) {
				System.out.println("j��ֵΪ��"+j);
				for(int k = 0;k<5;k++) 
				{
					System.out.println("k��ֵΪ��"+k);
					if(k ==4)
						//���Է��֣��������ֱ�������������������
						return;
				}
			}
		}
		System.out.print("��֪���ܲ���������仰");
	}
}

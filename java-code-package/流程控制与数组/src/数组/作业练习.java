package ����;

public class ��ҵ��ϰ {
	
	public static void main(String[] args)
	{
		//�����ģ�����ľžų˷���
		for(int i = 1;i < 10;i++)
		{
			for(int j = 1;j < i+1 ;j++)
			{
				System.out.print(i+"*"+j+"="+i*j);
				if(j<i)
					System.out.print(",");
			}
			System.out.print("\n");
		}
		
		//�������������
		/**
		 * ��	�ո���	�Ǻ�
		 * 1	4-1		1
		 * 2	4-2		3
		 * 3	4-3		5
		 * 4	4-4		7
		 * ����Ц����ǣ��Ҿ�Ȼһ��ʼ�����ƺ���Ŀո����������ȫ����Ҫ�ģ�ֻ�ù�ǰ��Ŀո�Ͳ�����ǺžͿ�����
		 */
		int num = 5;
		for(int i = 1;i<5;i++)
		{
			for(int j = 1;j<num-i;j++)//���ƿո�
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=i*2-1;k++)//�����ǺŸ���
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


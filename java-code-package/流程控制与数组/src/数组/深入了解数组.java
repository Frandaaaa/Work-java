package ����;

public class �����˽����� {
	public static void main(String[] args)
	{
		//������û�ж�ά���飬ֻ�ǿ��Ե���һλ���鴦��
		//��Ϊ���������ϵļ�ά���飬����һλ����ı���
		String[][] newnewArr0 = new String[4][];
		for (int i = 0;i<newnewArr0.length;i++)
		{
			System.out.println(newnewArr0[i]);
		}
		//���Կ�����x-y �� (4,?)
		//����ά���鸳ֵ�ķ���
		newnewArr0[0] = new String[8];
		newnewArr0[0][0] = "woc";
		newnewArr0[0][1] = "woca";
		newnewArr0[0][2] = "wokao";
		newnewArr0[0][3] = "woqiao";
		for(int i = 0;i<newnewArr0[0].length;i++)
		{
			System.out.println(newnewArr0[0][i]);
			//��������ά�����е�һ������ֵ��������е�����
		}
		newnewArr0[1] = new String[2];
		newnewArr0[1][0] = "hello world";
		newnewArr0[1][1] = "hello";
		for(String book:newnewArr0[1])
		{
			System.out.println(book);
		}
		System.out.println("--");
		//��β��Ӧ������ͬʱ��̬��ʼ����ά����ĳ���
		String[][] newArr0 = new String [3][4];
		
		//Ҳ�����þ�̬��ʼ��
		String[][] newArr1 = new String [][] {new String[3],new String[]{"cuiqin"}};
		newArr0[0][1] = "cuo";
		for(int i = 0;i<newArr0[0].length;i++)
		{
			System.out.println(newArr0[0][i]);
		}
		System.out.println("�ָ���");
		for(int i = 0;i<newArr1[1].length;i++)
		{
			System.out.println(newArr1[1][i]);
		}
		//emmmm��������ȥ��ʹ��Arrays���ߵķ�����ע�⸴ϰ 
		/**
		 * ����Ҫ���� java.util.*;
		 * Arrays.equals(array0,array1)	�Ƚ����������Ƿ����
		 * Arrays.copyOf(array,num)		����һ��ӵ�к�array��Ԫ��һ��,����Ϊnum������
		 * Arrays.toString(array)		�������е�Ԫ�ػ�Ϊ�ַ������
		 * Arrays.fill(array,be,la,n)	��array�е�(be+1)~(la+1)��Ԫ�ظ�ֵΪn
		 * Array.sort(array)			��array��Ԫ�ؽ�������
		 */
		
	}
}



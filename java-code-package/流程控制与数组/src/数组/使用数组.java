package ����;

public class ʹ������ {
	public static void main(String[] args)
	{
		//��̬
		Object[] newArr;
		newArr = new Object[] {"���","a"};
		Object[] newArr0 = {"a","b"};
		//��̬
		Object[] newArr1 = new Object[4];
		System.out.println(newArr0[0]);
		System.out.println(newArr1[2]);
		//�����鸳ֵ
		newArr1[2] = "����";
		System.out.println(newArr1[2]);
		
		//Object[] newArr2 = {"a","b","c","d"};
		int[] newArr2 = new int[4];
		for(int i = 0;i<newArr2.length;i++)
			System.out.println(newArr2[i]);//��������Ԫ�صķ���
		
	}
}

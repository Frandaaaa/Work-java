package Lambda���ʽ;

import java.util.Arrays;

public class Lambda���ʽ����Array�෽�� {
	public static void main(String[] args)
	{
		//��̬��ʼ������
		String[] arr1 = new String[] {"java", "fkava", "fkit", "ios", "android"};
		Arrays.parallelSort(arr1,(o1,o2) -> o1.length() - o2.length());//�����ַ����ĳ��������ַ�Խ�����ַ���Խ��
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[] {3,4,34,15,5};
		//left	���������е�ǰһ����������Ԫ�أ� �����һ��Ԫ��ʱ��leftΪ1
		//right ���������е�ǰ��������Ԫ��
		Arrays.parallelPrefix(arr2, (left,right) -> left * right);//ǰ��ֵ�ĳ˻�ȷ�������ֵ��3*4 12*34...
		System.out.println(Arrays.toString(arr2));
		long[] arr3 = new long[5];
		//oerand��ʾ���ڼ����Ԫ������
		Arrays.parallelSetAll(arr3, operand -> operand * 5);//������ֵ�����Ժ����
		System.out.println(Arrays.toString(arr3));
	}
}

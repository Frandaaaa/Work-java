package work_1;

import java.util.*;
/**
 *  @author ����
 *  @function	����ɼ��������ǰ������
 *	 �ܽ�һ�°ɣ�
 *	��䶼֪�������ǲ����ã�
 *		Arrays.sort()�������õ������е�
 *		��Ե�����������ô��ֻ�ܴӺ���ǰ���������i�ķ�ʽ�仯
 *		�߼�����	||	&& ɵɵ�ֲ���
 */
public class scoresSort {
	public static void main(String[] args)
	{
		int[] scores = {94,34,67,65,45,78,100,32,-20};
		
		scoresSort p = new scoresSort();
		p.test(scores);
	}
	public void test(int[] books)
	{
		Arrays.sort(books);
		int num = 0;
		for(int i = books.length - 1;i > 0; i--)
		{
			if(books[i]>100 || books[i]<0)
			{
				continue;
			}
			num++;
			if(num>3)
			{
				break;
			}
			System.out.println(books[i]);
		}
	}
}

/**
 * @author ����
 * @version	1.0
 */
//���Ե�˼·�����������е����� �ж���������ֵ�ֵ��������в�Ϊ���Ԫ�ص�����ֵ��Ȼ������ĸ�������������µ�����ֵȻ�󴴽��µ��������
//Ȼ��û�и�ֵ��ϵͳĬ��Ϊ�㣬����ƶ��Ĳ����㣬�����趨Ĭ��ֵ���ƶ���ֵ�Ժ��ٸ��µ����鸳ֵ
public class MoveZero {
	public static void main(String[] args)
	{
		int[] nums = {0,1,0,3,12};
		int[] newArr = new int[nums.length];
		int num = 0;
		for(int i = 0; i<nums.length; i++)
		{
			if(nums[i]!=0)
			{
				newArr[num] = nums[i];
				num++;
			}
		}
		
		nums = newArr;
		//�����ǲ����µ������Ԫ��ֵ�Ĵ���
		for(int book:nums)
		{
			System.out.println(book);
		}
	}
}

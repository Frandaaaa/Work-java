package �������ϵĹ�����Collections;
//����Set List Map
import java.util.*;

/*
 *	void reverse(List list) ��ת˳�򣿣� 	
 *	void shuffle(List list)	�������ģ��ϴ�ƶ���
 *	void sort(List list)	������Ȼ����ָ��
 *	void sort(List list, Comparator c) ������Ȼ˳���ָ����List����Ԫ�ذ�����������
 *	void swap(List list, int i, int j)ָ����List�����е�i��Ԫ�غ�j��Ԫ�ؽ��н���
 *	void rotate(List list, int distance) ������ʱ����list���Ϻ����distance��Ԫ��
 *		�����ƶ���ǰ��;��distanceΪ����ʱ�򣬽�list���ϵ�Ǯdistance��Ԫ��"����"
 *			������˼����ת
 */

//for example
public class ������� {
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		Collections.reverse(nums);//��ת
		System.out.println(nums);
		Collections.sort(nums);//����
		System.out.println(nums);
		Collections.shuffle(nums);//ϴ��
		System.out.println(nums);
	}
}

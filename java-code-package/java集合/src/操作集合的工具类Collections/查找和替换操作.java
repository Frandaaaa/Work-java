package �������ϵĹ�����Collections;
import java.util.*;

/*
 * 	����ķ�����api
 */

//for example
public class ���Һ��滻���� {
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);//�������˳��
		
		System.out.println(Collections.max(nums));//
		System.out.println(Collections.min(nums));
		Collections.replaceAll(nums, 0, 1);//��nums�е�0ʹ��1������
		System.out.println(nums);
		
		//�ж�-5��list�����еĳ��ִ����� ����1
		System.out.println(Collections.frequency(nums, -5));
		Collections.sort(nums);//����
		System.out.println(nums);
		//�����Ժ�ļ��ϲ���˳�����ʹ�ö��ַ�����ѯ
		System.out.println(Collections.binarySearch(nums, 3));
	}
}

package Queue����;
/**
 * @see		java����.Set����.TreeSet��Ķ������� || java����.Set����.TreeSet�����Ȼ����
 */
import java.util.*;

/*
 * 	�Բ������������ôţ�ƣ��ǰ��ն����е�Ԫ�صĴ�С�����Ժ��˳��ȡ������������С��Ԫ��
 * 		Ҳ������������ʽ����Ȼ����Ͷ�������
 */

//for example
public class PriorityQueueʵ���� {
	public static void main(String[] args)
	{
		PriorityQueue pq = new PriorityQueue();
		//���μ���Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//��������۲������˳��
		System.out.println(pq);
		//���� the first item
		System.out.println(pq.poll());
	}
}

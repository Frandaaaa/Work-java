package Queue����;
import java.util.*;

/*
 * 	�˽ӿ�����Queue�ӿڵ����ࣺ˫�˶���
 * 	����
 * 		void addFirst(Object e) ָ��Ԫ�ز����˫�˶��еĿ�ͷ
 * 		void addLast(Object e)					��β
 * 		Iterator descendingIterator() ����˫�˶��еĵ�����
 * ...P223 
 * 
 * 	Deque �����ǿ��Ե�����˫�˶���ʹ�ã����ҿ��Ա�������ջʹ�ã����������pop push����
 * 
 * 	����Deque ����ָ��һ��numElement����������ָ��Object[] ����ĳ��ȣ���ָ��Ĭ��Ϊ16
 * 
 * 	ArrayList and ArrayDeque �����������ʵ�ֻ��ƻ�������
 * 		��������һ����̬�ġ������·����Object[] �������洢����Ԫ�أ������洢�ռ�ʱ����Զ��ٴ�����һ���µ�Object[] ����
 */

public class Deque�ӿ� {
	public static void main(String[] args)
	{
		//������ջʹ��
		ArrayDeque stack = new ArrayDeque();
		stack.push("cuiqin1");
		stack.push("cuiqin2");
		stack.push("cuiqin3");
		//���
		System.out.println(stack);//����ȳ�
		
		//firts item
		System.out.println(stack.peek());
		//��ɾ��
		System.out.println(stack);
		//��ջ��ɾ��
		System.out.println(stack.pop());
		//
		System.out.println(stack);
		
		//�����Ƕ���ʹ��
		ArrayDeque queue = new ArrayDeque();
		queue.offer("cuiqin1");
		queue.offer("cuiqin2");
		queue.offer("cuiqin3");
		//��˳�����
		System.out.println(queue);
		//��ɾ������һ��
		System.out.println(queue.peek());
		//test
		System.out.println(queue);
		//ɾ������һ��
		System.out.println(queue.poll());
		//test
		System.out.println(queue);
	}
}

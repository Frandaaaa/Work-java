package List����;
/**
 * @see		java����.Queue����.Deque�ӿ�
 */
import java.util.*;

/*
 * ��Ȼ��list������ô������������������ʼ����е�Ԫ�أ�ʵ����Deque�ӿڣ����Ա�������˫�˶�����ʹ�á�
 * 		����һ�����к�ջ��
 */
public class LinkedListʵ���� {
	public static void main(String[] args)
	{
		LinkedList books = new LinkedList();
		//���뵽���е�β��
		books.offer("cuiqin1");
		//���뵽ջ�Ķ���
		books.offer("cuiqin2");
		//������ǽ�Ԫ�ؼ��뵽���е�ͷ��(�൱��ջ�Ķ���)
		books.offerFirst("cuiqin3");
		//������������
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println("������" + books.get(i));
		}
		//���ʲ���ɾ��ջ����Ԫ��
		System.out.println(books.peekFirst());
		//���ʲ�����ɾ���������һ��Ԫ��
		System.out.println(books.peekLast());
		//��Ԫ�ص���"ջ"
		System.out.println(books.pop());
		
		System.out.println(books);
		//����ɾ�����һ��Ԫ��
		System.out.println(books.pollLast());
		//���
		System.out.println(books);
		
		//������ţ�ƣ�����ǿ��
		//ԭ����ArrayList ��  ArrayDeque �ڲ���������ʽʵ�ֱ��漯���е�Ԫ�صķ�ʽ���ã�������ʼ���Ԫ���нϺõ�����
		//�����LinkedList ���治һ����������ķ�ʽ�����漸���е�Ԫ�أ��������Ԫ�ص����ܽϲ�����֣����롢ɾ��Ԫ��ʱ���ܱȽϳ�ɫ
		//�����������⣺����P236
	}
}

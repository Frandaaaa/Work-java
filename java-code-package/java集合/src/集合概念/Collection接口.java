package ���ϸ���;

import java.util.*;

/**
 * @see		����
 * @author ����
 *
 */

/*
 * 	���巽ʽ��
 * 		boolean addAll(Colletion c)			�Ѽ���c�����������ԭɫ��ӵ�ָ����������
 * 		void clean() 						�������Ԫ�أ����ҳ��ȱ��0
 * 		boolean contains(Object o)			���ؼ������Ƿ����ָ����Ԫ��
 * 		boolean	containAll(Collection c)	���ؼ��������Ƿ��������C�е�Ԫ��
 * 		boolean	isEmpty()					���ؼ����Ƿ�Ϊ�գ������ͳ���Ϊ0ʱ����true�����򷵻�false 
 * 		boolean iterator()					����һ��Iterator���ڱ������������Ԫ��
 * 		boolean remove(Object o)			������һ�����߶��Ԫ��o������ֻ��ɾ����һ������������Ԫ��
 * 		boolean removeAll(Collection c)		��ɾ������c���������Ԫ��		ɾ����һ������(ɾ���ɹ�)return true
 * 		boolean retainAll(Collection c)		������ɾ������c���治������Ԫ��(�൱�ڶ�ʹ����������Ķ����뼯��C�е�Ԫ���󽻼�)
 * 		int size()							���ؼ�����Ԫ�صĸ���
 * 		Object[] toArray()					����İѼ��ϱ��һ�����飬������˼��������
 */

//��ɿ���������
public class Collection�ӿ� {
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		//add items
		c.add("cuiqin");
		//���������ܷŻ������͵�ֵ���������Զ�װ��Ѿ
		c.add(4);
		System.out.println("The number of c's items: " + c.size());
		//delete the pointer items
		c.remove(4);
		System.out.println("now changed : " + c.size());
		//charge whether have the pointer items
		System.out.println("whether c includes the cuiqin String: " + c.contains("cuiqin"));
		c.add("your father is me,cuiqin");
		c.add(34);
		System.out.println("The items of c : " + c);//��Ӧ�Ľ�������鲻һ����������ֱ�ӰѶ�������������ȥ,Ԫ��֮���ö��Ÿ�������������������ַ�����Ҳ�����˶��ţ��ǳ����׸����
		//ת�ͣ����಻һ������ʹ�÷������
		Collection books = new HashSet();
		books.add("cuiqin");
		books.add("cuiqinbaba");
		System.out.println("whether c collection include the books: " + c.containsAll(books));
		//count the similar items
		c.removeAll(books);
		System.out.println("now the items of c are : " + c);
		//delete all items of c
		c.clear();
		System.out.println("the items of c : " + c);//null
		//let the books contain the items of c
		books.retainAll(c);
		System.out.println("the items of book" + books);
		
		//after all, although two collection's classes are different but only see them as the collection it is the same when we use the
		//method of add, remove, clear and so on.
		
		//what's more, the reason why print out the [ele1, ele2, ...] is that the Collection all rewrite the method of toString().
		//this method can directly print all the items of collection
		//if you want to read all the items of collection one by one, you need to use other methods.
		//now the collection can remember all the kind of items.
	}
}

package Set����;

import java.util.*;
/**
 * 
 * @author ����
 *
 *
 *	���ţ�Ƶ����ࣺ��Ҫά��Ԫ�صĲ���˳��������ܱ�HashSet��һЩ
 */

public class LinkedHashSet�� {
	public static void main(String[] args)
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("cuiqin");
		books.add("cuiqingege");
		books.add("cuiqinbaba");
		
		System.out.println(books);
		//delete baba
		books.remove("cuiqingege");
		//review
		//books.add("cuiqin");�����ظ������ͬ��Ԫ�أ�����set����
		books.add("cuiqingege");//Ԫ�ص�˳�������˳��һ��
		System.out.println(books);//
	}
}

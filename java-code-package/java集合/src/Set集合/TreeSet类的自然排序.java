package Set����;

import java.util.*;
/**
 * 
 * @author ����
 *
 *	���õ���compareTo()�������Ƚ�Ԫ��֮��Ĵ�С��ϵ��Ȼ�󽫼���Ԫ�ذ�����������--��Ȼ����
 *			��һ��Comparable�ӿ�����
 *	obj1.compareTo(obj2); if return 0 -- equal , num<0 obj1 < obj2
 *	
 *	��Ȼ������һ������Ľӿڣ���ô�Ļ����Ҫ�Ѷ���Ž�TreeSet�����棬��ô�������ڵ����б���ʵ�ֽӿڰ�����
 */

//bad example
class Err{}

public class TreeSet�����Ȼ���� {
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		//first error: can't cast to java.lang.comparable
		//add two items:error
//		ts.add(new Err());
//		ts.add(new Err());
		//second: comparing items needs to change the items' kind to the same.
		//��Ҫ��treeset������ӵ�Ӧ����ͬһ����Ķ���
//		ts.add(new String("cuiqin"));
//		ts.add(new Date());
	}
}

package ��������;
import java.util.*;
/**
 * @author ����
 *	���������ͣ��������Ͼ��Ѿ�ָ���˼��ϵ�����
 */

//for example
public class ʹ�÷��� {
	public static void main(String[] args)
	{
		//����һ��ֻ��Ҫ�����ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("cuiqin");
		strList.add("cuiqin2");
		
		//error
		//strList.add(9);
		strList.forEach(str -> System.out.println(str.length()));
	}
}

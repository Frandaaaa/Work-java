package ��������;

import java.util.*;
/*
 * 	�Ľ��Ժ��ڹ��������治��Ҫ�������ķ�ʽ��Ϣ��ֻҪ����һ�Լ����žͿ���			���Լ򻯴���
 */
public class �����﷨ {
	public static void main(String[] args)
	{
		//java7�Ժ�����Զ��ƶ�
		List<String> books = new ArrayList<>();
		books.add("cuiqin1");
		books.add("cuiqin2");
		
		//��������
		books.forEach(ele -> System.out.println(ele.length()));
		
		//�����Զ��ƶ�
		Map<String, List<String>> schoolsInfo = new HashMap<>();
		
		//�����Զ��ƶ�
		List<String> schools = new ArrayList();
		
		schools.add("cuiqin3");
		schools.add("cuiqin4");
		schoolsInfo.put("cuiqin", schools);
		
		schoolsInfo.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}

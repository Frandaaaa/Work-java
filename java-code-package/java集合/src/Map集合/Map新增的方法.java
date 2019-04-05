package Map����;

import java.util.*;
/*
 * ��Ĵ����ţ�P238
 */

//for basic example
public class Map�����ķ��� {
	public static void main(String[] args)
	{
		Map map = new HashMap();
		//�ɶԷ���key-value
		map.put("cuiqin1", 100);
		map.put("cuiqin2", 200);
		map.put("cuiqin3", 300);
		
		//Map�в����ڵ�key-value ��ɵ�������Ҳûʲô��
		System.out.println(map);
		
		//ʹ��ԭ���е�value�봫�������������Ľ������ԭ����valueֵ
		map.merge("cuiqin2", 10, (oldVal, param) -> (Integer)oldVal + (Integer)param);
		System.out.println(map);
		
		//����أ�keyû��valueΪnull��ô�Ļ������������µ�value
		map.computeIfAbsent("java", (key) -> ((String)key).length());
		System.out.println(map);
		
		//���ھ��Ǽ������滻
		map.computeIfPresent("java", (key, value) -> (Integer)value * (Integer)value);
		System.out.println(map);
	}
}

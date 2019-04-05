package Map����;

/*
 * 	�������ӳ���ϵ�����ݣ��������ӣ�һ��װkey һ��װvalue
 */

/**
 * 	key	�� value ����һ������һ��һ�Ĺ�ϵ	
 * 	key --> value
 * 	���Է��֣�keyû��˳��Ϳ��Կ�����һ��set����	keySet()����
 * 
 * 	�ֵ�Map��Map�е�Ԫ����Ԫ��֮������ظ�������ֵ����ʹ������ֵ
 * 
 * 	����P237
 */

// basic function of map

import java.util.*;
public class Map�Ļ������� {
	public static void main(String[] args)
	{
		Map map = new HashMap();
		//����
		map.put("cuiqin1", 100);
		map.put("cuiqin2", 200);
		map.put("cuiqin3", 300);
		//��η����key-value���е�value �����ظ�
		map.put("cuiqin4", 100);
		//�����ظ���key �µ�value �Ḳ�� ���ǣ��������ص��Ǳ����ǵ�ֵ
		System.out.println(map.put("cuiqin1", 99));
		System.out.println(map);

		//�ж��Ƿ����ָ����key
		System.out.println("�Ƿ����ֵΪ cuiqin2 ��key: " + map.containsKey("cuiqin2"));
		//ָ����value
		System.out.println("�Ƿ����ֵΪ300��value: "
				+ map.containsValue(300));
		
		//��ģ���ȡ������ɵļ��ϲ��ұ������е�key-value��
		for(Object key : map.keySet())
		{
			//map.get(key)������ȡָ��key��Ӧ��value
			System.out.println(key + "-->" + map.get(key));
		}
		//delete the value
		map.remove("cuiqin3");
		System.out.println(map);
		System.out.println(map.get("cuiqin1"));
	}
}

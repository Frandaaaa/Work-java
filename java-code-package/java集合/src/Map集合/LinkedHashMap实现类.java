package Map����;

/*
 * 	ʹ�õ���˫��������ά��key-value�ԵĴ���,������ά��Map�ĵ���˳��˳����key-value�ԵĲ���˳��һ��
 * 	LinkedHashMap���Ա����HashMap��Hashtablemide1key-value�Խ�������
 * 
 * 	LinkedHashMap��Ҫά��Ԫ�صĲ���˳�������Ե���HashMap�����ܣ�
 * 		��������ά���ڲ�˳�������ڵ�������Map�����ȫ��Ԫ��ʱ�нϺõ�����
 */
import java.util.*;
public class LinkedHashMapʵ���� {
	public static void main(String[] args)
	{
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("cuiqin1", 100);
		scores.put("cuiqin2", 200);
		scores.put("cuiqin3", 300);
		
		//forEach() ��������scores���������key-value��
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}

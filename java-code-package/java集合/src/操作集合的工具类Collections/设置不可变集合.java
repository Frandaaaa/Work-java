package �������ϵĹ�����Collections;
import java.util.*;

/**
 * 	���ַ����ܽ�һ�£�emptyXxx()	����һ���յĲ��ɱ�ü��϶��󣬼ȿ�����List�ֿ�����SortedSet,Set,��������Map,SortedMap
 * 	singletonXxx(),����һ��ֻ����ָ������ģ����ɱ�ü��϶��󣬴˴����ϼȿ�����List����������Map
 *	unmodiffiableXxx(),����ָ�����϶���Ĳ��ɱ���ͼ���˴��ļ��ϼȿ�����List,Ҳ������Set��SortedSet��������Map��SorteMap
 */

public class ���ò��ɱ伯�� {
	public static void main(String[] args)
	{
		//����һ���յġ����ɱ�Ķ���
		List unmodifiableList = Collections.emptyList();
		//����һ��ֻ��һ��Ԫ�أ����Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("cuiqin");
		//��ͨ��Set����
		Map scores = new HashMap();
		scores.put("����", 150);
		scores.put("Java", 100);
		//������ͨ����Ķ�Ӧ���ɱ�İ汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//����һ�д��붼������UnsupportedOperationException�쳣
		//unmodifiableList.add("test");
		//unmodifiableSet.add("test");
		//unmodifiableMap.add("test");
	}
}

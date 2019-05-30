package ���뷺��;
import java.util.*;
/*
 * 	���ͣ�Ϊ�˽�һ��a������Ԫ�ظ��Ƶ���һ��b������Ԫ���У����ǵ�b�ͳ�Ϊ��a�ĸ��ࡣ��������֮����������
 */
public class �趨ͨ������� {
	public static <T> T copy(Collection<T> dest, Collection<? extends T> src) {
		T last = null;
		for(T ele : src) {
			last = ele;
			dest.add(ele);
		}
		return last;//�������һ�������Ƶ�Ԫ��
		//��ʱ�������⣺Ԫ�ص����Ͳ�ȷ����ֻ�ܿ϶�����T�����ࣩ������ֻ��ʹ��T����ͳ�ı�ʾ����src���ϵ�Ԫ������
	}
	
	//��ʱ��dest����Ԫ�����ͱ�����src����Ԫ�ص�������ͬ�������丸��
	public static <T> T copy2(Collection<? super T> dest, Collection<T> src)
	{
		T last = null;
		for(T ele : src)
		{
			last = ele;
			dest.add(ele);
		}
		return last;
	}
	
	public static void main(String[] args) {
		List<Number> in = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		
		//��ʱ��������ĸ÷����ͻᱨ����Ϊ������ڸ��Ƽ���Ԫ�صĹ����У���ʧ��src����Ԫ�ص�����
//		Integer last = copy(in,li);
		System.out.println(in);
		
		List<Number> ln = new ArrayList<>();
		List<Integer> ni = new ArrayList<>();
		li.add(5);
		//�����Ƶľ���Integer����yu
		Integer last = copy2(ln,ni);
		System.out.println(ln);
	}
}

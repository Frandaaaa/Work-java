package java�����ں�ʱ��;

/*
 * 	�Ŷ������Date��
 */
import java.util.*;

public class Date�� {
	//�󲿷ֶ������Ƽ�ʹ���ˡ�ֻ����һ�»��ܹ�ʹ�õ�
/*
 * 	Date()	����һ������ǰ����ʱ���Date����		ʵ���Ͼ��ǵ�����System.currentTimeMillis()��������ڵ�long�Ͳ���
 * 	Date(long date)	ָ����long������������һ��Date���󣬲�����ʾ ������Date�����GMT1970.01.01 00.00.00 ��ʱ�����뵥λ
 * 	
 * 	DateΪ������ķ�����
 * 		boolean after(Date when)		���Ը������Ƿ���ָ������֮��
 * 		boolean before(Date when)						֮ǰ
 * 		long getTime()					����ʱ���Ӧ��long����	��GMT �� �ö���֮���ʱ������
 * 		void setTime(long time)			���øö����ʱ��
 */
	public static void main(String[] args)
	{
		Date d1 = new Date();
		//��ȡ��ǰʱ��֮���100msʱ��
		Date d2 = new Date(System.currentTimeMillis() + 100);
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.before(d2));
	}
}

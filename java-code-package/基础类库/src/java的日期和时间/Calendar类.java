package java�����ں�ʱ��;

import java.util.*;

//Calendar��һ��������,����ʹ�ù���������������

public class Calendar�� {
	public static void main(String[] args)
	{
		//Ĭ�϶���
		Calendar calendar = Calendar.getInstance();
		//ȡ��Date����
		Date date = calendar.getTime();
		//ͨ��Date�����ö�Ӧ��Calendar����
		//��Ϊ�أ� Calendar/GregorianCalendarû�й��캯�����Խ���Date��������˵�����Ȼ��һ��Calenderʵ����Ȼ�������setTime()����
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date);
	}
}
		
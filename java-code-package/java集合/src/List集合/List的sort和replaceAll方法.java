package List����;

import java.util.*;;

public class List��sort��replaceAll���� {
	public static void main(String[] args)
	{
		List books = new ArrayList();
		books.add(new String("cuiqin1"));
		books.add(new String("cuiqin222"));
		books.add(new String("cuiqin33"));
		books.add(new String("cuiqin44444"));
		
		//ʹ��Ŀ������ΪComparator��Lambda���ʽ������ʽ�ӿڣ����ݳ�������
		books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
		System.out.println(books);
		//�滻����Ԫ��
		//Lambda���ʽ����ʹ��ÿ���ַ����ĳ�����Ϊ�µļ���Ԫ��
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);//���������ַ�������
	}
}

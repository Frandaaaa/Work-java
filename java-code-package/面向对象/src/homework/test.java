package homework;

import ����ģʽ�µ����ִ�������.Hugryman;
import ����ģʽ�µ����ִ�������.Lazyman;

public class test {
	public static void main(String[] args)
	{
		Hugryman one1 = Hugryman.getInstance();
		Hugryman one2 = Hugryman.getInstance();
		Lazyman two1 = Lazyman.getInstance();
		Lazyman two2 = Lazyman.getInstance();
		System.out.println(one1+"\n"+one2+"\n"+two1+"\n"+two2);
	}
}

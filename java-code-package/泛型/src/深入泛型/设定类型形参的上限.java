package ���뷺��;

/*
 * 	java������ʹ��ͨ����β�ʱ�趨���ޣ����ҿ����ڶ��������β�ʱ���趨���ޣ����ڱ�ʾ�������������βε�ʵ������Ҫô�Ǹ��������ͣ�Ҫô�Ǹ��������͵�����
 */

public class �趨�����βε����� <T extends Number>//���巺���࣬�����β�����Number�࣬ʹ������������ֳ���������ʱΪT�βδ����ʵ�����Ͳ���ֻ����
//Number or Number class's sub class 
{
	T col;
	public static void main(String[] args)
	{
		�趨�����βε����� <Integer> ai = new �趨�����βε����� <>();
		�趨�����βε����� <Double> ad = new �趨�����βε����� <>();
		//�������Try to send the String type to the T
		//but String is not the sub of Number
		//�趨�����βε����� <String> as = new �趨�����βε����� <>();//error
	}
}

//��ʾһ�ּ��ˣ���ҪΪ�����β��趨�������(������һ���������ޣ������ж���ӿ�����),�������βα������丸�������
/**
 * 	public class xx<T extends Number & java.io.Serializable>
 * {...}
 *  //��ʾ�ˣ�T���ͱ������丸������࣬ʵ���˶�����޽ӿڣ�Ϊ�����β�ָ���������ʱ�����еĽӿ����ޱ�����λ��������֮��ָ���������ޱ���λ�ڵ�һλ
 */ 

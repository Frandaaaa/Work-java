package ���û�����;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 	Ҫ��Ҫ��ס�󲿷�API�а�������
 */

/*
 * 	Scanner:	һ������������ʽ���ı�ɨ����
 * 			hasNextXxx() --�����ж��Ƿ�����һ�����룺hasNext()
 * 			nextXxx()		��ȡ��һ��������
 * 	ע��Xxx�ǻ�������Int Long ,etc.
 * 		ʹ�ÿո�tab���س�����Ϊ����ķָ��
 */
public class Scanner�� {
	/*
	 * 	public: ��¶��JVM�ɷ�����
	 * 	static:	ֱ�ӵ������෽��
	 * 	void:	ָ��û�з���ֵ�������壬
	 * 	String[] args :	������һ��args ����
	 * 
	 * 	���п�ʼ֮ǰ�ͻ�ù̶��Ĳ���ֵ������������л�õ����룺ʹ��Scanner��
 	 */
	public static void main(String[] args) throws Exception //throws Exception��ʾmain�����������κ��쳣
	{
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");//���÷ָ�ķ�����û��Ĭ�Ͻ�ÿ����һ�е���һ������
		//	���ж�ȡ�İ��أ�	boolean hasNextLine()�ж��Ƿ�����һ�У�
		//String nextLine()	��������԰����һ�е��ַ���
		
//		�ַ���
//		while(sc.hasNext())
//		{
//			System.out.println("����������ǣ�"+sc.next());
//		}
		
//		��ȡ�κλ����͵�����
		while(sc.hasNextLong())//�����չ涨����ͻ��˳�
		{
			System.out.println("�����ˣ�"
					+ sc.nextLong());
		}
		
		//ǿ����໹���Ի�ȡ�ļ�������
//			Scanner sc2 = new Scanner(new File("Scanner��.java"));
//			System.out.println("���ݣ�");
//			while(sc2.hasNextLine())
//			{
//				System.out.println(sc2.nextLine());
//			}
		
			
	}
}


package �߼������;
/**�﷨
 * @author ����
 * @version 1.0
 * 				char -->
 * 						int --> long --> float --> double
 * 	byte -->	short-->
 * 
 * */

public class signs {
	public static void main(String[] args)
	{
		/**
		 * 	�߼��������
		 * &&
		 * & -->
		 * 		����·��::::��·����⣺�����һ�������������ͻ�ֱ���������
		 * | -->
		 * ||
		 * !
		 * ^	��򣬵�������������ͬʱ�Ż᷵��true
		 */
		System.out.println(!true);
		
		//���Զ�·
		int a = 5;
		int b = 10;
		if(a>4 | b++ >10)
		{
			System.out.println(a+"\n"+b);//����·����ʹ��ǰ��ı��ʽ�����ˣ���Ȼ��ִ�к���ı��ʽ
			
		}
		
		int c = 5;
		int d = 10;
		if(c>4 || d++ >10)//��·�˾Ͳ���ִ�к���������
		{
			System.out.println(c+"\n"+d);
		}
		
		//�򻯵�if��䣺��Ŀ�������?
		//��ʽ��expression ? if-true-statement : if-faulse-statement
		String str = 5 > 3 ? "yes" : "no";
		System.out.println(str);
		
		//��Ŀ���ʽû��if-else�����ɶ������Ǽ򻯣�Ҳ����ִ�и��ӵ��ж�
		int e = 11;
		int f = 12;
		String str0 = e < f ? "eС��f" : (e < f ? "eС��fa" : "e����f");
		System.out.print(str0);
	}
}





package �ӿ�;
/**
 * 	�ӿڶ�̳�
 */
//public���εĽӿڱ��������ļ�����ͬ
interface interfaceA
{
	int PROP_A = 6;
	void testA();
}
interface interfaceB
{
	int PROP_B = 4;
	void testB();
}
interface interfaceC extends interfaceA,interfaceB
{
	int PROP_C = 2;
	void testC();
}
public class �ӿڵļ̳� {
	public static void main(String[] args)
	{
		//�̳��Ժ��ó���
		System.out.println(interfaceC.PROP_C);
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
	}
}

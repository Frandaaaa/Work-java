import java.util.*;

/**
 * @author ����
 */
//˼·���ı��ֻ�����������ֵ�����������Ԫ�أ���˿�����Ԫ�ص�����ǻ��һ��ʼ�����
//������ֵ��ʼ�жϣ����ĸ�ȥ����Ȼ�󽫺����ȫ����˳���ᵽǰ��������������ѭ������һ����ȡ������ĵ��µ����飬�ڶ���
//�ǽ�ǰ���ȡ�����µ�����ĺ��棬Ȼ���������Ҹ�ֵ���ڶ���Ԫ��Ϊ���ʱ��ֹͣ
//����˼·���ݹ鹫ʽ���ɹ��ɣ���ǰ�����ƣ��������(0~n-1),һ��n���ˣ�����m-1������֪�ڶ���ѭ����ʼ����ԭ�������m%n(�и���)��Ȼ������������ţ�
/*
 * 	k		0
 * 	k+1		1
 *  ...
 *  0		m-1-k
 *  ..
 *  k-2		m-2
 *  k-1		m-1
 * 
 * 
 * 	�ο����ͣ�https://blog.csdn.net/xs1997/article/details/53888408
 */
//���������
public class NotFour {
	public static int fn(int n)
	{
		int m = 4;
		if(n == 1)
		{
			return 0;
		}
		else
		{
			return (fn(n-1)+m)%n;//��ѧ��ʽ�����Ե�ģ������޷�ʵ�ָ�λ
		}
	}
	public static void main(String[] args)
	{
		int num = 0;//��ȡ���������Ԫ��ֵ
		System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");
		while(sc.hasNextInt())
		{
			//�����Nֵ
			int N = sc.nextInt();
			
			System.out.println("�����鳤��ԭ�����Ϊ"+(fn(N)+1));
		}
	}
}
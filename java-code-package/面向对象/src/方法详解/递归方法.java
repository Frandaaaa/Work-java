package �������;

public class �ݹ鷽�� {
	//�����ݹ飺��������ʽѭ��������Ҫѭ��������ִ��
	//���壺һ���������ڵ���������
	//�����ѧ��:f(0)=1,f(1)=4,f(n + 2)=2*f(n+1)+f(n)
	
	public static int fn(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n==1)
		{
			return 4;
		}
		else
		{
			//return fn(n+2)-2*fn(n+1);
			//�ݹ�����Ҫ����֪������ȥ���ͣ����ֵ�Ǹ��󣬵��������ֵ��С���ݼ�
			return 2*fn(n-1)+fn(n-2);
		}
	}
	//�ݹ�ķ���������������һ���ĵ��е������ļ�
	
	public static void main(String[] args)
	{
		System.out.println(fn(10));
		
	}
}

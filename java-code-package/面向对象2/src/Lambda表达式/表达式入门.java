package Lambda���ʽ;
/**
 * 
 * @author ����
 *
 * Lambda���ʽ����ʹ�ø��Ӽ��Ĵ���������ֻ��һ�����󷽷��Ľӿ�
 * 
 * 	����Ҫ֮����д�����֡�����ֵ����(void��) ֻ����Ҫ�����β��б�������
 * 	���磺
 * 		(�β��б�)->{������}
 * 	���У��β��б�����ʡ���β����ͣ����ֻ��һ������������ʡ��Բ���ţ�
 * 		�����ֻ��һ�����ʱ�������Ŷ�����ʡ��
 * 	�򻯳��󷽷�
 */
interface Eatable
{
	void taste();
}
interface Flyable
{
	void fly(String weather);//������󷽷���ʡ�Է�����
}
interface Addable
{
	int add(int a, int b);
}
public class ���ʽ���� {
	//������Ҫ�Ķ���,���β��б�ֱ������
	public void eat(Eatable e)
	{
		System.out.println(e);
		e.taste();
	}
	public void drive(Flyable f)
	{
		System.out.println("���ڿ�����"+f);
		f.fly("��һ������Ĵ��ա�");
	}
	public void test(Addable add)
	{
		System.out.println("��ͣ�5+3="+add.add(5, 3));//��Ҫ��д�ķ���
	}
	public static void main(String[] args)
	{
		���ʽ���� lq = new ���ʽ����();
		//����ʡ�ԵĻ����š�û���ββ���ʡ��Բ����
		lq.eat(()-> System.out.println("ƻ����ζ������"));
		//lambdaֻ��һ���βο���ʡ�����ţ�
		lq.drive(weather ->{
			System.out.println("���������ǣ�"+weather);
			System.out.println("ֱ��������ƽ��");
		});
		//ֻ��һ����䣬������Ҫ����ֵ��Ҳ����ʡ��return
		lq.test((a,b)->a + b);
	}
}

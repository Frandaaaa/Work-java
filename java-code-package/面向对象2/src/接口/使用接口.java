package �ӿ�;
/**
 * @author ����
 *
 * 	�ӿڵ����ã�
 * 	����������������ڽ���ǿ������ת��
 * 	���ýӿ��ж���ĳ���
 * 	��������ʵ��
 * 
 * 	һ�������ʵ��һ�����߶���ӿڣ��̳�extends��ʵ��implements
 *	 ��ʵ�ֽӿڣ�
 * [���η�] class ���� extends ���� implements �ӿ�1,�ӿ�2...
 * {
 * 	���岿��
 * }
 * 
 * һ����ʵ�ֽӿڱ�����ȫʵ����Щ�ӿ������������ȫ�����󷽷���������ཫ�����Ӹ��ӿڼ̳е��ĳ��󷽷���Ҳ���붨���Ϊ�����ࡣ
 * ʵ��һ���ӿ��൱�ڼ̳���һ����ȫ�������
 */
interface Product 
{
	int getProduceTime();//����һ���������а�����һ����ͨ������ֻ�Ǳ�ϵͳ�ĳɳ��󷽷�
}
//ʵ�ֽӿ�,ģ���̳�
public class ʹ�ýӿ�  implements �ӿڵĸ���,Product{
	private String[] printData = new String[MAX_CACHE_LINE];//�Ӹ��ӿڵõ��Ĳ���
	//��¼��ҵ��
	private int dataNum = 0;
	public void out()
	{
		//�оʹ�ӡ
		while(dataNum > 0)
		{
			System.out.println("��ӡ����ӡ��"+printData[0]);//��ӡ��ڴ�����Ĳ���ֵ
			//��ҵ����������ǰǰ��һλ������ʣ�µ���ҵ����һ								��ӡ����
			//�������������System.arraycopy(Object src, num, Object src, num, num)
			//							����			��ʼ����	Ŀ������	Ŀ�����鿪ʼ��ʼλ��
			System.arraycopy(printData, 1, printData, 0, --dataNum);//ʹ�õ��Ƶķ���
			
		}
	}
	public void getData(String msg)
	{
		if(dataNum >= MAX_CACHE_LINE)
		{
			System.out.println("��������Ѿ����ˣ����ʧ��");//����Ĳ���ֵ�����ܳ������ĳ���
		}
		else
		{
			//Ҫ��Ӧ��������ӵ����У��Ѿ����������+1
			printData[dataNum++] = msg;//���������Ԫ��
		}//			    Ŀǰ�����鳤�ȼ�һ
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		//�����������
		�ӿڵĸ��� o = new ʹ�ýӿ�();
		o.getData("����");
		o.getData("�ְ�");
		o.out();
		o.getData("cuiqin");
		o.getData("father");
		o.out();
		//����Ĭ�Ϸ���
		o.print("���ذְ�","���ص���","���ظ��");
		o.test();
		//����һ���µ��൱���ӿ�ʹ��
		Product p = new ʹ�ýӿ�();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ���������ֱ�Ӹ���Object���͵ı���
		Object obj = p;
		//��д��ڷ���������public���Σ���Ϊ��ӿ�����ķ�������public����д����ֻ�ܸ����Ȩ�޻����
		//���������ֵ���ǰ�������ֱ�Ӹ�ֵ��p�������
	}
}

package Map����;

/**
 * @author ����
 * 
 * ���ֵ����⣺������Ҳ�޷�׼ȷ���ʵ�Map�еı��޸Ĺ���Key
 */
import java.util.*;

public class ���key�ǿɱ��� {
	public static void main(String[] args)
	{
		HashMap ht = new HashMap();
		
		ht.put(new A(60000), "cuiqin1");
		ht.put(new A(87563), "cuiqin2");
		
		//���Hashtable ��key set ��϶�Ӧ��Iterator������
		Iterator it = ht.keySet().iterator();
		//�޸�countֵ
		A first = (A)it.next();
		first.count = 87563;
		
		System.out.println(ht);
		
		//����ֻ��ɾ��û�б��޸Ĺ���key����Ӧ��key-value
		ht.remove(new A(87563));
		System.out.println(ht);
		
		//�޷���ȡ����Ϊ��ʱkey���ܾ�ȷ���ʵ� 		    	
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(60000)));
		
		//һ�仰����Ҫʹ�ÿɱ��keyֵ
	}
}

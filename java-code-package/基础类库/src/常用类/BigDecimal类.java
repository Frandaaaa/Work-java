package ������;

import java.math.*;

/*
 *	float and double ��������ɾ��ȶ�ʧ	�������ڽ�����ѧ����ʱ��
 *	 ����� ��BigDecimal�� 
 *
 *	���Ƽ�ʹ��double �����ֵ����BigDecimal������Ϊ����ȷ�������������double����float���ͣ����ԡ���
 *		�Ƽ�ʹ�û���String�Ĺ�����	new BigDecimal("0.1")
 *
 *	����ʹ��double��������Ϊ������ʱ���أ�Ӧ��ͨ��BigDecimal.valueOf(double value)�ľ�̬����������BigDecimal ����
 */

public class BigDecimal�� {

 // 	�����ǹ��ڶԾ�ȷ���������г����������㣺
		public static void main(String[] args)
		{
			BigDecimal f1 = new BigDecimal("0.05");
			BigDecimal f2 = BigDecimal.valueOf(0.01);
			BigDecimal f3 = new BigDecimal(0.05);
			//String
			System.out.println("ʹ��String��Ϊ������");
			System.out.println("0.05 + 0.01 = " + f1.add(f2));
			System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
			System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
			System.out.println("0.05 / 0.01 = " + f1.divide(f2));
			System.out.println("---------------------------------");
		/*
		 * 	+		add
		 *  -		subtract
		 *  *		multiply
		 *  /		divide
		 */
			System.out.println("ʹ��double��Ϊ������");
			System.out.println("0.05 + 0.01 = " + f3.add(f2));
			System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
			System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
			System.out.println("0.05 / 0.01 = " + f3.divide(f2));
			
		}
 
}

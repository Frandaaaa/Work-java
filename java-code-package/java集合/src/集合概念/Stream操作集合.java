package ���ϸ���;
/**
 * @see		�������.Lambda���ʽ.�������ú͹���������
 */

/*													   int		 double		  long
 * 	��ʽAPI��������֧�ִ��кͲ��оѻ�������Ԫ�ء�including:	Stream IntStream DoubleStream LongStream
 * 	what we can see is that the Stream is the common �� interface.
 * 
 * 	contacted Builder	 the programmer can use the Builder including Stream.Builder, IntStream.Builder, LongStream.Builder, 
 * 		DoubleStream.Builder to create ��Ӧ����
 * 
 * 	the way to use it:
 * 		use Stream or XxxStream's builder() class-method to create Builder
 * 		repeat using add() of Builder to add items for ��
 * 		use build() of Builder to get the Stream
 * 		use the �ۼ����� of Stream 
 * 
 * attention !: for most �ۼ����� every method can only use once
 */ 

import java.util.stream.IntStream;

public class Stream�������� {
	public static void main(String[] args)
	{
		IntStream is = IntStream.builder()
			.add(20)
			.add(13)
			.add(-2)
			.add(18)
			.build();
		
		//���þ۽��ķ�������ÿ��ֻ��ִ��һ��
//		System.out.println("all items of is have the biggest one is that: " + is.max().getAsInt());
//		System.out.println("all items of is have the smalles one is that: " + is.min().getAsInt());
//		System.out.println("the sum of all items of is : " + is.sum());
//		System.out.println("the count of all items of is : " + is.count());
//		System.out.println("the average of all items of is : " + is.average().getAsDouble());
		
		//add method to print out
//		System.out.println("is����Ԫ�ص�ƽ���Ƿ񶼴���20��" + is.allMatch(ele -> ele * ele > 20));
//		System.out.println("is�Ƿ�����κ�Ԫ�ش���20��" + is.anyMatch(ele -> ele * ele > 20));
		
		//����һ���µ�ӳ��Ŷ������ʹ�ö�Ӧ��ϵ������һ���µ�stream �ͺ����ǲ����е����� û���ֱһģһ��
		IntStream newIs = is.map(ele -> ele * 2 + 1);
		//ʹ�÷������õķ�ʽ����������Ԫ��
		newIs.forEach(System.out::println);//��������෽��
	}
	
/**
 * 	�����淽���Ľ��Ͱɣ�
 * 	����һЩ���õķ������������Ҫ�Լ��鿴API
 * 		����ʵ�ֹ��̣� ����IntStream - ��ε���IntStream�ľۼ�����ִ�в���
 * 		�ۼ��������
 * 			�м䷽�������������ִ򿪣� ����ֱ�ӵ��ú����������м䷽�����ص�ֵ����һ��ֵ
 * 			ĩ�˷��������������ղ���������ĳ��Streamִ��ĩ�˷��������ᱻ���ģ��������ã����ֻ��ʹ��һ��Ŷ
 * 			��״̬�ķ�������������һЩ�µ����ԣ�Ψһ�԰���Ԫ�ص��������������֤Ԫ��������ķ�ʽ�´���ȵ�Ѿ�������״̬�ķ���������ҪһЩ��������ܿ���
 * 			��·������������������Ĳ��������ؼ�����е�Ԫ��
 * 
 * 		�м䷽����
 * 			filter(Predicate predicate) �������в�����predicateԪ��
 * 			mapToXxx(ToXxxFunction mapper)����ִ��һ��һ��ת�������ص������а�����ToXxxFunctionת�����ɵ�����Ԫ��
 * 			peek(Consumer action):���ζ�ÿ��Ԫ��ִ��һЩ����Ŷ�����ص�����ԭ�е���������ͬ��Ԫ�أ���Ҫ���ڲ���
 * 			distinct():�����������������ظ���Ԫ��(�ж��ظ��ı�׼��ʹ��equals()�ȽϷ���true),������״̬�ķ���
 * 			sorted()	���ڱ�֤���е�Ԫ���ں����ķ����д�������״̬������һ����״̬�ķ���
 * 			limit(long maxSize)��֤�Ը����ĺ������������������ʵ�Ԫ�صĸ���������һ����״̬�ġ���·�ķ���
 * 		ĩ�˷�����
 * 			for(Consumer action)			�������е�����Ԫ�أ���ÿ��Ԫ�ض�ִ��action
 * 			toArray()						ת����Ϊ����
 * 			reduce()						�ϲ����е�Ԫ��
 * 			min()							�������Сֵ
 * 			max()
 * 			count()							����Ԫ�ص�����
 * 			anyMatch(Predicate predicate)	�ж��Ƿ����ٰ���һ��Ԫ�ط���predicate����						
 * 			allMatch(Predicate predicate)	�ж������Ƿ�ÿ��Ԫ�ض�����predicate����
 * 			noneMatch(Predicate predicate)	�ж������Ƿ�����Ԫ�ض�������predicate����
 * 			findFirst()						�������еĵ�һ��Ԫ��
 * 			findAny()						�������е�����һ��Ԫ��
 */
	
}

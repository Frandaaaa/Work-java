package ������;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @see		�̣߳���
 * @author ����
 *
 */

/*
 * 	Random������α���������������һ�������Ե�ǰʱ��Ϊ���ӣ�һ����������Ҫ��ʾ��ֵ long����
 * 		ThreadLocalRandom����������ʹ���������������Ծ��и��õ��̰߳�ȫ��
 * 	�����������	�������� ������ָ�����ɷ�Χ
 * 
 */

public class ThreadLocalRandom��Random {
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.println("rand.nextBoolean(): " + rand.nextBoolean());
		byte[] buffer = new byte[16];//����һ���ֽ�������
		rand.nextBytes(buffer);
		System.out.println("Arrays.toString(buffer): " + Arrays.toString(buffer));
		//����α����� double 0.0~1.0
		System.out.println("rand.nextdouble(): " + rand.nextDouble());
		//��ô����float����
		System.out.println("rand.nextFloat(): " + rand.nextFloat());
		//α��˹��: average=0.0 s = 1.0
		System.out.println("rand.newxtGaussian(): " + rand.nextGaussian());
		//���ɴ���int����ȡֵ��Χ��α�������
		System.out.println("rand.nextInt(): "+ rand.nextInt());
		//ָ����Χ��
		System.out.println("rand.nextInt(26): " + rand.nextInt(26));
		//����һ������long��
		System.out.println("rand.nextLong(): " + rand.nextLong());
		System.out.println("------------------------------------");
		
		//֤��α�������ֻҪ������ͬ������ִ��˳����ͬ���������������һëһ��
		Random r1 = new Random(50);
		System.out.println("rand.nextdouble(): " + r1.nextDouble());
		System.out.println("rand.nextFloat(): " + r1.nextFloat());
		System.out.println("rand.nextInt(): "+ r1.nextInt());
		System.out.println("rand.nextLong(): " + r1.nextLong());
		System.out.println("------------------------------------");
		
		//֤��α�������ֻҪ������ͬ������ִ��˳����ͬ���������������һëһ��
		Random r2 = new Random(50);
		System.out.println("rand.nextdouble(): " + r2.nextDouble());
		System.out.println("rand.nextFloat(): " + r2.nextFloat());
		System.out.println("rand.nextInt(): "+ r2.nextInt());
		System.out.println("rand.nextLong(): " + r2.nextLong());
		System.out.println("------------------------------------");

		//֤��α�������ֻҪ������ͬ������ִ��˳����ͬ���������������һëһ��
		Random r3 = new Random(100);//���ң����Ӳ��䣬�����Ҳ����
		System.out.println("rand.nextdouble(): " + r3.nextDouble());
		System.out.println("rand.nextFloat(): " + r3.nextFloat());
		System.out.println("rand.nextInt(): "+ r3.nextInt());
		System.out.println("rand.nextLong(): " + r3.nextLong());
		
		//Ϊ�˱�����������أ��Ƽ�ʹ�õ�ǰ��ʱ����Ϊ���ӣ���ǰʱ�䲻�ϸı�
		Random rand2 = new Random(System.currentTimeMillis());
		
		//���߳�����ʹ��ThreadLocalRandom������Random��������
		ThreadLocalRandom rand3 = ThreadLocalRandom.current();
		
		int val1 = rand3.nextInt(4, 20);
		double val2 =  rand3.nextDouble(2.0, 10.0);
		System.out.println(
				"--------------------------------------"+
				"\n" +
				val1 + 
				"\n" + 
				val2);
	}
}

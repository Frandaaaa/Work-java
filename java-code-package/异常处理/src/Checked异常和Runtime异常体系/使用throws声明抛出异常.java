package Checked�쳣��Runtime�쳣��ϵ;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * try-catch-finallyĩβ��Ҫexception�׳�δ�ἰ�쳣
 * 
 */
public class ʹ��throws�����׳��쳣 {
	public static void main(String[] args) {
		try {
			System.out.println("�������һ������: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println("==========================="+"\n"+"������ڶ�������");
			Scanner sc2 = new Scanner(System.in);
			int b = sc2.nextInt();
			test(a,b);
		} catch (ArithmeticException e) {
			System.out.println("��ĸ����Ϊ��");
		} catch (InputMismatchException e) {
			System.out.println("����������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ϵͳ�쳣");
			e.printStackTrace();
		}
		System.out.println("=================================");
//		test2();
		try {
			test3();
		} catch (�Զ����쳣���Ͳ��� e) {
			e.printStackTrace();
		}
	}
	public static void test(int a, int b) throws Exception{//�˴��׳����쳣������������������catch��
		int mod;
		mod = a / b;
		System.out.println(mod);
	}
	public static void test2() {
		try {
			System.out.println("��ӭ���٣����������䣺 ");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if(age<18 || age>80) {
				throw new Exception("����Ҫ������ͬ������ס");
			} else {
				System.out.println("��ӭ��ס");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * �ĵ�����ע�ͣ��ڵ��õ�ʱ����Ի��ע�ͽ���
	 * @throws �Զ����쳣���Ͳ���
	 */
	public static void test3() throws �Զ����쳣���Ͳ���{//exceptionֻ�����׳��������ͬ�� �������׳����࣬�����޷�������Χ����ĸ���
		System.out.println("��ӭ���٣����������䣺 ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18 || age>80) {
			throw new �Զ����쳣���Ͳ���();
		} else {
			System.out.println("��ӭ��ס");
		}
	}
}

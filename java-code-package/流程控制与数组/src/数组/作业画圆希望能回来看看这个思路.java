package ����;

import java.lang.Math;
import java.util.Scanner;
public class ��ҵ��Բϣ���ܻ����������˼·
{
	
	public static void main(String[] args)
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.print("������Բ�İ뾶��");
		r=sc.nextInt();
		for(int i=0;i<=r;i=i+2){//�ϰ�Բ
			int height=r-i;

			int width=(int)Math.round(Math.sqrt(r*r-height*height));

			for(int j=r-width;j>=0;j--){//����
				System.out.print(" ");
			}
			System.out.print("*");


			for(int j=r-width;j<r+width;j++){//����
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=r;i>=0;i=i-2){//�°�Բ
			int height=r-i;
			int width=(int)Math.round(Math.sqrt(r*r-height*height));
			for(int j=r-width;j>=0;j--){//���°�Բ
				System.out.print(" ");
			}
			System.out.print("*");


			for(int j=r+width;j>r-width;j--){//���°�Բ
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
package ��;

import java.io.*;

public class ����������������� {
	//�����Ĺ��̾���һ���ȶ���д�Ĺ��̣��м��д洢���ݵĹ���
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\3.jpg");
			FileOutputStream fo = new FileOutputStream("e:\\test\\3-copy.jpg");
			byte[] b = new byte[1024];
			int n;
			while((n=fs.read(b))!=-1) {
				//fo.write(b);//���ڶ����������̫�󣬳������ļ��Ĵ�С���ͻᵼ�¿������ļ�����Դ�ļ�
				fo.write(b,0,n);//��ȡ��ʵ�ʵ�
				System.out.println("����д��");
			}
			fs.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package ��;

import java.io.*;

public class �ֽ��ַ�ת���� {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\io\\test.txt");
			InputStreamReader isr = new InputStreamReader(fs,"GBK");//����һ��Ҫһ��
			FileOutputStream fo = new FileOutputStream("e:\\test\\io\\test3.txt",true);//�������һֱд
			OutputStreamWriter osw = new OutputStreamWriter(fo,"GBK");//����һ��Ҫһ��
			
			char[] c = new char[10];
			int n;
			//��һ��
//			while((n=isr.read())!=-1) {
//				System.out.print((char)n);
//			}
			//�ڶ���
//			while((n=isr.read(c))!=-1) {
//				//String s = new String(c);//�ᷢ�����δ����������ػᵼ�¶����ת�ɲ���Ҫ���ַ���
//				String s = new String(c,0,n);
//				System.out.print(s);
//			}
			
			while((n=isr.read(c))!=-1) {
				osw.write(c,0,n);
				osw.flush();//��closeҲ���Բ�д
			}
			fs.close();
			fo.close();
			isr.close();
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e)  {
			e.printStackTrace();
		}
		
	}
}

package ��;

import java.io.*;

public class ������������� {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\w.zip");
			FileOutputStream fo = new FileOutputStream("e:\\test\\w-copy.zip");
			BufferedInputStream bs = new BufferedInputStream(fs);//��Ϊ��������
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			long begainTime = System.currentTimeMillis();
			
//			bo.write('a');//��Ϊ��������Ҫ�ﵽһ�����ڴ���Զ�����д�Ĳ���
//			bo.write(49);
//			bo.flush();//ǿ����ջ���
//			System.out.println((char)fs.read());
//			System.out.println(fs.read());
			
			//���û������������ٶȸ���
			int n;
			byte[] b = new byte[1024];
			while((n=fs.read(b))!=-1) {
				fo.write(b,0,n);
				System.out.println("����д��");
			}
			System.out.println("��ϣ�");
			long endTime = System.currentTimeMillis();
			
			System.out.println(endTime-begainTime);
			fs.close();
			fo.close();
			bs.close();//1319
			bo.close();//2066
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

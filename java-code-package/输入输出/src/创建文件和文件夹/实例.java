package �����ļ����ļ���;

import java.io.File;
import java.io.IOException;

public class ʵ�� {
	public static void main(String[] args) {
		//��������
		//��һ��
		//File file1 = new File("e:\\test","��������.txt");
		//�ڶ���
		//File file = new File("e:\\test.txt");
		//File file1 = new File(file,"��������");
		//������
		File file1 = new File("e:\\test\\��������.txt");//�ļ�
		
		File file2 = new File("e:\\test\\io");//�ļ���
		
		//�ж϶���:��Ҫ�����ļ������ж�
		System.out.println(file1.isFile());
		System.out.println(file2.isDirectory());
		
		//����Ŀ¼
		//�ʹ����ļ�һ�������Բ���ַ���
		File file3 = new File("e:\\test\\io\\dic");
		if(!file3.exists()) {
			file3.mkdir();
			System.out.println("�����ɹ�");
		} else {
			System.out.println("�ļ��Ѵ���");
		}
		//�༶Ŀ¼
		File file4 = new File("e:\\test\\io\\dic1\\dic1.1");
		if(!file4.exists()) {
			file4.mkdirs();
			System.out.println("�����ɹ�");
		} else {
			System.out.println("�ļ��Ѵ���");
		}
		
		//�����ļ�����ʵ�������ļ���Ŀ¼����Ҫ�ж�
		File file5 = new File("e:\\test\\io\\test");
		if(!file5.exists()) {
			try {
				//��������չ���ļ�
				file5.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
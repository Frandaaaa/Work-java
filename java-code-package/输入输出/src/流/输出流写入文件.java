package ��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class �����д���ļ� {
	//д������ݲ���һ�����룬һ������д�����������
	public static void main(String[] args) {
		FileInputStream fs;//һ����try������������
		FileOutputStream fo;
		try {
			fs = new FileInputStream("e:\\test\\io\\test.txt");
			fo = new FileOutputStream("e:\\test\\io\\test.txt",true);
			fo.write('a');//�����ַ�
			fo.write(100);//����һ���������������֣����Ǹ������ASII��д���ַ�
			System.out.println(fs.read());
			System.out.println((char)(fs.read()));
			fs.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package ϵͳ���;

/**
 * 	@see	��θı�ϵͳ�ı�׼���������ķ���
 */

import java.io.*;
import java.util.*;

public class System�� {
	public static void main(String[] args) throws Exception
	{
		
		//��������
		Map<String, String> env = System.getenv();
		for (String name: env.keySet())
		{
			System.out.println(name + "-->" + env.get(name));
		}
		//��ȡָ������������ֵ
		System.out.println(System.getenv("Java_HOME"));
		//ϵͳ����
		Properties props = System.getProperties();
		//����ļ�
		props.store(new FileOutputStream("props.txt"), "System Properties");//�����ɵ��ı������Ϊ.txt�ļ���
		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
		
//		Object a = "����";		Object������store��������
//		((Properties) a).store(new FileOutputStream("����.txt"),"����ע�ͽ���");
	}
}

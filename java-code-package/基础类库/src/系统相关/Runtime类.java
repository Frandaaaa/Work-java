package ϵͳ���;

import java.io.IOException;
/*
 * 	��System�����Ƶ���:�ṩ��gc()������renFinalization()������	�ֱ�֪ͨϵͳ�������������ա�����ϵͳ��Դ
 * 		���ṩ��	load(String filename) loadLibrary(String libname)�����ļ��Ͷ�̬���ӿ�
 */
import java.lang.*;

public class Runtime�� {
	public static void main(String[] args) throws Exception
	{
		//���Ի�ȡJava������������ж���
		Runtime rt = Runtime.getRuntime();
		System.out.println("����������" + rt.availableProcessors());
		System.out.println("�����ڴ棺" + rt.freeMemory());
		System.out.println("���ڴ�����" + rt.totalMemory());
		System.out.println("��������ڴ�����" + rt.maxMemory());
		
		
		//��֪��Ϊɶ��û��Runtime��������ô������һ��һëһ�������ֵĶ��󣡣�sb
		
		//����ֱ�ӵ�������һ�����������в���ϵͳ������
		
		Runtime rt2 = Runtime.getRuntime();
		rt2.exec("notepad.exe");
	}
}
package ���ͷ���;

import java.util.*;

public class ���巺�ͷ���2 {
	//����һ�����ͷ����������д�һ��T�β�
	/*
	static <T> void test(Collection<T> from, Collection<T> to) {
		for (T ele: from) {
			to.add(ele);
		}
	} 
	public static void main(String[] args) {
		List<Object> as = new ArrayList<>();
		List<String> ao = new ArrayList<>();
		//test(as,ao);//ϵͳ�޷���ȷ���������βε�����
	}
	*/
	static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for (T ele: from) {
			to.add(ele);
		}
	} 
	public static void main(String[] args) {
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		test(as,ao);//ֻҪǰ��ӵ�и������ϵ���ɳɹ�
	}
	
}

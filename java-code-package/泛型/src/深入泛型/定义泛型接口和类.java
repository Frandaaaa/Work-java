package ���뷺��;

import java.util.*;
/*
 * 	List<String> ���ᱻ�����ΪListString
 * 
 * 	�����������������Ϳ����ڶ�������С���������ʱ����һ������ʵ�Σ��Ӷ����Զ�̬���������������߼����������
 * 
 * 	����Ϊ�κ��ࡢ�ӿ����ӷ���������
 */

public class ���巺�ͽӿں���<T>//ʹ�÷�ʽ���� 
{
	//define 
	private T info;
	
	//��������Ҫ�ӷ�ʽ����
	
	public ���巺�ͽӿں���() {}
	
	//use the type of T to define
	public ���巺�ͽӿں���(T info)
	{
		this.info = info;
	}
	public void setInfo(T info)
	{
		this.info = info;
	}
	public T getInfo()
	{
		return this.info;
	}
	
	public static void main(String[] args)
	{
		//both XX<String> and XX<Double> are the children of XX<T> 
		
		//�����ַ������ͣ�����������ֻ�����ַ�������
		���巺�ͽӿں���<String> a1 = new ���巺�ͽӿں���<>("cuiqin1");
		
		System.out.println(a1.getInfo());
		
		//����T�βε���Double ����������ֻ����Double ���� double
		���巺�ͽӿں���<Double> a2 = new ���巺�ͽӿں���<>(83.8);
		
		System.out.println(a2.getInfo());
	}
}

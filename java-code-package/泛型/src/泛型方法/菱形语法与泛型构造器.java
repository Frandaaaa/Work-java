package ���ͷ���;

class Foo {
	public <T> Foo(T t) {
		System.out.println(t);
	}
}
class Myclass<E> {
	public <T> Myclass(T t) {
		System.out.println("t�Ĳ����ǣ�"+ t);
	}
}
public class �����﷨�뷺�͹����� {
	//��������ȷ��ͷ����ڷ���ǩ�������������β�һ����JAVA�����ڹ�����ǩ�������������βΣ���������ν�ķ��͹�����
	//������������������Java�������ݲ������������ƶ������βε����ͣ����ǿ�����ʵ��Ϊ�������е������β�ָ��ʵ�ʵ�����
	public static void main(String[] args) {
		//���͹������е�T����ΪString
		new Foo("���ذְ�");
		new Foo(666);
		//��ʾָ�����͹������е�T�Ĳ���ΪString��md��ȷ
		new <String> Foo("���ظ��");
		//��ʾָ�����͹������е�T����ΪString������ʵ�ʴ�����������double�����Բ���
		//new <String> Foo(12.3);
		
		//Myclass�������е�E�β���String���
		//���͹�������������T�β�ʱInteger����
		Myclass<String> mc1 = new Myclass<>(5);
		//��ʾָ�����͹�������������T�β���Integer����
		Myclass<String> mc2 = new <Integer> Myclass<String>(5);
		//Myclass��������E�β���String����
		//�����ʾָ�����͹������е�������T�β���Integer���ͣ��Ͳ���ʹ�������﷨
		//��ʱ�Ͳ���ʹ�������﷨
		//Myclass<String> mc3 = new <Integer> Myclass<>();//���ƶ��˷��͹������е������β���Integer���ͣ�����ʹ�������﷨�����Ա���
	}
}

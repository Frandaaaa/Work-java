package ���غͷ�װ;

public class �Է��ʿ��Ʒ������� {
	public static void main(String[] args)
	{
		//����
		���ʿ��Ʒ� p = new ���ʿ��Ʒ�();
		//���Է������صĳ�Ա����,����
		//p.age = 1000;
		//������age���������������÷����ˣ������ʹ�������Ҳ��������
		p.setAge(155);//�Է����������أ�������
		//System.out.println(p.name);ʼ�շ��ʲ���
		System.out.println("δ�����ñ���ʱ:"+p.getAge());//ʼ��û�����ú�age������0
		p.setAge(23);
		System.out.println("������ȷ�ķ������Է��ʵ�:"+p.getAge());
		//˵���˲���ֱ�Ӳ�������������ر�����ֻ�ܲ���setter��getter����
		p.setName("����");
		System.out.print("�ɹ�������ȷ����setter���úñ����Ժ�:"+p.getName());
	}
	/**
	 * ����ֱ���޸����صı���
	 */
}

package Lambda���ʽ;

import javax.swing.JFrame;

@FunctionalInterface
interface Converter
{
	Integer convert(String from);//�ǽ�formת����Ϊinteger����
}

interface MyTest
{
	String test(String a, int b, int c);
}

interface YourTest
{
	JFrame win(String title);
}

public class �������ú͹��������õ���� {
	public static void main(String[] args)
	{
	//�����෽��
		Converter converter1 = from -> Integer.valueOf(from);//�ɹ�ת��from����
		Integer val = converter1.convert("23");
		System.out.println(val);
		//����ı��ʽֻ��һ������ʱ�򣬿����滻���£�
		//�������ô���Lambda���ʽ�������෽��
		//����ʽ�ӿ��б�ʵ�ֵķ�����ȫ�����������෽����Ϊ����
		Converter converter11 = Integer::valueOf;//
		//����Integer���valueOf()�෽����ʵ��Converter�����ǾͿ�Ψһ�ĳ��󷽷�������Converter�ӿ��е�Ψһ�ĳ��󷽷��ǣ����ò�������
		//����Integer���valueOf����
		Integer val2 = converter1.convert("232");
		System.out.println(val2);
	//�����ض������ʵ������
		//���ַ���ת����Ϊ����������"fikit.org"����ض������ʵ������indexOf
		Converter converter2 = from -> "fikit.org".indexOf(from);
		Integer value = converter2.convert("it");//��װ��Ϊ����ֵ����
		System.out.println(value);
		//��Ч�滻
		Converter converter22 = "fikit.org"::indexOf;
	//����ĳ���ʵ������
		//����һ��MyTest�Ķ���
		MyTest mt = (a,b,c) ->a.substring(b,c);//�и��ַ����������ڶ������ھŸ��ַ�
		String str = mt.test("Java I love you!", 2, 9);
		System.out.println(str);
		//��Ч���:�ӿ��б�ʵ�ַ����ĵ�һ��������Ϊ������
		//����Ĳ���ȫ�������÷�����Ϊ����
		MyTest mt2 = String::substring;
		String str2 = mt.test("Java I love you!", 3, 9);
		System.out.println(str2);
	//���ù�����
		YourTest yt = (String a) -> new JFrame(a);
		JFrame jf = yt.win("�ҵĴ���");
		System.out.println(jf);
		//��Ч���
		YourTest yt2 = JFrame::new;
		JFrame jf2 = yt2.win("java i love you");
		System.out.println(jf2);
	}
	
	
}

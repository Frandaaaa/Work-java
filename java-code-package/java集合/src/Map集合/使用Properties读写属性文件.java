package Map����;
import java.io.*;
import java.util.*;
/**
 * @author ����
 *	û��������Ǻ��Ǹ������ļ��й�
 *	�����ļ�������������ƣ�����ֵֻ�����ַ������ͣ�����key/value�����ַ�������
 *
 *	�൱��һ��key/value����String���͵�Map
 *
 *	��������
 *		String getProperty(String key): ��ȡProperties��ָ����������Ӧ������ֵ��������Map �� get(Object key)����
 *		String getProperty(String key, String defaultValue) ��������ֵ��������Hashtable��put()����	
 *		Object setProperty(String key, String values)	��������ֵ ������Hashtable��put()����
 *		void load(InputStream inStream)	�������ļ�(������) �м��� key-value �ԣ� �Ѽ��ص���key-value��׷�ӵ�Properties����
 *		void store(OutputStream out, String comments) ��Properties �е�key-value �������ָ���������ļ���
 */

public class ʹ��Properties��д�����ļ� {
	public static void main(String[] args) throws Exception
	{
		Properties props = new Properties();
		//�������
		props.setProperty("username", "Frandaaaa");
		props.setProperty("password", "cuiqin");
		
		//�����ԵĶ�Ӧ��ӵ�ϵͳ�����ļ���
		props.store(new FileOutputStream("users.ini"), "comment line");
		
		//create a new properties target
		Properties props2 = new Properties();
		
		//add properties to this new target
		props2.setProperty("gender", "male");
		
		//add the key-value of users.ini file to the props2
		props2.load(new FileInputStream("users.ini"));
		System.out.println(props2);
	}
}

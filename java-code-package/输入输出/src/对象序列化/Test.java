package �������л�;
import java.io.*;
public class Test {
	public static void main(String[] args) {
		Count count1 = new Count("ambitiousCC",18,"��");//��������
		try {
			FileInputStream fs = new FileInputStream("e:\\test\\io\\Counts.txt");
			FileOutputStream fo = new FileOutputStream("e:\\test\\io\\Counts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fo);//�������л���д���ļ�
			ObjectInputStream ois = new ObjectInputStream(fs);//�����л�����
			oos.writeObject(count1);
			oos.flush();
			
			try {
				Count counts = (Count)ois.readObject();
				System.out.println(counts);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


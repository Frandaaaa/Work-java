import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ���ļ��������ȡ�ַ��� {
	//����list����
    List<String> list = new ArrayList<String>();
    

    public void run() {
    	���ļ��������ȡ�ַ��� content = new ���ļ��������ȡ�ַ���();
        content.initList("HangmanLexicon.txt");
        String a = content.getString();
        String txt = a.replaceAll("[^a-zA-Z]", "");//ȥ������tab���Ϳո�ͻس���
        System.out.println(txt);
        System.out.print(txt.length());
    }
    
    //��������������
    public int getRandomNumber(int total) {
        return (int) (Math.random() * total);
    }
    
    //���ж�ȡ�ļ�����
    public void initList(String fileName) {
    	//�쳣����
        try 
        {														//ֻ��
            RandomAccessFile accessFile = new RandomAccessFile(fileName, "r");
            String str = "";
            while (null != (str = accessFile.readLine()))
            {
            	
                list.add(str);
            }
            accessFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //��������ַ���
    public String getString() {
        if (null != list)
        {
            int line = getRandomNumber(list.size());
            return list.get(line);
        }
        
        return null;
    }
}
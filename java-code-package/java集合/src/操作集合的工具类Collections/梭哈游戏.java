package �������ϵĹ�����Collections;

import java.util.*;

//���������Ϸ��

public class �����Ϸ {
	
	//����ȫ�ֱ���
	//֧�����֧�ֶ��ٸ����
	private final int PLAY_NUM = 5;
	//�����˿��Ƶ����л�ɫ����ֵ
	private String[] types = {"����", "�ݻ�", "����", "����"};
	private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10"
			, "J", "Q", "K", "A"};
	//һ����Ϸ�Ժ��ʣ��
	private List<String> cards = new LinkedList<String>();					//list����
	//�����������
	private String[] players = new String[PLAY_NUM];
	//����������ϵ��˿���
	private List<String>[] playersCards = new List[PLAY_NUM];				//list����
	
	/**
	 *  	��ʼ���˿��ƣ�����52���˿���
	 *  	ʹ��shuffle�����������˳������
	 */
	public void initCards()
	{
		for(int i = 0; i < types.length; i++)
		{
			for(int j = 0; j < values.length; j++)
			{
				cards.add(types[i] + values[j]);							//list����
			}
		}
		//�������
		Collections.shuffle(cards);											//collections����
	}
	
	//��ʼ��ң�Ϊÿ����ҷ����û���
	public void initPlayer(String... names)
	{
		if(names.length > PLAY_NUM || names.length < 2)
		{
			//��������������˴�ʹ���쳣����
			System.out.println("�����������");
			return ;
		}
		else
		{
			//��ʼ������û���
			for(int i = 0; i < names.length ; i++)
			{
				players[i] = names[i];
			}
		}
	}
	/**
	 * 	��ʼ��������ϵ��˿��ƣ���ʼ��Ϸʱÿ��������ϵ��˿���Ϊ��
	 * 	����ʹ��һ������Ϊ0��LinkedList����ʾ
	 */
	public void initPlayerCards()
	{
		for(int i = 0; i < players.length; i++)
		{
			if(players[i] != null && !players[i].equals(""))
			{
				playersCards[i] = new LinkedList<String>();
			}
		}
	}
	/**
	 * 	���ȫ���˿��ƣ��÷���û��ʵ�����ã�������������
	 */
	public void showAllCards()
	{
		for(String card : cards)
		{
			System.out.println(card);
		}
	}
	/**
	 * 	���˿���
	 * 	@param first �����ɸ�˭
	 */
	//��ȡָ���ַ����������е�����ֵ
	public static int getIndex(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;//���δ�ҵ�����-1
    }
	public void deliverCard(String first)
	{
		//����ArrayUtils �������search����
		//��ѯ��ָ��Ԫ���������е�����
		int firstPos = getIndex(players, first);
		//�ȸ����֮����˷���(ʵ������ģ����һ��ϴ�ƵĹ���)
		for(int i = firstPos; i < PLAY_NUM; i++)
		{
			if(players[i] != null)
			{
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			//�����˼·�����ӵ�һ���ƣ�Ȼ��ȥ������һ�ű�ɵ�һ����
			}
		}
		//���θ�λ�ڸ�ָ�����֮ǰ��ÿ����ҷ��˿���
		for(int i = 0; i < firstPos; i++)
		{
			if(players[i] != null)
			{
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
	}
	/**
	 * 	���������ϵ��˿���
	 * 	ʵ�ָ÷���ʱ��Ӧ�ÿ���ÿ����ҿ��������˵ĵ�һ���ƣ����Ǵ�ʱû�����Ӹù���
	 */
	public void showPlayerCards()
	{
		for(int i = 0; i < PLAY_NUM; i++)
		{
			//��Ҳ��ǿ�
			if(players[i] != null)
			{
				//������
				System.out.print(players[i] + " : ");
				//�������������ϵ��˿���
				for(String card : playersCards[i])
				{
					System.out.print(card + "\t");
				}
			}
			System.out.println();
		}
	}
	
	//���
	public static void main(String[] args)
	{
		�����Ϸ sh = new �����Ϸ();
		sh.initPlayer("���ش�boy", "�������");
		sh.initCards();
		sh.initPlayerCards();
		//�����˿���
		sh.showAllCards();
		System.out.println("======link start=======");
		//�Ӱְֿ�ʼ����
		sh.deliverCard("���ش�boy");
		sh.showPlayerCards();
		/*
		 * 	�������������ע
		 * 	��������Ƿ��ע
		 * 	��Ϸ�Ƿ�ֻʣһ����ң�����ǣ���win
		 * 	����Ѿ������һ���ƣ���Ҫ�Ƚ�ʣ�µ������С
		 * 
		 * 	�㲻�������Ϸ�������������Ҳ����˷�ʱ��������
		 */
		//�ӵ�����ҿ�ʼ����
		sh.deliverCard("�������");
		sh.showPlayerCards();
	}
}


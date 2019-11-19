package henu.cs.cq.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import henu.cs.cq.domain.Calculate;

public class Panel {
	/**
	 * �����ı���ʾ��
	 * @param jText
	 * @return
	 */
	public JTextArea createTextArea(JTextArea jText) {
		Color bg = new Color(240,248,255);
		
		Border border = BorderFactory.createLineBorder(Color.WHITE, 5, true);
		
		jText = new JTextArea("0",3,10);
		jText.setBackground(bg);
		jText.setBorder(border);
		jText.setEditable(false);
		
		return jText;
	}
	
	/**
	 * 	�ϱߵĲ˵�
	 * @param menubar
	 */
	public void addMenuItems(JMenuBar menubar) {
		//��Ӳ˵�		
		JMenu menu_function=new JMenu("�鿴");
		JMenu menu_edit=new JMenu("�༭");
		JMenu menu_help=new JMenu("����");
		menubar.add(menu_function);	
		menubar.add(menu_edit);
		menubar.add(menu_help);
		// �鿴�Ĳ˵���
		JMenuItem fuc1=new JMenuItem("��׼��");
				
		//�༭�Ĳ˵���
		JMenuItem edit1 = new JMenuItem("����");
		JMenuItem edit2 = new JMenuItem("ճճ");
		JMenuItem edit3 = new JMenuItem("��ʷ��¼");
				
		//�����Ĳ˵���
		JMenuItem help1 = new JMenuItem("�鿴����");
		JMenuItem help2 = new JMenuItem("������ʷ��¼");
				
				
		menu_function.add(fuc1);
		menu_edit.add(edit1);
		menu_edit.add(edit2);
		menu_edit.addSeparator();
		menu_edit.add(edit3);
		menu_help.add(help1);
		menu_help.addSeparator();
		menu_help.add(help2);
	}
	
	/**
	 * 	��ť����
	 * @param btns
	 * @param btnNum
	 * @param str
	 * @param panel
	 */
	public void createBtns(JButton[] btns, int btnNum, String[] str, JPanel panel) {
		Calculate calculate = new Calculate();
		btns = calculate.createBtn(btns,btnNum,str);
		
		//Buttons-border-style
		Border btnBorder = BorderFactory.createLineBorder(new Color(248,248,255),1,true);
		Dimension preferredSize=new Dimension(40, 30); 
		btns = setBtnStyle(btns,btnNum,btnBorder,preferredSize);
		
		btnAdd(panel,btns);
	}
	
	
	/**
	 * 	������Ӱ�ť��ʽ
	 * @param btns
	 * @param n
	 * @param btnBorder
	 * @param preferredSize
	 * @return
	 */
	public JButton[] setBtnStyle(JButton[] btns,int n,Border btnBorder,Dimension preferredSize) {
		for(int i =1;i<=n;i++) {
			btns[i-1].setBorder(btnBorder);
			btns[i-1].setPreferredSize(preferredSize);
		}
		return btns;
	}
	
	/**
	 * 	������Ӱ�ť
	 * @param panel
	 * @param btns
	 */
	public void btnAdd(JPanel panel, JButton[] btns) {
		for(int i=0;i<btns.length;i++)
			panel.add(btns[i]);
	}
}

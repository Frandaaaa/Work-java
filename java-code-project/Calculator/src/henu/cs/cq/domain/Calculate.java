package henu.cs.cq.domain;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import henu.cs.cq.utils.Utils;

public class Calculate extends JFrame implements ActionListener{
	JTextArea jText;
	boolean ifHasDone = false;//�����ж��Ƿ��Ѿ��������
	private final String[] STRING = {"��","...","...","C","7","8","9","/","4","5","6","*","1","2","3","+","0","=",".","-"};
	
	/**
	 * ������
	 */
	public Calculate(){
		super("���صļ�����");
		this.setBounds(100,100,230,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPanel = this.getContentPane();
		
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		addMenuItems(menubar);
		
		//---------------------------View----------------------------------------
		//������ʾ��
		jText = createTextArea(jText);
		this.add(jText,"North");
		
		//---------------------------Button----------------------------------------
		JPanel panel=new JPanel(new FlowLayout());
		this.add(panel);
		
		//Buttons
		int btnNum = 20;
		JButton[] btns = new JButton[btnNum];
		
		createBtns(btns,btnNum,STRING,panel);
		
		this.setResizable(false);
		this.setVisible(true);
		
		//----------------------------over--------------------------------------------
	}
	
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
		this.add(jText,"North");
		
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
		btns = createBtn(btns,btnNum,str);
		
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
	public JButton[] setBtnStyle(JButton[] btns, int n, Border btnBorder, Dimension preferredSize) {
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

	/**
	 * 	����������ť
	 * @param btns
	 * @param n
	 * @param str
	 * @return
	 */
	public JButton[] createBtn(JButton[] btns, int n, String[] str) {
		for(int i =1;i<=n;i++) {
			btns[i-1] = new JButton(str[i-1]);
			btns[i-1].addActionListener(this);
		}
		return btns;
	}
	
	/**
	 * ����ť���ӵ���¼�
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(ifHasDone) {
			jText.setText("0");
			ifHasDone = false;
		}
		String el = e.getActionCommand();
		String getStr = jText.getText();
		System.out.println(getStr);
		if(Utils.isNum(el)&&!getStr.equals("")) {
			//���������
			if(getStr.equals("0")) {
				boolean flag = true;
				numberOperate(el,flag);
			} else {
				numberOperate(el);
			}
			
		} else {
			//����Ǽ������
			boolean flag = true;
			for(int i=0;i<getStr.length();i++) {
				if(getStr.charAt(i)=='+'||getStr.charAt(i)=='-'||getStr.charAt(i)=='*'||getStr.charAt(i)=='/') {
					flag = false;
				}
			}
			otherOperate(el,flag,getStr);
		}
	}
	
	/**
	 * ���ִ���
	 * @param el
	 */
	public void numberOperate(String el) {
		for(int i=0;i<STRING.length;i++) {
			strAppend(jText, el, STRING[i]);
		}
	}
	
	/**
	 * ����ǳ�ʼ����������ִ���
	 * @param el
	 * @param flag
	 */
	public void numberOperate(String el,boolean flag) {
		if(flag) {
			for(int i=0;i<STRING.length;i++) {
				strAppend(jText, el, STRING[i],true);
			}
		}
	}
	
	public void strAppend(JTextArea jText, String el, String str) {
		if(Utils.judgeStr(el, str)) {
			jText.append(str);
		}
	}
	
	public void strAppend(JTextArea jText, String el, String str, boolean flag) {
		if(Utils.judgeStr(el, str)&&flag) {
			jText.setText("");
			jText.append(str);
		}
	}
	
	/**
	 * ���������
	 * @param el
	 * @param flag
	 * @param getStr
	 */
	public void otherOperate(String el,boolean flag,String getStr) {
		if(Utils.judgeStr(el,"+")&&flag) {
			System.out.println("+");
			jText.append("+");
			
		} else if (Utils.judgeStr(el,"-")&&flag) {
			System.out.println("-");
			jText.append("-");
			
		} else if (Utils.judgeStr(el,"*")&&flag) {
			System.out.println("*");
			jText.append("*");
			
		} else if (Utils.judgeStr(el,"/")&&flag) {
			System.out.println("/");
			jText.append("/");
			
		} else if (Utils.judgeStr(el,"=")) {
			System.out.println("=");
			//�ڵڶ���չʾ���Ȼ������һ����������ǵľ���գ����ǾͲ����
			//��ȡ������ַ���
			try {
				Object result = Utils.calMethod(getStr);
				jText.append("\n"+result);
				ifHasDone = true;
				
			} catch (ScriptException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} else if (Utils.judgeStr(el,".")) {
			System.out.println(".");
			jText.append(".");
			
		} else if (Utils.judgeStr(el,"C")) {
			System.out.println("C");
			jText.setText("0");//��յķ���
			
		} else if (Utils.judgeStr(el,"��")&&(getStr.length()>0)) {
			System.out.println("��");
			jText.setText("");
			String newStr = "";
			if(getStr.length()!=1) {
				for(int i=0;i<getStr.length()-1;i++) {
					newStr += getStr.charAt(i)+"";
				}
			} else {
				jText.setText("0");//��յķ���
			}
				
			jText.append(newStr);
		}
	}

}

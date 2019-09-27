package com.belief.face;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.belief.service.LoginService;

public class LoginFace implements ActionListener {
	
	/**
	 * Author:KING-ERIC
	 * Date:2018-3-31 23:00
	 */
	
	//�����½����Ԫ��************************
	
	//���������壬��������
	JFrame Frame =new JFrame("MailServer-����");

	//�����ı���һ���˺ţ�һ������
	JTextField Account=new JTextField(10);
	JPasswordField passWord = new JPasswordField(10);
	
	//������ť����¼�����ã��˳�
	JButton ButtonLogin =new JButton("��¼");
	JButton ButtonReset =new JButton("����");
	JButton ButtonExit =new JButton("�˳�");
	
	//������ѡ��һ���û���һ������Ա����ͬ��Ϊһ��	ButtonGroup��ȥ���û���ѡ��
	//JRadioButton RadioButtonUser=new JRadioButton("�û�",true);
	JRadioButton RadioButtonAdmin =new JRadioButton("����Ա",true);
	ButtonGroup ButtonGroupRole=new ButtonGroup();
	
	//�����ı���ǩ(JLabel������ʾ�ı���ͼ���ͬʱ��ʾ����)���û����������룺����ɫ��
	JLabel userLabel=new JLabel("�û�����");
	JLabel passLabel =new JLabel("��    �룺");
	JLabel roleLabel =new JLabel("��    ɫ��");
	
	//�ĸ��������(JPanel�м�����)��Swing�������ֱ����ӵ����������У���������ӵ�һ����Swing���������������������壨Content Pane����
	JPanel JPanel1=new JPanel();
	JPanel JPanel2=new JPanel();
	JPanel JPanel3=new JPanel();
	JPanel JPanel4=new JPanel();
	
	//һ���˵���
	JMenuBar MenuBar = new JMenuBar();
	JMenu Menu = new JMenu("ѡ��");
	JMenuItem MenuItem1= new JMenuItem("�˳�");
	JMenuItem MenuItem2 = new JMenuItem("����");
	
	//���ô���Ĭ��λ�úʹ�С
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 250;
    private static final int DEFAULT_ROWS = 4;
    private static final int DEFAULT_COLUS = 1;
    private static final int DEFAULT_X = 520;
    private static final int DEFAULT_Y = 250;
	
	public LoginFace(){
		super();
		
		//����һ�����ݣ��û�����Account����������м�����Panel1
		JPanel1.add(userLabel);
		JPanel1.add(Account);
		
		//���ڶ������ݣ������passWord����������м�����Panel2
		JPanel2.add(passLabel);
		JPanel2.add(passWord);
		
		//�����������ݣ�RadioButtonUser��RadioButtonAdmin��ͬһ��ButtonGroupRole
		//ButtonGroupRole.add(RadioButtonUser);
		ButtonGroupRole.add(RadioButtonAdmin);
		
		//�����������ݣ���ɫ��RadioButtonUser��RadioButtonAdmin�����м�����Panel3
		JPanel3.add(roleLabel);
		//JPanel3.add(RadioButtonUser);
		JPanel3.add(RadioButtonAdmin);
		
		//�����������ݣ�����Button�����м�����Panel4
		JPanel4.add(ButtonLogin);
		JPanel4.add(ButtonReset);
		JPanel4.add(ButtonExit);
		
		//�������м��������붥������JFrame
		Frame.add(JPanel1);
		Frame.add(JPanel2);
		Frame.add(JPanel3);
		Frame.add(JPanel4);
		
		//����˵���
		Menu.add(MenuItem1);
		Menu.add(MenuItem2);
		MenuBar.add(Menu);
		Frame.setJMenuBar(MenuBar);
		
		
		// ���ò��ֹ�����Ϊ���񲼾֣�GridLayout(int rows, int cols) :��������ָ�����������������񲼾֡�RowsΪ������ColsΪ����
		Frame.setLayout(new GridLayout(DEFAULT_ROWS, DEFAULT_COLUS));
		
		//���ô����С����300px����250px����ʼλ��250��150
		Frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		Frame.setLocation(DEFAULT_X, DEFAULT_Y);
		//Frame.pack();

		// ���ùرմ���ʱ���˳����򣬶���һ���û��ر�������ʱ����Ӧ����
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ʾ���壬�����ô���ʱ�����һ��������Ϊ�˿����ʾ����Ҫ���ÿ�ܵ�setVisible����
		Frame.setVisible(true);
		
		//���ô���������ɸı��С
		Frame.setResizable(true);

		//���������ť���¼�����
		ButtonLogin.addActionListener(this);
		ButtonReset.addActionListener(this);
		ButtonExit.addActionListener(this);
		MenuItem1.addActionListener(this);
		MenuItem2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals("��¼")) {
			login();
		} else if (arg0.getActionCommand().equals("����")) {
			clear();
		} else if(arg0.getActionCommand().equals("�˳�")) {
			System.exit(0);
		} else if(arg0.getActionCommand().equals("����")) {
			about();
		}
	}
	
	
	public void clear() {
		Account.setText("");
		passWord.setText("");
	}
	
	public void login() {
		String account=Account.getText();
		String password=String.valueOf(passWord.getPassword());
		if(account==null||account.equals("")) {
			JOptionPane.showMessageDialog(null, "�������û�����", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else if(password==null||password.equals("")) {
			JOptionPane.showMessageDialog(null, "���������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else {
			LoginService loginservice =new LoginService();
			if(loginservice.Login(account, password)) {
				JOptionPane.showMessageDialog(null, "��½�ɹ���", "��ʾ��Ϣ", JOptionPane.INFORMATION_MESSAGE);
				
				//��������
				this.clear();
				
				// �رյ�ǰ����(Frame)
				Frame.dispose();
				
				// ����һ���½���
				@SuppressWarnings("unused")
				IndexFace indexface = new IndexFace();
			}
			else {
				JOptionPane.showMessageDialog(null, "�û������������", "��ʾ��Ϣ", JOptionPane.INFORMATION_MESSAGE);
				//��������
				this.clear();
			}
			
		}
	}
	
	public void about() {
		String Content=	"*    Author:KING-ERIC\n* Date:2018-3-31 23:00\n    ��Ȩ����,����ؾ���";
		JOptionPane.showMessageDialog(null, Content, "��������", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		/* ���е�Swing����������¼������߳�(event dispatch thread)�������ã�
         * �߳̽�������Ͱ�ť����ת�Ƶ��û��ӿ����������Ĵ���Ƭ�����¼������߳��е�ִ�д��롣
         * ���ڣ�ֻ��Ҫ���俴��������һ��Swing������������롣
         */
       EventQueue.invokeLater(new Runnable(){
    	   @Override
    	   public void run() {
            // TODO Auto-generated method stub
    			new LoginFace();
          }
        });
	}
}


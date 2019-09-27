package com.belief.face;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.belief.Impl.userDaoImpl;
import com.belief.model.User;

public class IndexFace implements ActionListener {
	
	/**
	 * Author:KING-ERIC
	 * Date:2018-3-31 23:00
	 */
	
	//�������Ԫ��************************
	
	//���������壬��������
	JFrame Frame =new JFrame("MailServer-����");
	
	//�ĸ���ť����¼�����ã��˳�
	JButton ButtonRefesh=new JButton(" ˢ��IP ");
	JButton ButtonRun=new JButton(" ���з����� ");
	JButton ButtonGSMTP=new JButton(" ����SMTPЭ�� ");
	JButton ButtonGPOP3=new JButton(" ����POP3Э�� ");
	JButton ButtonAdd=new JButton(" ��� ");
	JButton ButtonDelete=new JButton(" ɾ�� ");
	JButton ButtonChange=new JButton(" �޸� ");
	JButton ButtonClear=new JButton(" ��� ");
	JButton ButtonSearch=new JButton(" ��ѯ ");
	JButton ButtonRefreshTable=new JButton(" ˢ�±� ");

	
	//�߸��ı���ǩ(JLabel������ʾ�ı���ͼ���ͬʱ��ʾ����)
	JLabel InfoLabel1 =new JLabel("��ӭʹ���ʼ�����������ǰ�汾 Version 5.0");
	JLabel InfoLabel2 =new JLabel("��ǰ��������KING-ERIC        ��������ǰIP��ַ��127.0.0.1");
	JLabel InfoLabel3 =new JLabel("SMTPЭ��״̬��  Э����ֹͣ");
	JLabel InfoLabel4 =new JLabel("POP3Э��״̬��  Э����ֹͣ");
	
	//����JTable
	JTable Table1 = null;
	JTable Table2 = null;
	
	//�����Զ�ˮƽ��/��ֱ������������
	JScrollPane ScrollPane1=new JScrollPane();
	JScrollPane ScrollPane2=new JScrollPane();

	JLabel JLabel1=new JLabel("��   ��");
	JLabel JLabel2=new JLabel("��   ��");
	JLabel JLabel3=new JLabel("��   ��");
	JLabel JLabel4=new JLabel("������Ҫ��ѯ���û���");
	
	JTextPane JTextPane1=new JTextPane();
	JTextPane JTextPane2=new JTextPane();
	JTextPane JTextPane3=new JTextPane();
	JTextPane JTextPane4=new JTextPane();
	JTextPane JTextPane5=new JTextPane();
	JTextPane JTextPane6=new JTextPane();

	JTextField JTextField1=new JTextField(10);
	JTextField JTextField2=new JTextField(10);
	JTextField JTextField3=new JTextField(10);
	JTextField JTextField4=new JTextField(10);
	JTextField JTextField5=new JTextField(10);
	JTextField JTextField6=new JTextField(10);
	JTextField JTextField7=new JTextField(10);

	
	//ʮ�Ÿ��������(JPanel�м�����)��Swing�������ֱ����ӵ����������У���������ӵ�һ����Swing���������������������壨Content Pane����
	JPanel JPanel1=new JPanel();
	JPanel JPanel2=new JPanel();
	JPanel JPanel3=new JPanel();
	JPanel JPanel4=new JPanel();
	JPanel JPanel5=new JPanel();
	JPanel JPanel6=new JPanel();
	JPanel JPanel7=new JPanel();
	JPanel JPanel8=new JPanel();
	JPanel JPanel9=new JPanel();
	JPanel JPanel10=new JPanel();
	JPanel JPanel11=new JPanel();
	JPanel JPanel12=new JPanel();
	JPanel JPanel13=new JPanel();
	JPanel JPanel14=new JPanel();
	JPanel JPanel15=new JPanel();
	JPanel JPanel16=new JPanel();
	JPanel JPanel17=new JPanel();
	JPanel JPanel18=new JPanel();
	JPanel JPanel19=new JPanel();
	JPanel JPanel20=new JPanel();
	JPanel JPanel21=new JPanel();
	JPanel JPanel22=new JPanel();
	JPanel JPanel23=new JPanel();
	JPanel JPanel24=new JPanel();
	JPanel JPanel25=new JPanel();
	JPanel JPanel26=new JPanel();
	JPanel JPanel27=new JPanel();
	JPanel JPanel28=new JPanel();
	JPanel JPanel29=new JPanel();
	
	//һ���˵���
	JMenuBar MenuBar1 = new JMenuBar();
	JMenu Menu1 = new JMenu(" ѡ�� ");
	JMenu Menu2 = new JMenu(" ���� ");
	JMenuItem MenuItem1= new JMenuItem("�˳�");
	JMenuItem MenuItem2 = new JMenuItem("����");
	JMenuItem MenuItem3 = new JMenuItem("����");
	
	//��һ��JTabbedPane����
	JTabbedPane TabbedPane = new JTabbedPane();

	
	//���ô���Ĭ��λ�úʹ�С
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 500;
    private static final int DEFAULT_X = 250;
    private static final int DEFAULT_Y = 100;
	
	public IndexFace(){
		super();
		
		//����˵���
		Menu1.add(MenuItem1);
		Menu1.add(MenuItem2);
		Menu2.add(MenuItem3);
		MenuBar1.add(Menu1);
		MenuBar1.add(Menu2);
		Frame.setJMenuBar(MenuBar1);
		
		//���ô����С����400px����500px����ʼλ��250��100
		Frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		Frame.setLocation(DEFAULT_X, DEFAULT_Y);
		//Frame.pack();
		
		Frame.getContentPane().add(TabbedPane, BorderLayout.CENTER);
		
		//�ĸ���ǩҳ��ÿҳ��һ��JPanel
		TabbedPane.addTab(" ������� ", JPanel1);
		TabbedPane.addTab(" �û����� ", JPanel2);
		TabbedPane.addTab(" ��־���� ", JPanel3);
		TabbedPane.addTab(" ϵͳ���� ", JPanel4);
		
		//��һҳ������JPanel
		JPanel1.add(JPanel5);
		JPanel1.add(JPanel6);
		JPanel1.add(JPanel7);
		JPanel1.setLayout(new GridLayout(3,1));
		JPanel5.setBorder(BorderFactory.createTitledBorder(null, "IP��ַ",1, 0, null, null));
		JPanel6.setBorder(BorderFactory.createTitledBorder(null, "STMPЭ��",1, 0, null, null));
		JPanel7.setBorder(BorderFactory.createTitledBorder(null, "POP3Э��",1, 0, null, null));
		
		
		//�ڶ�ҳ������JPanel
		JPanel2.add(JPanel8);
		JPanel2.add(JPanel9);
		JPanel2.setLayout(new GridLayout(2,1));
		JPanel8.setBorder(BorderFactory.createTitledBorder(null, "�û��б�",1, 0, null, null));
		JPanel9.setBorder(BorderFactory.createTitledBorder(null, "�����û�",1, 0, null, null));
		JPanel10.setBorder(BorderFactory.createTitledBorder(null, "����",1, 0, null, null));
		
		//����ҳ������JPanel
		JPanel3.add(JPanel11);
		JPanel3.add(JPanel12);
		JPanel3.setLayout(new GridLayout(2,1));
		JPanel11.setBorder(BorderFactory.createTitledBorder(null, "ϵͳ��־�б�",1, 0, null, null));
		JPanel12.setBorder(BorderFactory.createTitledBorder(null, "������־",1, 0, null, null));
		
		//����ҳ������JPanel
		JPanel4.add(JPanel13);
		JPanel4.add(JPanel14);
		JPanel4.add(JPanel15);
		JPanel4.setLayout(new GridLayout(3,1));
		JPanel13.setBorder(BorderFactory.createTitledBorder(null, "��������",1, 0, null, null));
		JPanel14.setBorder(BorderFactory.createTitledBorder(null, "��չ����",1, 0, null, null));
		JPanel15.setBorder(BorderFactory.createTitledBorder(null, "�û�����",1, 0, null, null));
		
		//��һҳ**********************************************************************************
		//��һҳ��һ��JPanel
		JPanel5.add(InfoLabel1);
		JPanel5.add(InfoLabel2);
		JPanel16.add(ButtonRefesh);
		JPanel16.add(new JLabel("                                    "));
		JPanel16.add(ButtonRun);
		JPanel5.add(JPanel16);
		JPanel5.setLayout(new GridLayout(3,1));

		
		//��һҳ�ڶ���JPanel
		JPanel6.add(InfoLabel3);
		JPanel6.add(ButtonGSMTP);
		
		//��һҳ������JPanel
		JPanel7.add(InfoLabel4);
		JPanel7.add(ButtonGPOP3);
		
		//�ڶ�ҳ��һ��JPanel****************
		
		//��ߵ�JPanel
		JPanel8.add(JPanel10);
		JPanel10.setLayout(new GridLayout(5,1));
		JPanel10.add(JPanel17);
		JPanel10.add(JPanel18);
		JPanel10.add(JPanel19);
		JPanel10.add(JPanel20);
		JPanel10.add(JPanel21);
		
		JPanel17.add(JLabel1);
		JPanel17.add(JTextField1);
		
		JPanel18.add(JLabel2);
		JPanel18.add(JTextField2);
		
		JPanel19.add(JLabel3);
		JPanel19.add(JTextField3);
		
		JPanel20.add(ButtonAdd);
		JPanel20.add(ButtonChange);
		
		JPanel21.add(ButtonDelete);
		JPanel21.add(ButtonClear);
		
		//�ұߵ�JTable
		JPanel8.setLayout(new GridLayout(1,2));
		refeshtable();
		
		
		//�ڶ�ҳ�ڶ���JPanel****************
		JPanel9.setLayout(new GridLayout(4,1));
		JPanel9.add(JPanel22);
		JPanel9.add(JPanel23);
		JPanel9.add(JPanel24);
		JPanel9.add(JPanel25);
		JPanel23.add(JLabel4);
		JPanel23.add(JTextField4);
		JPanel24.add(ButtonSearch);
		JPanel24.add(new JLabel("                          "));
		JPanel24.add(ButtonRefreshTable);

		//����ҳJPanel11��12.......
		JPanel11.add(new JLabel("�˹�����δ��ͨ��"));
		JPanel12.add(new JLabel("�˹�����δ��ͨ��"));
		JPanel13.add(new JLabel("�˹�����δ��ͨ��"));
		JPanel14.add(new JLabel("�˹�����δ��ͨ��"));
		JPanel15.add(new JLabel("�˹�����δ��ͨ��"));
		
		
		// ���ùرմ���ʱ���˳����򣬶���һ���û��ر�������ʱ����Ӧ����
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ʾ���壬�����ô���ʱ�����һ��������Ϊ�˿����ʾ����Ҫ���ÿ�ܵ�setVisible����
		Frame.setVisible(true);
		
		//���ô���������ɸı��С
		Frame.setResizable(true);

		//���������ť���¼�����
		MenuItem1.addActionListener(this);
		MenuItem2.addActionListener(this);
		MenuItem3.addActionListener(this);
		ButtonRefesh.addActionListener(this);
		ButtonRun.addActionListener(this);
		ButtonGSMTP.addActionListener(this);
		ButtonGPOP3.addActionListener(this);
		ButtonAdd.addActionListener(this);
		ButtonDelete.addActionListener(this);
		ButtonChange.addActionListener(this);
		ButtonClear.addActionListener(this);
		ButtonSearch.addActionListener(this);
		ButtonRefreshTable.addActionListener(this);
		

		try {
			InetAddress localhost = InetAddress.getLocalHost();
			if(localhost!=null)
				InfoLabel2.setText("��ǰ��������"+localhost.getHostName()+"        ��������ǰIP��ַ��"+localhost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals("����")) {
			help();
		} else if(arg0.getActionCommand().equals("�˳�")) {
			System.exit(0);
		} else if(arg0.getActionCommand().equals("����")) {
			about();
		}else if(arg0.getActionCommand().equals(" ˢ��IP ")) {
			refeship();
		}else if(arg0.getActionCommand().equals(" ���з����� ")) {
			runserver();
		}else if(arg0.getActionCommand().equals(" ����SMTPЭ�� ")) {
			startsmtp();
		}else if(arg0.getActionCommand().equals(" ����POP3Э�� ")) {
			startpop3();
		}else if(arg0.getActionCommand().equals(" ��� ")) {
			add();
		}else if(arg0.getActionCommand().equals(" ɾ�� ")) {
			delete();
		}else if(arg0.getActionCommand().equals(" �޸� ")) {
			modify();
		}else if(arg0.getActionCommand().equals(" ��� ")) {
			clear();
		}else if(arg0.getActionCommand().equals(" ��ѯ ")) {
			query();
		}else if(arg0.getActionCommand().equals(" ˢ�±� ")) {
			refeshtable();
		}
	}
	
	public void about() {
		String Content=	"*    Author:KING-ERIC\n* Date:2018-3-31 23:00\n    ��Ȩ����,����ؾ���";
		JOptionPane.showMessageDialog(null, Content, "��������", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void help() {
		String Content=	"https://blog.csdn.net/lyy296293760";
		JOptionPane.showMessageDialog(null, Content, "����", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void refeship() {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			if(localhost!=null)
				InfoLabel2.setText("��ǰ��������"+localhost.getHostName()+"        ��������ǰIP��ַ��"+localhost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void runserver() {
		String Content=	"https://blog.csdn.net/lyy296293760";
		JOptionPane.showMessageDialog(null, Content, "����", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void startsmtp() {
		String Content=	"https://blog.csdn.net/lyy296293760";
		JOptionPane.showMessageDialog(null, Content, "����", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void startpop3() {
		String Content=	"https://blog.csdn.net/lyy296293760";
		JOptionPane.showMessageDialog(null, Content, "����", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void add() {
		String email=JTextField1.getText();
		String password=JTextField2.getText();
		String name=JTextField3.getText();
		if(email==null||email.equals("")) {
			JOptionPane.showMessageDialog(null, "�������û����䣡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else if(password==null||password.equals("")) {
			JOptionPane.showMessageDialog(null, "���������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else if(name==null||name.equals("")) {
			JOptionPane.showMessageDialog(null, "������������", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else {
			User iuser=new userDaoImpl().QueryByEmail(email);
			if(iuser==null) {
				User user=new User();
				user.setMail_address(email);
				user.setNick_name(name);
				user.setUser_password(password);
				new userDaoImpl().save(user);
				JOptionPane.showMessageDialog(null, "��ӳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				refeshtable();
			}else {
				JOptionPane.showMessageDialog(null, "�û��Ѿ����ڣ����ʧ�ܣ�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void delete() {
		String email=JTextField1.getText();
		if(email==null||email.equals("")) {
			JOptionPane.showMessageDialog(null, "�������û����䣡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else {
			User iuser=new userDaoImpl().QueryByEmail(email);
			if(iuser!=null) {
				User user=new User();
				user.setMail_address(email);
				new userDaoImpl().delete(user);
				JOptionPane.showMessageDialog(null, "ɾ���ɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				refeshtable();
			}else {
				JOptionPane.showMessageDialog(null, "�û������ڣ�ɾ��ʧ�ܣ�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void modify() {
		String email=JTextField1.getText();
		String password=JTextField2.getText();
		String name=JTextField3.getText();
		if(email==null||email.equals("")) {
			JOptionPane.showMessageDialog(null, "�������û����䣡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else if(password==null||password.equals("")) {
			JOptionPane.showMessageDialog(null, "���������룡", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else if(name==null||name.equals("")) {
			JOptionPane.showMessageDialog(null, "������������", "��ʾ��Ϣ", JOptionPane.WARNING_MESSAGE);
		}else {
			User iuser=new userDaoImpl().QueryByEmail(email);
			if(iuser!=null) {
				User user=new User();
				user.setMail_address(email);
				user.setNick_name(name);
				user.setUser_password(password);
				new userDaoImpl().update(user);
				JOptionPane.showMessageDialog(null, "�޸ĳɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				refeshtable();
			}else {
				JOptionPane.showMessageDialog(null, "�û������ڣ������û����䣡", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void clear() {
		JTextField1.setText("");
		JTextField2.setText("");
		JTextField3.setText("");
	}
	
	public void query() {
		String email=JTextField4.getText();
		User iuser=new userDaoImpl().QueryByEmail(email);
		if(iuser!=null)
			JOptionPane.showMessageDialog(null, iuser, "�û���Ϣ", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "������Ҫ��ѯ���û����䣡","��ʾ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void refeshtable() {
		this.clear();
		ArrayList<User> Users=new userDaoImpl().QueryAllUser();
		Object[][]Data = new Object[Users.size()][3];
		for(int i=0;i<Users.size();i++) {
			Data[i][0]=Users.get(i).getNick_name();
			Data[i][1]=Users.get(i).getMail_address();
			Data[i][2]=Users.get(i).getUser_password();
		}
		Table1 = new JTable(Data, new String[]{"����","����","����"});
		//��table����һ������¼�����������
        Table1.addMouseListener(new java.awt.event.MouseAdapter(){
             public void mouseClicked(MouseEvent e) {//������굥��ʱ��Ӧ
                //�õ�ѡ�е����е�����ֵ
               int r= Table1.getSelectedRow();
              // int c= Table1.getSelectedColumn();
               //�õ�ѡ�еĵ�Ԫ���ֵ������ж����ַ���
	       	   JTextField1.setText(Table1.getValueAt(r, 1).toString());
	    	   JTextField2.setText(Table1.getValueAt(r, 2).toString());
	    	   JTextField3.setText(Table1.getValueAt(r, 0).toString());
               //Object value= Table1.getValueAt(r, c);
               //String info=r+"��"+c+"��ֵ : "+value.toString();
               // javax.swing.JOptionPane.showMessageDialog(null,info);
             }
         }); 
		JPanel8.remove(ScrollPane1);
		ScrollPane1 = new JScrollPane(Table1);
		JPanel8.add(ScrollPane1);
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
    			new IndexFace();
          }
        });
	}
}


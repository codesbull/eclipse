package com.baidu.www.swing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LoginFrame extends JFrame{
	private JLabel lbTip=new JLabel("�û���¼");
	Font font=new Font("����",Font.BOLD,36);
	
	private JLabel lbUsername=new JLabel("�û���:");
	private static JTextField txtUsername=new JTextField();
	
	private JLabel lbpassword=new JLabel("��   ��:");
    private static JPasswordField txtPassword=new JPasswordField();
    
    private  JButton btnLogin=new JButton("��¼");
    private  JButton btnReset=new JButton("����");
    public LoginFrame()
    {
    	this.setTitle("�û���¼");
		this.setSize(320,240);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		Container cont=this.getContentPane();
		cont.setLayout(null);
		lbTip.setFont(font);
		lbTip.setForeground(Color.BLUE);
		lbTip.setBounds(80,0,220,50);
		lbUsername.setBounds(50,50,60,25);
		txtUsername.setBounds(110,50,160,25);
		lbpassword.setBounds(50,85,60,25);
		txtPassword.setBounds(110,85,160,25);
		btnLogin.setBounds(80,130,60,25);
		btnReset.setBounds(160,130,60,25);
		btnLogin.addActionListener(new LoginAction());
		btnReset.addActionListener(new ResetAction());
		cont.add(lbTip);
		cont.add(lbUsername);
		cont.add(txtUsername);
		cont.add(lbpassword);
		cont.add(txtPassword);
		cont.add(btnLogin);
		cont.add(btnReset);
		this.setVisible(true);
    }
    private class LoginAction implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) {
			String username=txtUsername.getText().trim();
			String password=txtPassword.getText().trim();
			
			if(username.equals("admin")&&password.equals("123456"))
			{
				JOptionPane.showMessageDialog(null,"��½�ɹ���");
				MainFrame mainFrame=new MainFrame();
				LoginFrame.this.setVisible(false);
			}else
			{
				JOptionPane.showMessageDialog(null,"�û������������");
				txtUsername.setText("") ;
				txtPassword.setText("") ;
				txtUsername.requestFocus() ;
			}
			
		}
		
		
    }
    
    private class ResetAction implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) {
    	txtUsername.setText("") ;
		txtPassword.setText("") ;
		}	
	}
    public static void main(String[] args){
    	new LoginFrame();
    }
}

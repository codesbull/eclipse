package loginframe.demo;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.baidu.www.swing.MainFrame;
public class LoginFrame extends JFrame {
	
	private JLabel lbUsername=new JLabel("UserId:");
	private static JTextField txtUsername=new JTextField();
	
	private JLabel lbpassword=new JLabel("PassWord:");
    private static JPasswordField txtPassword=new JPasswordField();
    
    private  JButton btnLogin=new JButton("Login");
    private  JButton btnReset=new JButton("Reset");
    
    public LoginFrame()
    {
    	this.setTitle("User Login");//����
		this.setSize(400,250);//�����С
		this.setLocationRelativeTo(null);//������ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); //�����С���ܸı�
		this.setVisible(true);//���ô���ɼ���û�и���䣬���彫���ɼ������������У�����û�н����û�����������
		Container cont=this.getContentPane();//��ʼ��һ������
		//JFrame�޷�ֱ����������ҪgetContentPane()��ȡ��壬Ȼ�������������������
		cont.setLayout(null);//����Ϊnull��Ϊ��ղ��ֹ�������֮��������
		//����������������Ͻ�����������������Ͻǣ�0��0����x,yֵ��ȷ�������λ�ã���ʹ����������СҲ����ı�λ�á����ַ�ʽ�������ڴ����С�̶�������� 
		
		//��ӵ�������
		cont.add(lbUsername);
		cont.add(txtUsername);
		cont.add(lbpassword);
		cont.add(txtPassword);
		cont.add(btnLogin);
		cont.add(btnReset);
		
		lbUsername.setBounds(50,50,50,25);
		txtUsername.setBounds(120,50,160,25);
		
		lbpassword.setBounds(50,95,95,25);
		txtPassword.setBounds(120,95,160,25);
		
		btnLogin.setBounds(100,130,70,25);
		btnReset.setBounds(220,130,80,25);
		//����
		btnLogin.addActionListener(new LoginAction());
		btnReset.addActionListener(new ResetAction());	
    }
    private class LoginAction implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) {
			String username=txtUsername.getText().trim();
			String password=txtPassword.getText().trim();
			
			if(username.equals("admin")&&password.equals("123456"))
			{
				JOptionPane.showMessageDialog(null,"��½�ɹ�!");
				MainFrame mainFrame=new MainFrame();
				LoginFrame.this.setVisible(false);
			}else
			{
				JOptionPane.showMessageDialog(null,"�û������������!");
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

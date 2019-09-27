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
    	this.setTitle("User Login");//标题
		this.setSize(400,250);//窗体大小
		this.setLocationRelativeTo(null);//居中显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); //窗体大小不能改变
		this.setVisible(true);//设置窗体可见，没有该语句，窗体将不可见，此语句必须有，否则没有界面就没有如何意义了
		Container cont=this.getContentPane();//初始化一个容器
		//JFrame无法直接添加组件需要getContentPane()获取面板，然后再内容面板上添加组件
		cont.setLayout(null);//设置为null即为清空布局管理器，之后添加组件
		//常常是设置组件左上角坐标相对于容器左上角（0，0）的x,y值来确定组件的位置，即使更改容器大小也不会改变位置。这种方式常常用于窗体大小固定的容器里。 
		
		//添加到容器中
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
		//监听
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
				JOptionPane.showMessageDialog(null,"登陆成功!");
				MainFrame mainFrame=new MainFrame();
				LoginFrame.this.setVisible(false);
			}else
			{
				JOptionPane.showMessageDialog(null,"用户名或密码错误!");
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

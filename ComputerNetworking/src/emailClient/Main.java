package emailClient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Base64;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.Font;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane txtpnPleaseLoginYour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String username;
		String password;
		frame = new JFrame("Mail-send");
		frame.setBounds(100, 100, 400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtpnUsername.setText("username:");
		txtpnUsername.setBounds(40, 70, 93, 32);
		frame.getContentPane().add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setText("password:");
		txtpnPassword.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtpnPassword.setBounds(40, 110, 93, 32);
		frame.getContentPane().add(txtpnPassword);
		
		textField = new JTextField();
		textField.setBounds(150, 70, 184, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 110, 184, 32);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("login");//\u767B\u5F55
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = textField_1.getText();
				System.out.println(username+ "  " + password);
				try {
					Socket client = new Socket("smtp.qq.com",25);
					BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		            String response = br.readLine();
		            if(response.equals("220 smtp.qq.com Esmtp QQ Mail Server")){
		            	System.out.println("客户端已经连接到腾讯邮件服务器！！");
		            	//输入EHLO指令
		            	DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		    			dos.writeBytes("HELO sunyuhu\r\n");
		    			dos.flush();
		    	        response = br.readLine();
		    	        if(!response.equals("250 smtp.qq.com")){
		    	        	 System.out.println("命令错误！！！");
		    	        }
		    	        //输入认证指令，用户名和密码
		    			dos.writeBytes("AUTH LOGIN\r\n");
		    			dos.flush();
		    	        response = br.readLine();
		    	        if(!response.equals("334 VXNlcm5hbWU6")){
		   	        	 	System.out.println("命令错误！！！");
		   	            }else{
		   	            	System.out.print("请输入用户名：");
		   	            	dos.writeBytes(Base64.getEncoder().encodeToString(username.getBytes())+ "\r\n");
		   	    			dos.flush();
		   	    	        response = br.readLine();
			   	    	    if(!response.equals("334 UGFzc3dvcmQ6")){
			    	        	 	System.out.println("用户名输入错误！！！");
			    	        	 	textField.setText("");
			    	        	 	textField_1.setText("");
			    	        }else{
			    	        	    System.out.println("用户名输入成功！！！");
			    	            	System.out.print("请输入密码：");
			    	            	dos.writeBytes("dm54dmJ2YWJpbXZwaGpjZQ==\r\n");
			    	    			dos.flush();
			    	    	        response = br.readLine();
			    	    	        if(!response.equals("235 Authentication successful")){
			    	    	        	System.out.println("密码输入错误！！！");
			    	    	        	textField.setText("");
				    	        	 	textField_1.setText("");
			    	    	        }else{
			    	    	        	System.out.println("登录成功！！！");
			    	    	        	dos.writeBytes("quit\r\n");
				    	    			dos.flush();
			    	    	        	WriteAndSendEmail send = new WriteAndSendEmail(username,password);
			    	    				send.setVisible(true);
			    	    				frame.dispose();
			    	    	        }
			    	        }
		   	            }
		            }
		            else{
		            	System.out.println("未知错误！！！");
		            	frame.dispose();
		            }
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(150, 160, 93, 37);
		frame.getContentPane().add(button);
		
		txtpnPleaseLoginYour = new JTextPane();
		txtpnPleaseLoginYour.setFont(new Font("Consolas", Font.BOLD, 18));
		txtpnPleaseLoginYour.setEditable(false);
		txtpnPleaseLoginYour.setText("Please login your QQ email");
		txtpnPleaseLoginYour.setBounds(60, 10, 266, 37);
		frame.getContentPane().add(txtpnPleaseLoginYour);
	}
}

package emailClient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Base64;
import java.util.Scanner;

/**
 * 
 * @author sunyuhu
 * @category this is an email client.
 * @version v20180914
 */
public class Client {
	public static void main(String[] args){
		//�½�һ��tcp���ӣ������׵�
		try {
			Socket client = new Socket("smtp.qq.com",25);
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String response = br.readLine();
            String username;                             //�û���
            String password;                             //����
            String receiver;                             //�����û���
            String subject;                              //�ʼ�����
            String str;
            StringBuffer content = new StringBuffer();
            if(response.equals("220 smtp.qq.com Esmtp QQ Mail Server")){
            	System.out.println("�ͻ����Ѿ����ӵ���Ѷ�ʼ�����������");
            	
            	//����EHLOָ��
            	DataOutputStream dos = new DataOutputStream(client.getOutputStream());
    			dos.writeBytes("HELO sunyuhu\r\n");
    			dos.flush();
    	        response = br.readLine();
    	        if(!response.equals("250 smtp.qq.com")){
    	        	 System.out.println("������󣡣���");
    	        }
    	        
    	        //������ָ֤��û���������
    			dos.writeBytes("AUTH LOGIN\r\n");
    			dos.flush();
    	        response = br.readLine();
    	        if(!response.equals("334 VXNlcm5hbWU6")){
   	        	 	System.out.println("������󣡣���");
   	            }else{
   	            	System.out.print("�������û�����");
   	            	Scanner sc = new Scanner(System.in);
   	            	username = sc.nextLine();
   	            	//Base64.getEncoder().encodeToString(username.getBytes());
   	            	//dos.writeBytes("MTI2Mzc1ODM4N0BxcS5jb20=\r\n");
   	            	dos.writeBytes(Base64.getEncoder().encodeToString(username.getBytes())+ "\r\n");
   	    			dos.flush();
   	    	        response = br.readLine();
	   	    	    if(!response.equals("334 UGFzc3dvcmQ6")){
	    	        	 	System.out.println("�û���������󣡣���");
	    	        }else{
	    	        	    System.out.println("�û�������ɹ�������");
	    	            	System.out.print("���������룺");
	    	            	sc = new Scanner(System.in);
	    	            	password = sc.nextLine();
	    	            	dos.writeBytes("dm54dmJ2YWJpbXZwaGpjZQ==\r\n");
	    	    			dos.flush();
	    	    	        response = br.readLine();
	    	    	        if(!response.equals("235 Authentication successful")){
	    	    	        	System.out.println("����������󣡣���");
	    	    	        }else{
	    	    	        	System.out.println("��¼�ɹ�������");
	    	    	        	System.out.print("�������ռ��ˣ�");
		    	            	sc = new Scanner(System.in);
		    	            	dos.writeBytes("mail from:<1263758387@qq.com>\r\n");
		    	    			dos.flush();
		    	    			response = br.readLine();
		    	    			receiver = sc.nextLine();
		    	    			dos.writeBytes("rcpt to:<" +receiver +">\r\n");
		    	    			dos.flush();
		    	    	        response = br.readLine();
		    	    	       if(!response.equals("250 Ok")){
		    	    	    	   System.out.println("������󣡣���");
		    	    	       }else{
		    	    	    	   dos.writeBytes("data\r\n");
			    	    		   dos.flush();
			    	    		   response = br.readLine();
		    	    	    	   System.out.println("�������ʼ����⣺");
		    	    	    	   subject = sc.nextLine();
		    	    	    	   System.out.println("�������ʼ�����(��0����)��");
		    	    	    	   while(!"eof".equals(str = sc.nextLine())){
		    	    	    		   content.append(str);
		    	    	    	   }
		    	    	    	   dos.writeBytes("from:sunyuhu\r\n"+"to:<"+receiver+">\r\nsubject:"+ subject + "\r\n\r\n" + content.toString()+"\r\n.\r\n");
			    	    		   dos.flush();
			    	    		   
		    	    	    	   System.out.println(br.readLine()+ "\n���ͳɹ�����");
		    	    	    	   
		    	    	       }
	    	    	        }
	    	        }
   	            }
            }
            
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

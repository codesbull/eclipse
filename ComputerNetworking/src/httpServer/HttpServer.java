package httpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author sunyuhu
 * @category this is a program that simulates HTTP protocol,which is sent by brown.
 * @version v20180914
 */
public class HttpServer {
	
	ServerSocket server;               //��������
	Socket client;                     //������Ŀͻ���
	//���캯��
	HttpServer(){
		try {
			server = new ServerSocket(5555);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//main ����
	public static void main(String[] args){
         HttpServer myserver = new HttpServer();
         myserver.begin();
	}

	//�ڴ˽��ܿͻ��˵����󣬲�����Ӧ
	private void begin() {
		 String httpRequest;
		 String urlRequest;
         while(true){
        	 try {
        		 //��ʼ����
				client = this.server.accept();
				System.out.println("one has connected to this server!!" + client.getLocalPort());
                BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()));				
                httpRequest = bf.readLine();
                System.out.println(httpRequest);
                //��ȡ��url��ַ,����ͷ����/index.html �������Ҫ��/ȥ��
                urlRequest = httpRequest.split(" ")[1].substring(1);    
                System.out.println(urlRequest);
                //����Ƿ��и��ļ������򷵻أ����򱨴�404
                PrintWriter out = new PrintWriter(client.getOutputStream());
       		    //����һ��״̬��
               out.println("HTTP/1.0 200 OK"); 
               //����һ���ײ�
               out.println("Content-Type:text/html;charset=GBK");  
               // ���� HTTP Э��, ���н�����ͷ��Ϣ  
               out.println();
               
               // ���������Դ
               out.println("<h1 style='color: green'> Hello Http Server</h1>");  
               out.println("���, ����һ�� Java HTTP ������ demo Ӧ��.<br>");  
               out.println("�������·����: " + urlRequest + "<br>");  
               out.close();  
        	 } catch (IOException e) {
				e.printStackTrace();
			}
         }
	}
}
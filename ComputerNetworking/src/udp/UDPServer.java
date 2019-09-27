package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) throws IOException{
		
		String inFromClient;
		DatagramSocket server = new DatagramSocket(20000);
		
		byte[]  send = new byte[1024];
		byte[]  receive = new byte[1024];
		while(true){
			DatagramPacket receiveData = new DatagramPacket(receive,receive.length);
			server.receive(receiveData);
			inFromClient = new String(receiveData.getData());//���������String���캯������������ֱ�ӡ�toString()��������ֱ�Ӹ�ֵ��һ��String���͵ı���
			System.out.println("From client:" + inFromClient);
			
			inFromClient  = inFromClient.toUpperCase();
			DatagramPacket sendData = new DatagramPacket(inFromClient.getBytes(), inFromClient.getBytes().length,receiveData.getAddress(),receiveData.getPort());
			server.send(sendData);
			
		}
	}
}

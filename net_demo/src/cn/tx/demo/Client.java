package cn.tx.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
	
	
	public static void main(String[] args) {
		//创建一个socket对象
		DatagramSocket ds = null;
				
		try {
			ds = new DatagramSocket();
			String str = "你好";
			byte[] bytes = str.getBytes();
			
			//创建要发送的地址
			InetAddress addr = InetAddress.getByName("192.168.0.115");
			//创建数据包
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length, addr, 10000);
			ds.send(dp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ds != null){
				ds.close();
			}
		}
	}

}

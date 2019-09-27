package cn.tx.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client extends Thread{
	
	public void run(){
		//创建一个socket对象
		DatagramSocket ds = null;
		//创建字符流输入
		BufferedReader br = null;
		try {
			//初始化字符输入流
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//定义一个接受数据的变量
			String line = null;
			while((line = br.readLine()) != null){
				ds = new DatagramSocket();
				byte[] bytes = line.getBytes();
				//创建要发送的地址
				InetAddress addr = InetAddress.getByName("192.168.0.115");
				//创建数据包
				DatagramPacket dp = new DatagramPacket(bytes, bytes.length, addr, 10001);
				if("exit".equals(line)){
					ds.send(dp);
					break;
				}
				
				ds.send(dp);
				
			}
			
			System.out.println("结束聊天");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ds != null){
				ds.close();
			}
		}
	}
	
	
}

package cn.tx.demo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
	
	
	
	public static void main(String[] args) {
		//创建一个socket对象
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(10000);
			//创建一个字节的数组
			byte[] bs = new byte[1024];
			
			//创建一个数据包
			DatagramPacket dp = new DatagramPacket(bs, bs.length);
			while(true){
				//接受数据
				ds.receive(dp);
				//获得数据
				byte[] data = dp.getData();
				//获得数据的长度
				int length = dp.getLength();
				String str = new String(data, 0, length);
				if("exit".equals(str)){
					break;
				}
				System.out.println("接受到的数据是："+str);
			}
			System.out.println("拜拜");
			
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

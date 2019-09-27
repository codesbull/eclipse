package cn.tx.demo2;

public class ChatRoom {
	
	
	
	public static void main(String[] args) {
		//创建服务和客户端
		Server server = new Server();
		server.start();
		Client client = new Client();
		client.start();
		
	}

}

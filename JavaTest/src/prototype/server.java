package prototype;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
	public static void main(String[] args) {
		int port = 3000;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress() + "가 연결을 요청함...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

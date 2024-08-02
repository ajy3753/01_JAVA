package prototype;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	public static void main(String[] args) {
		int port = 3000;
		String serverIP = "192.168.30.213";
		
		try {
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) {
				System.out.println("서버와 연결 성공!");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

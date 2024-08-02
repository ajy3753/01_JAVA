package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		System.out.println("******* UDP Server *******");
		
		// 포트는 중복 사용 불가능 (같은 포트를 사용하고자 할 때는 반드시 다른 작업은 종료 시켜야한다)
		int port = 4000;
		
		try {
			// 서버가 포트를 결합하여 요청을 받을 준비를 한다
			DatagramSocket dsoc = new DatagramSocket(port);
			
			// 전송 받은 데이터를 지정할 바이트 배열
			byte[] data = new byte[60000];
			
			// 클라이언트로부터 받을 Packet 객체 생성
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("데이터 받을 준비 완료\n");
			
			while(true) {
				// 전송 받은 데이터 받기
				dsoc.receive(dp);
				
				// 데이터 확인
				System.out.println("클라이언트 ip : " + dp.getAddress());
				String message = new String(dp.getData(), "UTF-8");
				System.out.println("클라이언트가 보낸 내용 : " + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
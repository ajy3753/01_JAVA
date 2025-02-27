package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******* UDP Client *******");
		
		System.out.print("보낼 메시지 : ");
		String msg = sc.nextLine();
		
		InetAddress inet;
		int port = 4000;
		
		try {
			DatagramSocket dsoc = new DatagramSocket();
			// 로컬 : 192.168.30.213
			inet = InetAddress.getByName("192.168.30.213");
			
			// 전송할 데이터 생성
			// -> DatagramPacket (전송할 데이터의 byte 배열, 전송할 데이터의 길이, ip 정보를 담은 inetAddress 객체, 전송할 port)
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
			dsoc.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package p.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
	/*
	 * 네트워크 : 여러 대의 컴퓨터들이 연결 되어있는 통신망
	 * => 네트워크를 통해 서로 데이터 교환하기 위함
	 * 
	 * IP 주소 : 네트워크 상에서 각 컴퓨터들을 식별해 줄 수 있는 번호 (실제 주소와 동일한 역할)
	 * 
	 * [서버와 클라이언트]
	 * - 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터 (요청에 대해서 응답해주는 뜻)
	 * - 클라이언트 : 서버에 요청을 하는 컴퓨터 (서비스를 제공받는 고객)
	 * - 서버에 요청하기 위해서는 요청하고자하는 서버의 IP주소(또는 도메인), 포트번호를 알아야함
	 * - 현재 구동 중인 서버가 있을 때 클라이언트는 그 서버로 요청을 보낼 수 있음 -> 응답결과가 돌아옴
	 * - 요청과 응답에 의해서 웹은 작동한다(통신한다).
	 * - 웹에서의 통신방식은 HTTP 프로토콜을 사용한다.
	 */
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println(localhost);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
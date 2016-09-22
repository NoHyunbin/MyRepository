package ch18.exam16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress myIA =InetAddress.getLocalHost();
		String myIP = myIA.getHostAddress();
		System.out.println("내컴퓨터 IP : " + myIP);
		System.out.println();
		
		InetAddress[] naverIAs = InetAddress.getAllByName("www.naver.com");
		System.out.println(naverIAs[0].getHostName());
		for ( InetAddress i : naverIAs ) {
			System.out.println(i.getHostAddress());
		}
	}

}

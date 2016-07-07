import java.net.*;
import java.io.*;
class UdpCLient{
	public static void main(String s[])
	{
		DatagramSocket=new DatagramSocket();
		String s="India is good country";
		byte b[] =s.getBytes();
		InetAddress i =InetAddress.getlocalhost();
		DatagramPacket(b,b.length,i,8);
		ds.send(dp);
	}

}
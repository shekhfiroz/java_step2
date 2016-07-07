import java.net.*;
import java.io.*;

class UdpServer{
public static void main(Srting args[]){

       DatagramSocket ds =new DatagramSocket(8);
       byte b[]=new byte[1024];
       DatagramPacket db= new DatagramPacket(b,b.length);
       ds.recieve(dp);
       Srting r=new Srting(dp.getData());
       System.out.println(r.trim());
	}
}
import java.awt.*;
import javax.swing.*;
importjava.io.*;
import java.net.*;
public class fileReciever{
	
	Socket s;
	ServerSocket ss;
	DataInputStream dis,dis1;
	PrintWriter pw;
	public FileReciever()
	{
	 try {
	    ss=newServerSocket(10);
	    s=ss.accept();
	    dis =new DataInputStream(s.getInputStream());
	    Srtings s2 =dis.readUTF();
	    File Writer fo= newFileWriter(s2);
	    pw =new PrintWriter(fo);
	    fileReciever();
	 }
	 catch (Exception e{
	 	System.out.printl(e);
	 }
	}


	public void fileReciever()
	{
		string str="";
		try{
			do{
				str=dis.readUTF();
				pw.println(str);
				pw.flush();
			}
			While(!str.equals(null));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String k[])
      {
      	new fileReciever();
      }
}
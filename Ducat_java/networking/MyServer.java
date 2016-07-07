import java.io.*;
import java.net.*;
public class MyServer
{
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;

	public MyServer()
	{
		try {
			System.out.println("Server Started");
			ss=new ServerSocket(10);
			s=ss.accept();
			System.out.println(s);
			System.out.println("CLIENT CONNECTIONN");
			dis =new DataInputStream(s.getInputStream());
			dos =new DataOutputStream(s.getOutputStream());
			ServerChat();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

		public static void main(String args[])
		{
			new MyServer();
		}

		public void ServerChat() throws IOException
		{
			String str;
			do {
				str =dis.readUTF();
				System.out.println("CLIENT MESSAGE" + str);
				dos.writeUTF("HELLO"+str);
				dos.flush();
			
		}
		while(!str.equals("Stop"));
  }
}
import java.io.*;
import java.net.*;
public class MyServer1
{
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;

	public MyServer1()
	{
		try {
			System.out.println("Server started");
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
		new MyServer1();
	}
	public void ServerChat() throws IOException{
		String str,s1;
		do
		{
			str =dis.readUTF();
			System.out.println("ClientMessage" +str);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			s1 =br.readLine();
			dos.writeUTF(s1);
			dos.flush();
		}
		while(!s1.equals("Stop"));
	}

}
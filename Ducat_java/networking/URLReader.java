import java.net.*;
import.java.io.*;
public class URLReader{
	public static void main(String[] args) throws Exception{
	URL Google =new URL("http://www.google.com/");
	BufferReader in =new BufferReader(new InputStreamReader(google openStream())
	}
	String InputLine;
	While(inputLine =in.readLine())!=null);
	System.out.println(inputLine);
	in.close();
	}

	//BufferedReader in
   //= new BufferedReader(new InputStreamReader(System.in));
 
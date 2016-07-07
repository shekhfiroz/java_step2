// import java.net.*;
// import java.io.*;

// public class URLConnectionReader{
// public static String inputLine = "";
// public static void main(String... a)throws Exception {
	
// 	URL google =new URL("http://www.google.com/");
// 	URLConnection gc = Google.OpenConnection();
// 	BuffereReader in =new BufferedReader(new InputStreamReader(gc.getInputStream));
// 	while(inputLine!=null)
// 	{
// 	      inputLine =in.readLine();
// 	      System.out.println(inputLine);
// 	 }
// 	in.close();
//   }
// }


import java.io.*;
import java.net.*;

public class URLDemo{
public static void main(String[] args){
try{
URL url=new URL("http://www.javatpoint.com/sonoojaiswal/index.jsp");

System.out.println("Protocol: "+url.getProtocol());
System.out.println("Host Name: "+url.getHost());
System.out.println("Port Number: "+url.getPort());
System.out.println("File Name: "+url.getFile());

}catch(Exception e){System.out.println(e);}
}
}
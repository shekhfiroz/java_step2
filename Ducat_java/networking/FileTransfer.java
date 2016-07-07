import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class FileTransfer extends JFrame implements ActionListener{
	JFrame jf;
	JButton jb1,jb2;
	TextField tf;
	JFilechooser jfc;
	Socket S;
	DataInputStream din;
	DataOutputStream dout,dout1;
	String s1 =new String();
	String s2="";
	File f;

	File Transfer()
	{
		jf= new JFrame("FILE TRANSFER");
		jf.SetSize(500,500);
		Container c=jf.getContentPanel();
		c.SetBackground(Color.red);
		jf.SetBackground(Color.red);
		jf.SetLayout(null);
		Jb1= new JButton("ChooseFile");
		Jb2= new JButton("Send");
		Jb1.SetBounds(30,50,100,50);
		Jb2.SetBounds(250,150,70,50);
		jf.add(Jb1);
		jf.add(Jb2);
		tf=newTextField();
		tf.SetEditable(false);
		tf.SetBackground(color.White);
		tf.Bounds(150,50,190,50);
		jf.add(tf);
		jf.SetDefaultCloseOperation(WINDOWCONSTANT.EXIT_ON_CLOSE);
		jf.SetVisible(true);
		jfc=new JFilechooser();
		Jb1.addActionListener(this);
		Jb2.addActionListener(this);
	}

	Public voidFileTransfer (String s1)
	{
		try
		{
			dout1.WriteUTF(s1);
			dout1.flush();
			s2.f.getAbsolutePath();
			FileReader fr=new FileReader(s2);
			BufferedReader br=new BufferedReader(fr);
			String s3="";
			do{
				s3=br.readLine();
				if(s3!=null)
				{
					dout.WriteUTF(s3);
					dout.flush();
				}
			}
			while (s3!=null);
		}
	     catch(Exception e){
	     	System.out.Println(e+"shekh firoz alam");
	     }
	}

	public void ActionPerformed(ActionEvent e)
	{
			if(e.GetSource()==Jb1)
			  {
				 int x =jfc.ShowOpenDialog(null);
			  }
			if (x=jFileChosser.APPROVE_OPTION)
			Stringpath=f.getName();
			s1=f1.getName();
			tf.setText(Path +"||"+s1);
	}
	  if(e.getSource() ==Jb2)
	   {
	  	try{
	  		//s1=tf.getText();
	  		s=new Socket("localhost",10);
	  		//s=newSocket("54.213.45.143",10);
	  		dout1=new DataOutputStream(s.getOutputStream);
	  		dout=new DataOutputStream(s.getOutputStream());
	  	}
	  	catch(Exception e){
	  		System.out.println("Send bUtton;"+E);
	  	}
	  	fileTransfer(s1);
	  }

	  public static void main(String k[])
	  {
	  	FileTransfer ft =new FileTransfer();
	  }
}
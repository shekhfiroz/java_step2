import java.util.concurrent.CountDownLatch;

public class HrManager{
  public static void main(String args[])
	 {
	 	try{
	 CountDownLatch cdl=new CountDownLatch(3);
	 TechLead2 techLead1=new TechLead2(cdl,"Amit");
	 TechLead1 techLead2=new TechLead1(cdl,"Dinesh");
	 TechLead techLead3=new TechLead(cdl,"Sachin");

	 techLead1.start();
	 techLead2.start();
	 techLead3.start();

	 
	 	System.out.println("Hr Manager waiting for result to Complete");
	 	cdl.await();
	 	System.out.println("Distrubuted the offer letter");
	 }

	 catch (InterruptedException e){
	 	e.printStackTrace();
	 }
   }
 }

class TechLead extends Thread
{
	CountDownLatch cdl;
	public TechLead(CountDownLatch cdl,String name)
	{
		super(name);
		this.cdl=cdl;
	}

	@Override
	 public void run()
	 {
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +"\n recurited");
		cdl.countDown();
	}
}
class TechLead1 extends Thread
{
	CountDownLatch cdl;
	public TechLead1(CountDownLatch cdl,String name)
	{
		super(name);
		this.cdl=cdl;
	}

	@Override
	 public void run()
	 {
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +"recurited");
		cdl.countDown();
	}
}

class TechLead2 extends Thread
{
	CountDownLatch cdl;
	public TechLead2(CountDownLatch cdl,String name)
	{
		super(name);
		this.cdl=cdl;
	}

	@Override
	 public void run()
	 {
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +"recurited");
		cdl.countDown();
	}
}



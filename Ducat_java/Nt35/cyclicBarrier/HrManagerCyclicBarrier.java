import java.util.concurrent.CyclicBarrier;

public class HrManagerCyclicBarrier
  {
	 public static void main(String args[])
	  {
	   CyclicBarrier cyclicBarrier= new CyclicBarrier(3);

	    TechLeads techlead1 = new TechLeads(cyclicBarrier,"Lalu");
	    TechLeads techlead2 = new TechLeads(cyclicBarrier,"Rabari");
	    TechLeads techlead3 = new TechLeads(cyclicBarrier,"Meesa");

	     techlead1.start();
	     techlead2.start();
	     techlead3.start();
         
         System.out.println("No Work for HR manager");
	}
}

class TechLeads extends Thread{
	CyclicBarrier cyclicBarrier;

	public TechLeads(CyclicBarrier cyclicBarrier,String name)
	{
	super(name);
	this.cyclicBarrier=cyclicBarrier;
	}
	@Override
	public void run(){
		try{
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"Recurited Developer");
			System.out.println(Thread.currentThread().getName()+"Waiting for other to Recurited Developer");

			cyclicBarrier.await();

			System.out.println("All finished Recuritment"+Thread.currentThread().getName()+"Offer Letter givenn to candidate");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
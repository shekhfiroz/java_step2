class Thread3 implements Runnable
{

	int x;

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " " + x);
			try{
				Thread.sleep(5000);
			}
			catch (Exception e){}
		}
	}
}
class RunThread3 {
	public static void main(String s[])
	{
		Thread3 t1=new Thread3();
		t1.x=1000;
		Thread tt1=new Thread(t1,"thread1");
		tt1.start();

		Thread3 t2=new Thread3();
		t2.x=2000;
		Thread tt2 =new Thread(t2,"thread2");
		tt2.start();

		Thread3 t3=new Thread3();
		t3.x=3000;
		Thread tt3 =new Thread(t3,"thread3");
		tt3.start();

		 for(int i=1;i<=5;i++)
		 {
		   System.out.println(Thread.currentThread().getName());
		 try
		  {
		 	Thread.sleep(3000);
		 }

		 catch (Exception e){}
		}
	}
}
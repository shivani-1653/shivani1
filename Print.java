 class Print
 {
 	synchronized  void print(String a)
 	{
 	System.out.println("[ " + a + " ]");
 	try
 	{
 	Thread.sleep(1000);
 	}
 	catch(InterruptedException ie)
 	{
 	System.out.println("Interrupted");
 	}
 	}
 	}
    class Thread1 extends Thread
   {
    Print t;
    Thread1(Print t)
    {
    this.t= t;
    }
    public void run()
    {
    t.print("Learn");
    }
   }
    class Thread2 extends Thread
    {
    Print t;
    Thread2(Print t)
    {
    this.t=t;
    }
    public void run()
    {
    t.print("Java");
    }
    }
    class Thread3 extends Thread
    {
    Print t;
    Thread3(Print t)
    {
    this.t =t;
    }
    public void run()
    {
    t.print("Programming");
    }
    }
    class Sync
    {
    public static void main(String args[])
    {
    Print p= new Print();
    Thread t1=new Thread1(p);
    Thread t2=new Thread2(p);
    Thread t3=new Thread3(p);
    t1.start();
    t2.start();
    t3.start();
    }
   }
    
 	

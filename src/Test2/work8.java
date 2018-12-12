package Test2;

public class work8 {
	
	    public void testMethod(Object lock)
	    {
	        try
	        {
	            synchronized (lock)
	            {
	                System.out.println("Begin wait()");
	                //lock.wait();
	                
	                System.out.println("End wait()");
	                while(true) {}
	            }
	        }
	        catch (Exception e)
	        {
	            System.out.println("wait()被interrupt()打断了！");
	            e.printStackTrace();
	        }
	    }
	    
	    public static void main(String[] args) throws Exception
	    {
	        Object lock = new Object();
	        MyThread33 mt = new MyThread33(lock);
	        mt.start();
	        Thread.sleep(2000);
	        mt.interrupt();
	        Thread.sleep(1000);
	        System.out.println(mt.isInterrupted());
	        Thread.sleep(2000);
	        //mt.interrupted();
	        Thread.sleep(1000);
	       // System.out.println(mt.isInterrupted());
	        System.out.println(mt.interrupted());
	    }
}

 class MyThread33 extends Thread
{
    private Object lock;
    
    public MyThread33(Object lock)
    {
        this.lock = lock;
    }
    
    public void run()
    {
        work8 td = new work8();
        td.testMethod(lock);
    }
}

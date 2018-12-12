package Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class work {
	public static void main(String[] args) throws Exception
	{
	    final ThreadDomain42 td = new ThreadDomain42();
	    Runnable runnable = new Runnable()
	    {
	        public void run()
	        {
	            System.out.println("◆线程" + Thread.currentThread().getName() + "运行了");
	            td.testMethod();
	            
	        }
	    };
	    Thread[] threads = new Thread[5];
	    for (int i = 0; i < 5; i++)
	        threads[i] = new Thread(runnable);
	    for (int i = 0; i < 5; i++)
	        threads[i].start();
	}
}
 class ThreadDomain42
{
    private Lock lock = new ReentrantLock(true);
    
    public void testMethod()
    {
        try
        {
            lock.lock();
            System.out.println("ThreadName" + Thread.currentThread().getName() + "获得锁");
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        finally
        {
            lock.unlock();
        }
    }
}
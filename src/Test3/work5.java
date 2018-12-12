package Test3;

import java.util.concurrent.locks.ReentrantLock;

public class work5 extends ReentrantLock{
	 public void waitMethod()
	    {
	        if (tryLock()) {
	            System.out.println(Thread.currentThread().getName() + "获得了锁");
	            unlock();
	        }else {
	        	lock();
	            System.out.println(Thread.currentThread().getName() + "没有获得锁");
	        }
	    }
	 public static void main(String[] args) throws InterruptedException
	 {
	     final work5 td = new work5();
	     Runnable runnable = new Runnable()
	     {
	         public void run()
	         {
	             td.waitMethod();
	         }
	     };
	     Thread t0 = new Thread(runnable);
	     Thread t1 = new Thread(runnable);
	     t0.start();
	     Thread.sleep(2000);
	     t1.start();
	 }
}

package Test2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.plaf.SliderUI;

public class ThreadDomain29
{
    public static AtomicInteger aiRef = new AtomicInteger();
    Lock lock = new ReentrantLock();
    public void addNum()
    {
        System.out.println(Thread.currentThread().getName() + "加了100之后的结果：" + 
                aiRef.addAndGet(100));
        aiRef.getAndAdd(1);
    }
    
    public void method1() throws InterruptedException {
    	lock.lock(); 
    	System.out.println(1111);
    	Thread.sleep(1000);
    	System.out.println(2222);
    	Thread.sleep(1000);
    	System.out.println(3333);
    	Thread.sleep(1000);
    	System.out.println(4444);
    	Thread.sleep(1000);
    	lock.unlock();
    }
    
    public void method2() throws InterruptedException {
    	lock.lock(); 
    	System.out.println(5555);
    	Thread.sleep(1000);
    	System.out.println(6666);
    	Thread.sleep(1000);
    	System.out.println(7777);
    	Thread.sleep(1000);
    	System.out.println(8888);
    	Thread.sleep(1000);
    	lock.unlock();
    }
    
    public static void main(String[] args)
    {
        try
        {
            ThreadDomain29 td = new ThreadDomain29();
            MyThread28 a = new MyThread28(td);
            MyThread29 b = new MyThread29(td);
            a.start();
            b.start();
            /*MyThread29[] mt = new MyThread29[5];
            for (int i = 0; i < mt.length; i++)
            {
                mt[i] = new MyThread29(td);
            }
            for (int i = 0; i < mt.length; i++)
            {
                mt[i].start();
            }
            Thread.sleep(1000);
            System.out.println(ThreadDomain29.aiRef.get());*/
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


 class MyThread29 extends Thread
{
    private ThreadDomain29 td;
    
    public MyThread29(ThreadDomain29 td)
    {
        this.td = td;
    }
    
    public void run()
    {
       // td.addNum();
    	try {
			td.method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

 class MyThread28 extends Thread
 {
     private ThreadDomain29 td;
     
     public MyThread28(ThreadDomain29 td)
     {
         this.td = td;
     }
     
     public void run()
     {
         //td.addNum();
    	 try {
			td.method2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
 }

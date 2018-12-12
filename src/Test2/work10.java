package Test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class work10 {
	public static void main(String[] args)
	{
	    final ThreadDomain41 td = new ThreadDomain41();
	    Runnable producerRunnable = new Runnable()
	    {
	        public void run()
	        {
	            for (int i = 0; i < Integer.MAX_VALUE; i++)
	                td.set();
	        }
	    };
	    Runnable customerRunnable = new Runnable()
	    {
	        public void run()
	        {
	            for (int i = 0; i < Integer.MAX_VALUE; i++)
	                td.get();
	        }
	    };
	    Thread ProducerThread = new Thread(producerRunnable);
	    Thread ProducerThread2 = new Thread(producerRunnable);
	    ProducerThread.setName("Producer1");
	    ProducerThread2.setName("Producer2");
	    Thread ConsumerThread = new Thread(customerRunnable);
	    ConsumerThread.setName("Consumer");
	    ProducerThread.start();
	    ConsumerThread.start();
	    ProducerThread2.start();
	}
}

 class ThreadDomain41 extends ReentrantLock
{
    private Condition condition = newCondition();
    
    public void set()
    {
        try
        {
            lock();
            while (!"".equals(ValueObject.value))
                condition.await();
            ValueObject.value = "123";
            System.out.println(Thread.currentThread().getName() + "生产了value, value的当前值是" + ValueObject.value);
            condition.signal();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            unlock();
        }
    }
    
    public void get()
    {
        try
        {
            lock();
            while ("".equals(ValueObject.value))
                condition.await();
            ValueObject.value = "";
            System.out.println(Thread.currentThread().getName() + "消费了value, value的当前值是" + ValueObject.value);
            condition.signal();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            unlock();
        }
    }
}

package Test2;

public class work9 {
	public static void main(String[] args) throws Exception
	{
	    Object lock = new Object();
	    final Producer producer = new Producer(lock);
	    final Customer customer = new Customer(lock);
	    Runnable producerRunnable = new Runnable()
	    {
	        public void run()
	        {
	            while (true)
	            {
	                producer.setValue();
	            }
	        }
	    };
	    Runnable customerRunnable = new Runnable()
	    {
	        public void run()
	        {
	            while (true)
	            {
	                customer.getValue();
	            }
	        }
	    };
	    Thread producerThread = new Thread(producerRunnable);
	    Thread producerThread2 = new Thread(producerRunnable);
	    Thread producerThread3 = new Thread(producerRunnable);
	    Thread producerThread4 = new Thread(producerRunnable);
	    Thread CustomerThread = new Thread(customerRunnable);
	    producerThread.start();
	    //Thread.currentThread().sleep(1000);
	    CustomerThread.start();
	    //Thread.currentThread().sleep(1000);
	   // Thread.currentThread().sleep(1000);
	   // Thread.currentThread().sleep(1000);
	    producerThread4.start();
	}
}
 class ValueObject
{
    public static String value = "";
}

 class Producer
{
    private Object lock;
    
    public Producer(Object lock)
    {
        this.lock = lock;
    }
    
    public void setValue()
    {
        try
        {
            synchronized (lock)
            {
                while (!ValueObject.value.equals("")) {
                	System.out.println(Thread.currentThread().getName()+"_wait");
                	lock.wait();
                }
                    
               // Thread.sleep(2000);
                String value = Thread.currentThread().getName()+System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("Set的值是：" + value);
                ValueObject.value = value;
                lock.notify();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Customer
{
    private Object lock;
    
    public Customer(Object lock)
    {
        this.lock = lock;
    }
    
    public void getValue()
    {
        try
        {
            synchronized (lock)
            {
                while (ValueObject.value.equals("")) {
                	System.out.println(Thread.currentThread().getName()+"_wait_cus");
                	lock.wait();
                }
                    
                //Thread.sleep(2000);
                System.out.println("Get的值是：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

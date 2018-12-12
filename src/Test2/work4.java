package Test2;

public class work4 implements Runnable{
    static int i=0;
    static work4 instance = new work4();
    public synchronized void increase(){
        i++;
    }
    @Override
    public void run() {
    	synchronized(this) {
    		try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		for(int j=0;j<1000000;j++){
                increase();
            }
    	}
        
    }
    public static void main(String[] args) throws InterruptedException {
        //new新实例
    	work4 w = new work4();
    	w.wait();
        Thread t1=new Thread(w);
        //new新实例
        Thread t2=new Thread(w);
        t1.start();
        t2.start();
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
}


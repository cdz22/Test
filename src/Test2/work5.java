package Test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class work5 {
	static AtomicInteger i1 = new AtomicInteger(0);
	static long i2 = 0;
	public work5() {
		
	}
	public static void main(String[] args) {
		/*long a = System.currentTimeMillis();
		work5 w = new work5();
		ExecutorService executorService = Executors.newFixedThreadPool(10000);
		for(int i=0;i<=10000;i++) {
			executorService.submit(new runa(w));
		}
		executorService.shutdown();
		while(true) {
			if(executorService.isTerminated()) {
				break;
			}
			
		}
		System.out.println(System.currentTimeMillis()-a);*/
		work5 w = new work5();
		for (int i = 0; i < 10000; i++) {
			new Thread(new runa(w)).start();
		}
		
	}
	
	public void b() {
		//AtomicInteger i1 = new AtomicInteger(0);
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i1.incrementAndGet());
		}
	}
	
	public synchronized void a() {
		//int i2 =0;
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i2);
			i2++;
		}
	}
	
}

class runa implements Runnable{
	private work5 instance;
	public runa (work5 instance) {
		this.instance = instance;
	}
	@Override
	public void run() {
		instance.a();
	}
}

class runb implements Runnable{
	private work5 instance;
	public runb(work5 instance) {
		this.instance = instance;
	}
	@Override
	public void run() {
		instance.b();
	}
}

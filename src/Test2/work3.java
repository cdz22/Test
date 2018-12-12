package Test2;

import javax.net.ssl.SSLContext;

public class work3 {
	private String a ="1111";
	volatile Integer[] xxx = {1,2,3,4,5};
	volatile int xx = 0;
	int i ;
	int j ;
	public void a() throws Exception {
		synchronized(a) {
			
			System.out.println(Thread.currentThread().getName()+":11111");
			Thread.sleep(2000);
		}
		
		
	}
	public void b() throws Exception{
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+":33333");
			Thread.sleep(2000);
		}
	}
	public void c() throws Exception{
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+":44444");
			Thread.sleep(2000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		work3 w = new work3();
		th6 t = new th6(w);
		//t.setDaemon(true);
		th5 t2 = new th5(w);
		th5 t3 = new th5(w);
		t2.start();
		Thread.sleep(1000);
		t.start();
		//t.start();
		//Thread.sleep(5000);
		//System.out.println("xxxxxxxxxxxxxxxxxxx");
		/*
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		*/
	}
	
	
}

class th extends Thread{
	@Override
	public void run() {
		
		while(true) {
			System.out.println(1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class th2 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class th3 extends Thread{
	static {
		System.out.println("static");
		System.out.println(Thread.currentThread().getName());
	}
	public th3() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(this.getName());
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(this.getName());
		synchronized(this) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(this.getName());
		}
	}
}

class th4 extends Thread{
	
	private work3 w ;
	public th4(work3 w) {
		this.w = w;
	}
	@Override
	public void run() {
		
			try {
				
				//w.a();
				synchronized (Integer.class) {
					System.out.println(Thread.currentThread().getName()+":33333");
					Thread.sleep(2000);
				}
				//Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

class th5 extends Thread{
	private work3 w ;
	public th5(work3 w) {
		this.w = w;
	}
	@Override
	public void run() {
		w.i =10;
		
	}
}
class th6 extends Thread{
	private work3 w ;
	public th6(work3 w) {
		this.w = w;
	}
	@Override
	public void run() {
		w.j=w.i;
		System.out.println(w.j);
	}
}
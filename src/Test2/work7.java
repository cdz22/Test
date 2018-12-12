package Test2;

import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class work7 {
	public static void main(String[] args) {
		BlockingQueue<Integer> xx = new SynchronousQueue<>();
		BlockingQueue<Integer> xxx = new ArrayBlockingQueue<>(10);
		ReadWriteLock x= new ReentrantReadWriteLock(); 
		AtomicInteger i = new AtomicInteger(0);
		ThreadLocal<Integer>a = new ThreadLocal<>();
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		i.incrementAndGet();
	}
}

package Test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import com.alibaba.fastjson.JSONObject;

public class work1 {
	public static void main(String[] args) {
		Integer a = 4564;
		String x = Integer.toHexString(a);
		System.out.println(x);
		System.out.println(0xffff);
		//Integer serial_1st = data.getInteger("serial_first");
		//Integer serial_2nd = data.getInteger("serial_second");
		//Integer serial_3th = data.getInteger("serial_third");
		//String serial_1 = Integer.toHexString(serial_1st);
		//String serial_2 = Integer.toHexString(serial_2nd);
		//String serial_3 = "7894";
		//String.format("%06s", serial_1);
		//String.format("%06s", serial_2);
		//String.format("%06s", serial_3);
		//System.out.println(serial_3);
		String ww = "111";
		System.out.println(ww+="222");
		ww = ww.substring(0,0);
		System.out.println(ww);
		JSONObject ob = new JSONObject();
		//int tt= ob.getInteger("xxx");
		//System.out.println(tt);
		String xxx = "1111";
		String dd= xxx.substring(0, 2);
		System.out.println(xxx);
		System.out.println(dd);
		Class<AtomicInteger> c =AtomicInteger.class;
		ReentrantLock cxx = new ReentrantLock();
		cxx.lock();
		cxx.unlock();
		ConcurrentHashMap axx= new ConcurrentHashMap<>();
		Integer ax = new Integer(1);
		ax=2;
		Integer i1 = 1;
		Integer i2= 1;
		System.out.println(i1.toString()==i2.toString());
		Scanner sc = new Scanner(System.in);
		String bl="1";
		System.out.println(Boolean.valueOf(bl));
		ax tt = new ax();
		
		work1 w = null;
		w =new work1();
		
	}
}

class ax{
	private Integer xx;

	public Integer getXx() {
		return xx;
	}

	public void setXx(Integer xx) {
		this.xx = xx;
	}
	
}
package Test3;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.ReferenceCodec;

public class work3<T> {
	T t;
	public void a() {
		List<?> l= new ArrayList();
		Iterable<?> it = (Iterable<?>) l.iterator();
		
	}
	public T b(T t) {
		this.t=t;
		return t;
	}
	public static void main(String[] args) throws ParseException {
		String a = "14213_asd.sda";
		a= a.substring(0, a.lastIndexOf("_"));
		System.out.println(a);
		Object x = new Object();
		
		WeakReference<Object> ss =new WeakReference<Object>(x);
		SoftReference<Object> s = new SoftReference<Object>(x);
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String sx = sd.format(date);
		System.out.println(sx);
		SimpleDateFormat sd2 = new SimpleDateFormat("YYYY-MM-DD HH:mm:SS");
		System.out.println(sd2.format(new Date()));
		work3<?> w= new work3<>();
		sx.hashCode();
		System.out.println(x.hashCode());
		//sx.equals(anObject)
		int i = 1;
		System.out.println(sx.hashCode());
		HashMap xx = new HashMap<>();
		System.out.println(xx.hashCode());
		
		
	}
		
}

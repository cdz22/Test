package Test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.collections.list.SynchronizedList;
import org.omg.CORBA.CurrentHolder;

public class work1 {
	public static void main(String[] args) {
		Integer x = 1;
		StringBuilder xx  = new StringBuilder("xx");
		String p = xx.toString().intern();
		String o = xx.toString().intern();
		char[] a = {'x','x'};
		//ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("")));
		String d = new String(a,0,2).intern();
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		System.out.println(l.clone());
		String t = "xx";
		String f = new String(a,0,2).intern();
		Map xxx = new TreeMap();
		
		Map<String, String> c= new ConcurrentHashMap<>();
		Object ox = new Object();
		ox = (Object)d;
		ox=d;
		c.put(null, "111");
	
		System.out.println(d==f);
		
	
	}
}

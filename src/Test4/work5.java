package Test4;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class work5 {
	public static void main(String[] args) {
		Object a = new Date();
		System.out.println(a);
		Integer b = 1;
		Integer c = 1;
		Double d = 1.0;
		Double e = 1.0;
		System.out.println(b==c);
		System.out.println(d==e);
		List< Integer> aa = new ArrayList<>();
		List<Integer>  aa2  = new LinkedList<>();
		Iterator<Integer> bb2 = aa2.iterator();
		Iterator<Integer> bb = aa.iterator();
		 Map<String, String> map = new HashMap<>();
	        map.put("a", "1");
	        map.put("a", "2");
	        map.put("a", "3");
	        System.out.println(map.size()); //1

	        Map<String, String> hashMap = new HashMap<>();
	        hashMap.put(new String("a"), "1");
	        hashMap.put(new String("a"), "2");
	        hashMap.put(new String("a"), "3");
	        System.out.println(hashMap.size()); //1

	        Map<Integer, String> hashMap2 = new HashMap<>();
	        hashMap2.put(new Integer(200), "1");
	        hashMap2.put(new Integer(200), "2");
	        hashMap2.put(new Integer(200), "3");
	        System.out.println(hashMap2.size()); //1
	        Object o = 316;
	        String  x =((int)o/10.0)+"";
	        
	      System.out.println(x);

	}
}	

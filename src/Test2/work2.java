package Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class work2 {
	public static Map<Object, Object> map = new HashMap<Object, Object>();
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		//a.set(2, 4);
		//a.add(2, 4);
		for(int i:a) {
			System.out.println(i);
		}
		List<Integer> b = new LinkedList<>();
		System.out.println(1<2?"y":"n");
		List<Integer> list  = new ArrayList<>();
		
		for(int i=0;i<1000000;i++) {
			Object a1 = new Object();
			Object b1 = new Object();
			map.put(a1, b1);
			a1=null;
			b1=null;
		}
	}
	
}

package Test1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

public class Io {
	public static void main(String[] args) {
		File path = new File(".");
		String[] p = path.list();
		for(String str: p) {
			System.out.println(str);
		}
		int[] a = new int[]{1,2,3};
		System.out.println(a);
		char cc = 97;
		System.out.println(cc);
		int bb = 97;
		int i;
		for(i=0;i<5;i++) {
			if(i==2) {
				break;
			}
		}
		System.out.println(i);
		Object oj = new ax();
		ax Ax = new ax();
		Io io = new Io();
		io.xx((ax)oj);
		io.xx(Ax);
		System.out.println(Ax.a);
		Object o = new ax();
		String li ="22";
		String li2= "22";
		System.out.println(li==li2);
		List<Integer> list = new CopyOnWriteArrayList<>();
		java.util.List<Integer> aaaa = new ArrayList<>();
		
		aaaa.add(1);
		aaaa.add(2);
		int x=0;
		System.out.println("!1111111");
		ListIterator<Integer> it1 = aaaa.listIterator();
		Iterator<Integer> it2 = aaaa.iterator();
		while(it1.hasNext()) {
			if((it1.next())==1) {
				it1.add(3);
			}
		}
		ListIterator<Integer> it3 = aaaa.listIterator();
		while(it3.hasNext()) {
			
			System.out.println(it3.next());
		}
	}
	
	public void xx(ax a) {
		a.a=2;
	}
}
class ax{
	int a =1;
}
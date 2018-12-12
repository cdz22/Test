package Test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Wildcards {
		
	public static void main(String[] args) {
		
		System.out.println(ConstClass.HELLOWORLD);// 调用类常量
		List<String> zz = new ArrayList<String>();
		List<Integer> vv = new ArrayList<Integer>();
		Class cc = zz.getClass();
		System.out.println(cc);
		List<String>[] ls = new ArrayList[10]; 
		b B = new b();
		B.xx(zz);
		a A = new a();
		a A2 = new a();
		A2 =(a<? extends Number>) A.xxx();
		Set<Integer> xx = new HashSet<Integer>();
		boolean a = xx.add(1);
		System.out.println(a);
		a= xx.add(1);
		System.out.println(a);
		xx.add(2);
		xx.add(4);
		xx.add(3);
		System.out.println(xx.size());
		System.out.println(xx);
		
	}
}

class a<T>{
	private T t;
	private a<?> A;
	public T m1() {
		return t;
	}
	public a<?> xxx(){
		return A;
	}
}

class b{
	a A = new a();
			
	
	
	public <T> void xx(List<?> l) {
		
	}
	public a<? extends Number> xxxx() {
		return (a<? extends Number>) A.xxx();
	}
}

class ConstClass {
    static {
        System.out.println("ConstClass init");
    }
    public static final String HELLOWORLD = "hello world";
}

package Test3;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class work4 {
	public static void main(String[] args) throws Exception {
		System.out.println("===========操作系统是:"+System.getProperties().getProperty("os.name").toLowerCase().startsWith("windows"));
		Process process = Runtime.getRuntime().exec(new String[] {"wmic", "cpu", "get", "ProcessorId"});
		process.getOutputStream().close();
		
		Scanner sc = new Scanner(process.getInputStream());
		String property = sc.next();
		String serial = sc.next();
		System.out.println(serial);
		serial="ID: F1 06 04 00 FF FB 8B 0F";
		serial=serial.substring(serial.indexOf(":")+1).replace(" ", "");
		System.out.println(serial);
		sc.close();
		ClassLoader xx = new ClassLoader() {
		};
		Integer tt = new Integer(1);
		Class c1 = tt.getClass();
		System.out.println(c1.getName());
		Class c2 = Class.forName("Test3.work3");
		Constructor cc = c2.getConstructor();
		Object obj = cc.newInstance();
		Method m = c2.getMethod("a");
		m.invoke(obj);
	}
}

package Test4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy {
	public static void main(String[] args) {
		MeI mi = new Me();
		MeI me = (MeI)java.lang.reflect.Proxy.newProxyInstance(MeI.class.getClassLoader(),
				new Class[]{MeI.class}, new MeHandle(mi));
		me.method();
	}
	
}

interface MeI{
	public void method() ;
}
class Me implements MeI{
	
	public Me() {
		
	}
	
	public void method() {
		System.out.println("this is me");
	}
}
class MeHandle implements InvocationHandler{
	Object obj = new Object();
	public MeHandle(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		Object result = method.invoke(obj, args);
		System.out.println("after");
		return result;
	}
}
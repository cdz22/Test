package Test2;

public class work_c {
	public static void main(String[] args) {
		b B = new b();
		B.b1();
	}
}
class a {
	
	void a1() {
		System.out.println("aaaaa");
	}
	
	void a2() {
		a1();
	}
}
class b extends a{
	void b1() {
		a2();
	}
	void  a1() {
		System.out.println("bbbbb");
	}
}
package Test4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class work2 {
	public static void main(String[] args)
	{
	    Map<Integer, Integer> m = new HashMap<>();
	    String roadName = "上海市 上海市 长宁区 天山路/娄山关路 交叉口西南侧";
	    System.out.println(roadName.substring(roadName.indexOf(" ",4)).trim());
	   System.out.println(Integer.toBinaryString(new Object().hashCode()) );
	   int[] i = {1,2,3,4};
	   int[] i2 = i;
	   i2[2]=5;
	   for(int x:i) {
		   System.out.println(x);  
	   }
	   a A = new a(2);
	   a B = A;
	   B.set(3);
	   System.out.println(A.get());
	}
}
class a{
	int i=1;
	public a(int i) {
		this.i = i;
	}
	public int get(){
		return i;
	}
	public void set(int i){
		this.i = i;
	}
}
package Test4;

import com.sun.java_cup.internal.runtime.Scanner;

public class work4 {
	 public static void recursionHanoi(int n,char A,char B,char C){
	        if(n == 1){
	            System.out.print(A+"——>"+C+"\n");    
	        }
	        else{
	            recursionHanoi(n-1,A,C,B);         //使用递归先把A塔最上面的n-1个盘子移动到B塔上，C为过渡塔
	            System.out.print(A+"——>"+C+"\n");       //把A塔中底下最大的圆盘，移动到C塔上
	            recursionHanoi(n-1,B,A,C);         //使用递归把B塔上n-1个盘子移动到C塔上，A为过渡塔
	        }
	    }

	   public static void main(String[] args){
	        System.out.println("请输入盘子总数n:");
	            
	        recursionHanoi(4,'A','B','C');    
	    }
}

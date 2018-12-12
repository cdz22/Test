package Test2;

import java.lang.annotation.Native;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class work_b {
	private static Timer timer = new Timer();
    
	static public class MyTask extends TimerTask
	{
	    public void run()
	    {	
	    	timer.cancel();
	    	this.cancel();
	        System.out.println("运行了！时间为：" + new Date());
	    }
	}
	    
	public static void main(String[] args) throws Exception
	{
	    MyTask task = new MyTask();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = "2018-7-23 10:58:30";
	    Date dateRef = sdf.parse(dateString);
	    System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
	    timer.schedule(task, dateRef);
	}
}

package Test3;

public class work2 {
	public static void main(String[] args)
	{
	    try
	    {
	    	Test t = new Test();
	        t.start();
	        Thread.sleep(2000);
	        t.setRunning(false);
	        System.out.println("已赋值为false");
	    }
	    catch (InterruptedException e)
	    {
	        e.printStackTrace();
	    }
	}
}
class Test extends Thread
{
     private  volatile boolean[] isRunning = new boolean[10];
     
     public Test(){
    	 isRunning[0]=true;
     }
     
    public void setRunning(boolean isRunning)
    {
        this.isRunning[0]=isRunning; 
        
    }
    
    public void run()
    {
        System.out.println("进入run了");
        while (isRunning[0]== true){};
        System.out.println("线程被停止了");
    }
}
 class a{
	 private boolean i =true;

	public boolean getI() {
		return i;
	}

	public void setI(boolean i) {
		this.i = i;
	}
	 
 }
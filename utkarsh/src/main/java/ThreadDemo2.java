
public class ThreadDemo2 {
	
	
	synchronized void threadFunction(String threadName)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(threadName);
			/*
			 * try { Thread.sleep(500); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
		
	}

	public static void main(String[] args) {
		
		Mythreadt1 t1=new Mythreadt1();
		Mythreadt2 t2=new Mythreadt2();
		t1.start();
		t2.start();

	}

}

class Mythreadt1 extends Thread
{
	@Override
	public void run() {
		ThreadDemo2 obj=new ThreadDemo2();
		obj.threadFunction("t1");
	}
}
class Mythreadt2 extends Thread
{
	@Override
	public void run() {
		ThreadDemo2 obj=new ThreadDemo2();
		obj.threadFunction("t2");
	}
}



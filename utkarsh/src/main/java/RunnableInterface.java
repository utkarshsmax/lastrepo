class hi implements Runnable
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
class hello implements Runnable
{
	@Override
	public void run() {
		for(int j=1;j<=5;j++)
			System.out.println("hello");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		Runnable i=new hi();
		Runnable j=new hello();
		Thread t1=new Thread(i);
		Thread t2=new Thread(j);
		t1.start();
		t2.start();

	}

}

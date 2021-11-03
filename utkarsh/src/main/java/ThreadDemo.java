class Star extends Thread
{

	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Star");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}
class Planet extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Planet");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		Star s=new Star();
		Planet p=new Planet();
	
		s.start();
		p.start();

	}

}

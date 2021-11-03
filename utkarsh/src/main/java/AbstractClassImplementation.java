abstract class A
{
	int a=5;
	public abstract void sum();
	public void multiply()
	{
		System.out.println("Multiply");
	}
}

class B extends A
{
	public void sum()
	{
		System.out.println("Summation");
		
	}
}


public class AbstractClassImplementation {

	public static void main(String[] args) {
		
		
		A obj=new B();
		obj.sum();
		obj.multiply();
		System.out.println(obj.a);
		
	
	}

}

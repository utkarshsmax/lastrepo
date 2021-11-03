@FunctionalInterface
interface FunctionalInterface1
{
	int meth1(int a);
	
}

interface Anonymous
{
	int anum(int a);
}

class AnonymousforClass
{
	public void show()
	{
		System.out.println("This is a simple method");
	}
}
public class FunctionalInterfaceAndLambdaExpression{
	
	public static void main(String[] args) {
		
		Anonymous obj=new Anonymous() {
			
			@Override
			public int anum(int a) {
				
				return a*a*a;
			}
		};
		
		AnonymousforClass obj1=new AnonymousforClass()
				{
			@Override
			public void show() {
				System.out.println("This is A Anonymous Class");
				
			}
				};

		FunctionalInterface1 f2=(int x)-> x*x;

		obj1.show();
		System.out.println(obj.anum(5));
		int c=f2.meth1(5);
		System.out.println(c);

	

	
	

	}

}

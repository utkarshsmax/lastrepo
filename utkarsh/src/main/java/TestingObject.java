
public class TestingObject {
	
	int a,b;
	
	public TestingObject() {
	
		a=5;
		b=5;
	}

	public static void main(String[] args) {
		int c=9;

	ObjectCreation obj=new ObjectCreation();
	obj.sum();
	}
	
	
	
	
}

class ObjectCreation
{
TestingObject t=new TestingObject();

void sum()
{
	System.out.println(t.a+t.b);
}

} 


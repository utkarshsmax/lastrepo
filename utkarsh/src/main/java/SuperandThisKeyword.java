



class Parent 
{

	
public Parent() {
	System.out.println("Parent Class Constructor Called");
}	
	
}

public class SuperandThisKeyword extends Parent{
	
	public SuperandThisKeyword() {
		this(5);
		System.out.println("Default Constructor Called");
	}
	
	SuperandThisKeyword(int a)
	{
		this(5,6);
		System.out.println("Constructor with One Parameter Called");
		
	}
	
	SuperandThisKeyword(int a,int b)
	{
		System.out.println("Constructor with Two Parameter Called");
		
	}
public static void main(String[] args) {
		
	SuperandThisKeyword obj=new SuperandThisKeyword();

	}


}

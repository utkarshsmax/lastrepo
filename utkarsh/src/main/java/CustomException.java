class AgeException extends Exception
{
	public AgeException(String s) {
		System.out.println(s);
	}
	
	
	
}
public class CustomException {

	public static void main(String[] args)  {
		
	try {
		vote(12);
	} catch (AgeException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}

	}
	public static void vote(int age)throws AgeException
	{
		if(age<18)
		{
			
				throw new AgeException("Unable to Vote");
			
		
		}
		else
		{
			System.out.println("able to Vote");
		}
	}

}


public class ImplicitandExplicitConversion {

	public static void main(String[] args) {


		float a=(float)5/2;
		System.out.println(a);
		
		lop(32,31,35,90);

	}

	private static void lop(int...c) {
	
		for(int p:c)
		{
			System.out.println(p);
		}
		
	}

}

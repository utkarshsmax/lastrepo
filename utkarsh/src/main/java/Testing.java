
public class Testing {
	
	static int i=2;

	public static void main(String[] args) {


		/*
		 * int array[]=new int[i]; array[1]=66; array[2]=67;
		 * System.out.println(array[1]);
		 */

		
		Integer i=new Integer(257);
		//Short y=Short.toUnsignedInt(i);
		Byte x=i.byteValue();
		System.out.println(x);
	}

}

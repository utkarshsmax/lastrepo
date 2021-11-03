
public class GarbageCollection {

	public static void main(String[] args) {
		
		
		
		GarbageCollection g1=new GarbageCollection();
		GarbageCollection g2=new GarbageCollection();
		GarbageCollection g3=new GarbageCollection();
		GarbageCollection g4=new GarbageCollection();
		g1=null;
		g2=null;
		g3=null;
		g4=null;
		System.gc();
		
		

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collected");
		
	
		
	}

}

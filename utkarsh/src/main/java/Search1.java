
public class Search1 {
	 public static String SearchElement(int a[],int target)
	 {
		 int sum=0;
		 String s="";
		 for(int i=0; i<a.length; i++)
		 {
			for(int j=i+1; j<a.length; j++)
			{
				sum=a[i]+a[j];
				if(sum==target)
				{
					s=String.valueOf(a[i])+" "+String.valueOf(a[j]);
				}
			}
			
		 }
		return s;
		}
	 public static void main(String args[])
	 {
		 int a[]= {3,2,1,4,5};
		 int target=5;
		 System.out.println(SearchElement(a,target));
	 }

}

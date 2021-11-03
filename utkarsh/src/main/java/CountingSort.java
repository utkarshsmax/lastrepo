import java.util.Scanner;

public class CountingSort {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of array");
		int N=sc.nextInt();
		
		int ar[]=new int[N];
		String arr[]=new String[N];
		
		System.out.println("Sample Input:Fomat (Index String)");
		
		for(int i=0;i<N;i++)
		{
			int c=sc.nextInt();
			String c1=sc.next();
			
			
			
		
		}
		
		String cc[]=new String[N];
		
		cc=sort(N,arr,ar);
		
		func(N,arr);

	}

	private static void func(int n, String[] arr) {
		for(int i=0;i<n;i++)
		{
			
			
			
		}
		
	}

	private static String[] sort(int n,String[] arr,int ar[]) {
		
		//bubble sort
		int temp=0;
		String temp1="";
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(ar[j-1]>ar[j])
				{
					temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
					
					temp1=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		
		//sorted input
		
		for(int i=0;i<n;i++)
		{
			System.out.println(ar+" "+arr);
		}
		
		
		
		
		return arr;
	}

}

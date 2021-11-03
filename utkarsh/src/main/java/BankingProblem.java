import java.util.Scanner;

public class BankingProblem {

	public static void main(String[] args) {

		
		int t;
		
		int median=0;
		
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Expenditure=");
		int  n =sc.nextInt();
		
		System.out.println("Enter the Number of LookUp Days=");
		int  d =sc.nextInt();
		int expenditure[]=new int[n];

		
		System.out.println("Enter the Expenditure=");
		for(int i=0;i<n;i++)
		{
			expenditure[i]=sc.nextInt();
		}
		
		int sortedarr[]=new int[n];
		
		sortedarr=sort(expenditure,n);
		
		
		if(d%2==0)  //even
		{
			t=d/2;
			median=(sortedarr[t-1]+sortedarr[t])/2;
		}
		
		else    //odd
		{
			t=d/2;
			
			median=sortedarr[t];
		}
		
		for(int i=0;i<d;i++)
		{
			if(median>sortedarr[i])
				count++;
		}
		
		System.out.println("Number of Notification="+count);

	}

	private static int[] sort(int[] expenditure,int n) {

		int temp=0;

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(expenditure[j]>expenditure[j+1])
				{
					temp=expenditure[j];
					expenditure[j]=expenditure[j+1];
					expenditure[j+1]=temp;
				}
			}
		}
		
		return expenditure;
	}

}

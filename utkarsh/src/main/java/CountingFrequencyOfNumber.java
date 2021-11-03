import java.util.Scanner;

public class CountingFrequencyOfNumber {
	

	public static void main(String[] args) {
		int freq[]=new int[255];
		System.out.println("Enter Array");
		
		Scanner sc=new Scanner(System.in);
		char arr[]=new char[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		for(int j=0;j<arr.length;j++)
		{
			freq[arr[j]]++;
		}
		
		for(int c=0;c<freq.length;c++)
		{
			if(freq[arr[c]]>=1)
			{
				System.out.println("Frequency of "+arr[c]+" is "+freq[arr[c]]);
			}
		}

	}

}

import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
		System.out.println("Enter the String whose Frequency of each character to be calculated=");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		countFrequency(str);
	}

	private static void countFrequency(String str) {
		
		int c1[]=new int[256];
		String str1=str.toLowerCase();
		int cc[]=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			cc[str1.charAt(i)]++;
		}
		
		for(int i=0;i<str1.length();i++)
		{
			c1[str1.charAt(i)]++;
			if(c1[str1.charAt(i)]==1)
			{
			System.out.println("Frequency of "+str1.charAt(i)+" is "+cc[str1.charAt(i)]);
			}
		}
	
	}

}

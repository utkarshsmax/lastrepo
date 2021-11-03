import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountDistinctElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array=");
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();

		for(int i=0;i<n;i++)
		{
		
			int c=sc.nextInt();
			list.add(c);
		}
		
		countPrint(list);
		
	}

	private static void countPrint(List<Integer> list) {
		int count=0;
		List<Integer> distinct=new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
				
					break;
					
				}
				
			}
			distinct.add(list.get(i));
			list.remove(list.get(i));
			
			count++;
			
		}
		
	}

}

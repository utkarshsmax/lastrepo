import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListingObject {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the List of String");
		
		List<String> str=new ArrayList<String>();
		
		for(int i=0;i<5;i++)
		{
			str.add(sc.next());
		}
		
		//List<String> str1=reverseSentence(str);
		
		Collections.reverse(str);
		System.out.println("Reversed List:"+str);

	}

	private static List<String> reverseSentence(List<String> str) {


		List<String> str1=new ArrayList<String>();
		
		for(int i=str.size()-1;i>=0;i--)
		{
			str1.add(str.get(i));
		}
		return str1;
	}
	


}

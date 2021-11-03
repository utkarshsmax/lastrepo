import java.util.Scanner;

public class Student {

	public static void main(String[] args) {


		int []at=new int[3];
		int []dt=new int[3];
		int i,as=0,ds=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		for(i=0;i<3;i++)
		{
			at[i]=sc.nextInt();
			dt[i]=sc.nextInt();
			
			if(at[i]>dt[i])
			{
				as=as+1;
				System.out.println("Task :"+(i+1)+"Aniket: "+as);
			}
			
			else if(dt[i]>at[i])
			{
				ds=ds+1;
				System.out.println("Task: "+(i+1)+" Divya: "+ds);
			}
			
			
			else
			{
				System.out.println("No Score to Aniket and Divya");
			}
		}
		

	}

}

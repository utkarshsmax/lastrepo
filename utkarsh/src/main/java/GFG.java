
public class GFG {

	public static void main(String[] args) {
		int ascii=64;
		
		        String str = "jhhgsgyygy7878hidshhd6u3h7i49b8i4";
		        char[] crr=new char[str.length()];
		        for(int i=0;i<str.length();i++)
		        {
		        	char c=str.charAt(i);
		        	if(c>=65 && c<=90 || c>=97 && c<=122)
		        	{
		        		
		        		crr[i]=str.charAt(i);
		        	}
		        	else
		        	{
		        		crr[i]=' ';
		        	}
		        	
		        }
		        
		        String s1=String.valueOf(crr);
		        System.out.println(s1);
		        
		        String arr[]=s1.split(" ");
		        for(String s:arr)
		        {
		        	System.out.println(s);
		        }
		        
		     
	}

}

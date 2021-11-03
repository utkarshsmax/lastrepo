
public class ASCII {

	public static void main(String[] args) {


		String S="abcfgh";
		int l=S.length();
		char c[]=new char[l];
		int as[]=new int[l];
		String s="";
		for(int i=0;i<l;i++)
		{
			c[i]=S.charAt(i);
			as[i]=(int)c[i];
			System.out.println(as[i]);
		}
		
		for(int j=0;j<l;j++)
		{
			if(as[j]%3==0)
			{
				s=s+(char)as[j];
			}
		}
		
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder(s);
		
		
		System.out.println(sb.reverse());

	}

}

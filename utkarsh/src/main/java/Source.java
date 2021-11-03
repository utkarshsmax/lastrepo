

class Alphabet
{
	
 public int uniqueVowel(String str)
 {
	 int[] v=new int[256];
		int []c1=new int[256];
	 String str1=str.toLowerCase();
	 int count=0;
	 
	 for(int i=0;i<str1.length();i++)
	 {
		
		 
		 char ch=str1.charAt(i);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
			 v[str1.charAt(i)]++;
		 }
		 
	 }
	 
	 for(int i=0;i<str1.length();i++)
	 {
		 char ch=str1.charAt(i);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
			 c1[str1.charAt(i)]++;
			 if(c1[str1.charAt(i)]==1)
			 {
				 count++;
			 }
		 }
		 
	 }
	 
	return count;
 }
 
 public int uniqueConsonant(String str)
 {
	 int []c2=new int[256];
	 String str1=str.toLowerCase();
	 int count=0;
	 int[] co=new int[256];
	 for(int i=0;i<str.length();i++)
	 {
	 
	 char ch=str1.charAt(i);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	 {
		
		
	 }
	 
	 else
	 {
		 co[str1.charAt(i)]++;
	 }
	 
	 
	 }
	 
	 for(int i=0;i<str1.length();i++)
	 {
		 char ch=str1.charAt(i);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
			
		 }
		 
		 else
		 {
			 c2[str1.charAt(i)]++;
			 if(c2[str1.charAt(i)]==1)
			 {
				 count++;
			 }
		 }
		 
	 }
	 
	 
	
	return count;
 }
}


public class Source {

	public static void main(String[] args) {
		Alphabet obj=new Alphabet();
		System.out.println(obj.uniqueVowel("abacab"));
		System.out.println(obj.uniqueConsonant("abacab"));

	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Sort {
    int ASCII_SIZE=256;
    public char maxOccuringChar(String str){
        int count[]=new int[ASCII_SIZE];
        int len=str.length();
        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
        }
        int max=-1;
        char result=' ';
        for(int i=0;i<len;i++){
            if(max<count[str.charAt(i)]){
                max=count[str.charAt(i)];
                result=str.charAt(i);
            }
        }
        return result;
    }
 
}

public class Sourc {
	public static void main(String args[]) throws Exception {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter your String=");
		//Scanner sc=new Scanner(System.in);
		String str=br.readLine();
		Sort sort=new Sort();
		System.out.println(sort.maxOccuringChar(str));

	}
}

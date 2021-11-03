import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class onject_demo {

	public static void main(String[] args) throws Exception {


		//File f1=new File("d:/infosys.txt");
		String str=new String("I am Java Developer");
		
		/*
		 * FileOutputStream f=new FileOutputStream(f1); ObjectOutputStream o=new
		 * ObjectOutputStream(f); o.writeObject(str);
		 */
		/*
		 * FileInputStream f=new FileInputStream(f1); ObjectInputStream o=new
		 * ObjectInputStream(f); System.out.println(o.readObject());
		 */		
		/*
		 * FileWriter f=new FileWriter("d:/infosys.txt"); for(int
		 * i=0;i<str.length();i++) { f.write(str.charAt(i)+" "); }
		 * 
		 * 
		 * 
		 * 
		 * //o.close(); f.close();
		 */
		
		FileReader f=new FileReader("d:/infosys.txt");

		int c=0;

		while((c=f.read())!=-1)
		{
			System.out.println((char)c);
		}
		
		f.close();

	}

}

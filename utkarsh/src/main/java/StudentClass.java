
public class StudentClass {
	
	String name;
	int rollno;

	public static void main(String[] args) {
		
		Calling ss=new Calling("utk");
	
	}
	
	



}

class Calling
{

StudentClass s1=new StudentClass();
StudentClass s2=new StudentClass();
StudentClass s3=new StudentClass();
StudentClass s4=new StudentClass();
StudentClass s5=new StudentClass();



Calling(String str)
{
	this();
	System.out.println("Parameterized Constructor is Called");

	
}



public Calling() {

	s1.name="Neha";
	s1.rollno=101;
	s2.name="Anuradha";
	s2.rollno=102;
	s3.name="Ridhima";
	s3.rollno=103;
	s4.name="Sneha";
	s4.rollno=104;
	s5.name="Gargi";
	s5.rollno=105;
	
	System.out.println("#######Student Data########");
	System.out.println("Name:"+s1.name+" and roll no:"+s1.rollno);
	System.out.println("Name:"+s2.name+" and roll no:"+s2.rollno);
	System.out.println("Name:"+s3.name+" and roll no:"+s3.rollno);
	System.out.println("Name:"+s4.name+" and roll no:"+s4.rollno);
	System.out.println("Name:"+s5.name+" and roll no:"+s5.rollno);
	
	System.out.println(this.multiply());
}

int multiply()
{
	return 1*2;
}





}


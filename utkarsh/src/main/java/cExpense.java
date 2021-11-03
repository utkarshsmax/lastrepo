
public class cExpense {

	public static void main(String[] args) {


		float expenses=5000;
		
		
		System.out.println("Expenses in year "+2015+"is Rs:"+expenses);
		for(int i=2016;i<=2025;i++)
		{
			
			if(i<=2020)
			{
				expenses=expenses+expenses*(10)/100;
				
				System.out.println("Expenses in year "+i+"is Rs:"+expenses);
			}
			
			else if(i==2021)
			{
				
				expenses=expenses+expenses*(10)/100;
				expenses=expenses+4000;
				
				
                
				
				System.out.println("Expenses in year "+i+"is Rs:"+expenses);
			}
			
			
			else
			{
                expenses=expenses+expenses*(10)/100;
				
				System.out.println("Expenses in year "+i+"is Rs:"+expenses);
			}
			
		}

	}

}

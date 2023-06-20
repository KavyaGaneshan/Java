package method;



interface Bank
{
	
	public void deposit();
	
	public void withdraw();
	
	public void balance();  // we can add method later as well.
}



interface Creditcard 
{
	
public void creditcarddetails()	;
	
}

class SBI implements Bank, Creditcard // can implements multiple classes
{

	@Override
	public void deposit() 
	
	{
System.out.println("SBI deposit");		
	}

	@Override
	public void withdraw() 
	{
		
		System.out.println("SBI withdraw");		

	}

	@Override
	public void balance() {
	
		System.out.println("SBI balance");		

	}

	@Override
	public void creditcarddetails() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


class federal implements Bank

{

	@Override
	public void deposit() {
		System.out.println("Federal deposit");		
		
	}

	@Override
	public void withdraw() 
	
	{
		System.out.println("Federal withdraw");		
		
	}

	@Override
	public void balance() {
		System.out.println("Federal balance");		
		
	}
	
	
	
	
}




public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//SBI ob= new SBI();// instead of SBI we can use object for Bank
		//ob.balance();
		
		Bank ob= new SBI();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		
		
		
		ob= new federal();// same object can be used.
		ob.balance();
		ob.deposit();
		
		
	}

}

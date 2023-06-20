package method;

import java.util.Scanner;

interface Bank1{
	
public void showdetails();
public void deposit();
public void withdraw();
public void balance();	
}


class SBI1 implements Bank1{
	
	
	
	int bal=10000, withdraw=0,deposit=0;
   
	Scanner sc=new Scanner(System.in);

	@Override
	public void showdetails() {
		
		System.out.println("Enter the Customername, bank name and account no");

		
		String cname;
		cname=sc.next();
		
		
		String bankname;
		bankname=sc.next();
		
		int accno=0;
		accno=sc.nextInt();

		System.out.println("Bank name is " +bankname +"\n"+"Customer name is " +cname+"\n"+"account no is "+accno);
		
	}

	
		
	

	@Override
	public void deposit() 
	
	{
		
		System.out.println("\nEnter the amount to deposit");
		deposit=sc.nextInt();
		bal=deposit+bal;
		System.out.println("\nbalance amount available after deposit is ="+bal);

		
		
	}

	@Override
	public void withdraw() {
		

		System.out.println("\nEnter the amount to withdraw");

		
		withdraw=sc.nextInt();
		bal=bal-withdraw;
     	System.out.println("\nbalance amount available after withdrawal is ="+bal);
				
		
	}

	@Override
	public void balance() {
		
		System.out.println("\nbalance amount available is ="+bal);

	}
	
	
	
}



public class Bankpgmusinginterface {
	

	public static void main(String[] args) {
		

		SBI1 ob= new SBI1();
		ob.showdetails();
		ob.deposit();
		ob.withdraw();
		ob.balance();

	}

}

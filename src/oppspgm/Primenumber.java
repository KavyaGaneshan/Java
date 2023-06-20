package oppspgm;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

	int n, i, flag=0;
	
	System.out.println("Enter the number");
	
	Scanner sc=new Scanner(System.in);
	
	n=sc.nextInt();
	
	
		for(i=2;i<n;i++)
		{
			
			if((n%i)==0)
			{
				System.out.println("Number is not a prime");
				
				flag=1;
				
				break;
			}
			
		}
			 if(flag==0)
			{
				

				System.out.println("Number is  prime");
					
		}
		
	}

}

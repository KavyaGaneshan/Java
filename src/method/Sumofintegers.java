package method;

import java.util.Scanner;

public class Sumofintegers {

	public static void main(String[] args) 
	
	
	
	{

		System.out.println(" Enter the numbers");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    
		Sumofintegers obj=new Sumofintegers();
		int sum=obj.sumofintegers(n);
		
		System.out.println(sum);
		
	}
	
	
	
	public int sumofintegers(int n)
	{
		int r,s =0;

		
          while (n>0)		
          
          {
			
			 r=n%10;
			    s=s+r;
			    n=n/10;
			
		}
		return s;

	}

}

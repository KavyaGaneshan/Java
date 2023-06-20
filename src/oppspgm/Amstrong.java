package oppspgm;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		
		int n, a,b,sum=0, temp;
		
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		temp=n;
		while(n>0)
		{
			
			
		a=n%10;
		sum= sum+(a*a*a);
		n=n/10;
			
		}
		
		if(sum==temp)
		{
			
			System.out.println("Number is Amstrong");
		}
		
		else
		{
			System.out.println("Number is not an Amstrong");
		}
		

	}

}

package controlstatements;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {

		int i,n, first=0, second=1, third;
		
		System.out.println("Enter the number of terms");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		System.out.print(first+" "+second+" ");
		
		third=first+second;
		
		for(i=3;i<=n;i++)
		{
			
			System.out.print(third+" ");
			 first=second;
			 second=third;
			 third=first+second;
			 
			
		}
		
	}

}

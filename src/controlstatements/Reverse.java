package controlstatements;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
int i=0,j, k,n;

Scanner sc=new Scanner(System.in);

n=sc.nextInt();
k=n;


while(n>0)
	
{
j=n%10;
i=i*10+j;
n=n/10;

}

System.out.println("\nReversed number is "+i+"\n");

if(k==i)
{

	System.out.println("The number is a palindrome");
}

else
{

	System.out.println("\nThe number is not a palindrome");
	
}

	}

}

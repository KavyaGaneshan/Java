package controlstatements;

import java.util.Scanner;

public class Sumofoddandeven {

	public static void main(String[] args) {

		
		
 int i,even=0,odd=0,n;
 
 System.out.println("eneter the numbers other than zero");
 
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 
 for(i=n;i>0;i=i)
 {
	 
	if(i%2==0) 
	{
		
		even=even+i;
			
	}
	
	else 
	{
		
		odd=odd+i;
		
    }
		
	i=sc.nextInt();
		
 }	
			
 System.out.println("Even sum: " + even);
 System.out.println("Odd sum: " + odd);		
		
	}

}

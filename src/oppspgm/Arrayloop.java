package oppspgm;

import java.util.Scanner;

public class Arrayloop {

	public static void main(String[] args) {

		
		
		
		int a[]=new int[3];
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enetr numbers");
		
		for(int i=0;i<3;i++)
		{
			
		a[i]= sc.nextInt();	
			
		}
		
		System.out.println("Entered values are");
		
		for(int i=0;i<3;i++)
		{
			
      System.out.println(a[i]);			
		}
		
		
		
	}

}

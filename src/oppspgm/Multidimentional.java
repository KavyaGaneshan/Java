package oppspgm;

import java.util.Scanner;

public class Multidimentional {

	public static void main(String[] args) {

		System.out.println("Enter the values");

		Scanner sc= new Scanner(System.in);
		
		int  a[][]=new int [3][2];
		
		
		for(int i=0;i<3;i++)
			
				
		{
			
			for(int j=0;j<2;j++) 
			
			{
				a[i][j]= sc.nextInt();
			}
			
			
			
			
		}
		
		System.out.println("Entered values are");
		
		for(int i=0;i<3;i++)
			
			
		{
			
			for(int j=0;j<2;j++) 
			
			{
				System.out.print(a[i][j]+" ");
			}
			
			
			System.out.println();
			
		}
		
		
		
	}

}

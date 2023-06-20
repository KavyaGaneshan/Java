package oppspgm;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
      
		
		int  sum=0,avg=0;
		
		
		int a[]=new int[3];
		
		System.out.println("Enter the values");
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
			
		{
			
			a[i]= sc.nextInt();
            
			
			}
		
		for(int v:a)
		{
			
			sum= sum+v;
			
			avg=sum/3;
			
			
			
		}
		
		System.out.println("sum="+sum);
		
		System.out.println("Average="+avg);
		
	}

}

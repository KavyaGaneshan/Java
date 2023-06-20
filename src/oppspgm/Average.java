package oppspgm;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		
		
int  a, i;

float avg=0;

System.out.println("enter 10 digits");

Scanner sc=new Scanner(System.in);

	for(i=1;i<=10;i++)	
		
	{
		
	a=sc.nextInt();	
		
	avg=avg+a;
	
	}
	
	avg=avg/10;
	
	System.out.println("average is "+avg);	
		
	
		
		
	}

}

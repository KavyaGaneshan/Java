package method;

import java.util.Scanner;

public class Averageofnumbers {

	public static void main(String[] args) 
	
	
	{

		
System.out.println(" Enter 3 numbers");
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();

	    
		Averageofnumbers s=new Averageofnumbers();
		int avg=s.avgofintegers(n1,n2,n3);
		
		System.out.println(avg);
		
		
		
	}
	
	
	
	
	
	public int avgofintegers(int n1, int n2, int n3)
	{
		int avg=0;

		
          int s=n1+n2+n3;
          int result=s/3;
          return result;

	}
}

	
	
	



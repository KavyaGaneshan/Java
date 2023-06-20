package oppspgm;

import java.util.Scanner;

public class Arrayname {

	public static void main(String[] args) {

		
int size;
		
		
		System.out.println("eneter the array size");
		
		Scanner sc=new Scanner(System.in);
		
		size=sc.nextInt();
		
		String a[]=new String[size];
		
		System.out.println("Enter the names");
		
		for(int i=0;i<size;i++)
			
		{
			
			a[i]= sc.next();
			
			
		}
		
		System.out.println("Entered names are");
		
for(int i=0;i<size;i++)
			
		{
			
	System.out.println(a[i]);		
			
		}
		
		

	}

}

package method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		
	//compile time	
		
		
	FileInputStream f= new FileInputStream ("E://Book1.xlsx");
			
		
		

// runtime exception		
	try {
		
		int a=20, b=0;
		int c=a/b;
		System.out.println(c);
		
	}
	
	catch (Exception e)
	{
		
		System.out.println(e.getMessage());  // to display the exact exception
		System.out.println("Arithmetic Exception\n");

		
	}
		
		System.out.println("hello");
		
		
		
		try {
			
			int a[]= new int[2];
			a[0]=10;
			a[1]=23;
			a[3]=20;
		}
		
		catch (Exception e)
		{
			
			System.out.println(e.getMessage());
			System.out.println("array index out of bound  Exception\n");
		}
		
		
		
		try {
			
		
		String s=null;
		
		System.out.println(s.length());
	}
		
		catch (Exception e)
		{
			
			System.out.println(e.getMessage());
			System.out.println("Null pointer  Exception\n");
		}

}
}









package method;

public class Methodoverloading {

	public static void main(String[] args)
	
	
	
	{
		
	Methodoverloading ob= new 	Methodoverloading();
	ob.add();
	ob.add(10, 20);
	ob.add(30, 32.5);
	ob.add(65.4, 40);
		
		
		

	}

	
public void add()
{
	
	
int a=20, b=30,c;

c=a+b;
System.out.println(c);
	
}
	


public void add(int a, int b)
{
	
	
	int c=a+b;
	System.out.println(c);


	
}


public void add(int a, double b)
{
	
	
	double c= a+b;
	System.out.println(c);

	
}



public void add(double a, int b)
{
	
	
	double c= a+b;
	System.out.println(c);

	
}




	
}

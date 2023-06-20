package method;

public class Methodpgm {

	public static void main(String[] args) {

		Methodpgm ob=new Methodpgm();
		ob.add();
	
		System.out.println(ob.sub());
		ob.mul(10, 5);
		
		System.out.println(ob.div(55,2));

	}
	
	
	
	//without return type and parameter
	
	public void add()
	
	{
		
		int a=30, b=30;
		int c= a+b;
		
		System.out.println(c);
		
		
		
	}
	
	
	//with  return type and without parameter

	public int sub()
	{
		
	int a=60, b=40;
	 
	int c= a-b;
	return c;
		
	}
	
	
	
	
	//without  return type and with parameter
	
	public void mul(int a, int b)
	{
		
	int c=a*b;
	System.out.println(c);
		
		
	}
	
	
	//with return type and with parameter
	
	public double div(double a, double b)
	
	{
		double c=a/b;
		return c;
		
	}
	
	

}

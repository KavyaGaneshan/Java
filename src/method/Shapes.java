package method;

public class Shapes {

	public static void main(String[] args) {

	Shapes obj=new Shapes();
	obj.triangle();
	
	System.out.println("Area of the rectangle = "+ obj.rectangle(10, 15));
	
	System.out.println("Area of the circle ="+ obj.circle());
		
    obj.square(10);
	}

	//without return and parameter
	
	public void triangle()
	{
		
	int b=10, h=15;
	
	double area=0.5*b*h;
	
	System.out.println("Area of the triangle  = " +area);
		
		
	}
	
	
	//with return and without parameter
	
	public int rectangle(int a ,int b)
	
	{
		int area=a*b;
		return area;
		
		
	}
	
	
	//with return and without parameter
	
	public double circle()
	
	{
		int r=5;
		
		double area=3.14*r*r;
		return area;
		
		
	}
	
	
	//without return and with parameter
	
	public void square(int a)
	
	{
		int area=a*a;
		System.out.println("Area of square = "+area);
		
	}
	
	
	
}

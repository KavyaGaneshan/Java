package method;

public class Methodoveriding {

	public static void main(String[] args) {

		Bmw ob=new Bmw();
		
		ob.accelator();
	}
	}
	
	
	class Car
	{
		
	public void accelator()
	
	{
		
		System.out.println("accelator");
		
	}
		
	}
	
	
	class Bmw extends  Car
	{

		@Override    //overriding the parent class
		public void accelator() 
		
		
		{
			
			System.out.println("BMW accelator");

	       
			super.accelator();  // to access the methods on the parent class
		}
		
		
		
		
		
	}
	
	
	
	
	
	



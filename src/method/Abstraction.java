package method;


abstract class Cars{    // abstract class
	
	
abstract public void speedlimit(); // declaration of abstract method

public void carengine()
{
	
	
	System.out.println("car engine");
	
	
	
}	
	
}

class Maruti extends Cars  // inherit to implement the abstract method.


{

	@Override
	public void speedlimit() 
	
	{
	System.out.println("maruti speedlimit")	;
		
	}
	
	
}


public class Abstraction {

	public static void main(String[] args) {
	
		
		Maruti m= new Maruti();
		m.carengine();
		m.speedlimit();

	}

}

package method;

public class Singlelevelinheritance {

	public static void main(String[] args) {
		
		
		Dogbreed obj=new Dogbreed();
		obj.animalfood();
		obj.breed();
		
		

	}
}
	
	
	
	class Animal2
	{
		
	public void animalfood()
	
	{
		
		System.out.println("Animalfood");
		
	}
		
		
	}
	
	
	
	
	//inherit the properties of class animal
	class Dogbreed extends Animal2
	{
		
	public void breed ()
	
	{
		
	System.out.println("lab");
	}
		
		
	}
	
	
	
	
	
	



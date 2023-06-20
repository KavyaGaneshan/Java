package method;

public class Hierarchial {

	public static void main(String[] args) {
		
		
		Dog obj=new Dog();
		obj.animadetails();
		obj.dogdetails();
		
		Tiger ob=new Tiger();
		ob.animadetails();
		ob.tigerdetails();
		

	}

}


class Animal
{

	public void animadetails()
	
	{
	System.out.println("animaldetails");	
		
	}
	
	
	
}

class Dog extends Animal
{

public void dogdetails()

{
System.out.println("dog");	
	
}
}


//hierarchical  inheritance

class Tiger extends Animal
{
	
	public void tigerdetails()

	{
		
		System.out.println("tiger");
		
	}


}
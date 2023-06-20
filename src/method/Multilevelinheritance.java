package method;

public class Multilevelinheritance {

	public static void main(String[] args) {

		Babydog obj= new Babydog();
		obj.animalfood();
		obj.babydogfeatures();
		obj.breed();
		
		
	}

}


class Animal1
{
	
public void animalfood()

{
	
	System.out.println("Animalfood");
	
}
	
	
}




//inherit the properties of class animal
class Dogtype extends Animal1
{
	
public void breed ()

{
	
System.out.println("lab");
}
	
	
}

//multilevel inheritance

class Babydog extends Dogtype
{
	
	public void  babydogfeatures ()
	
	{
		
		System.out.println("babydog");
	}
	
	
}




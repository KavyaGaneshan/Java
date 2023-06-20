package method;


interface basicanimal{
	
	public void eat();
	public void sleep();
	
	
}

class Monkey {
	
	
public void jumb()

{
	System.out.println("monkey jumbs");
	
}

public void bite()

{
	System.out.println("monkey bites");
	
}

}

class Human extends Monkey implements basicanimal  {
	
public void speak ()
{
	
	System.out.println("human speaks");

}

@Override
public void eat() {

	System.out.println("Monkey eats fruits");
}

@Override
public void sleep() {
	System.out.println("Monkey sleep at night");
	
}
	
}



public class Monkeyinterfacepgm {

	public static void main(String[] args) {

		
	Human ob= new Human();
	
	ob.jumb();
	ob.bite();
	ob.eat();
	ob.sleep();
	ob.speak();
		
		
	}

}

package method;

public class Inheritancepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Empl obj1=new Empl();
		obj1.name="Ammu";
		obj1.address="abc house, kochi";
		obj1.age=23;
		obj1.phoneno=1234567890;
		obj1.printdetails();
		System.out.println (obj1.specialization= "Specialization is tester\n");
		
		
		Manager obj2=new Manager();
		obj2.name="Anu";
		obj2.address="abcde house, kochi";
		obj2.age=23;
		obj2.phoneno=1134567890;
		obj2.printdetails();
		System.out.println (obj2.department=" department is testing");
		
		

	}

}


class Member
{
	
	
	int age, phoneno,salary;
	String name, address;
	
	
	public void printdetails()
	{
		
		
	System.out.println("Name is "+name+ "\nage is "+age +"\naddress is "+address +"\nphno is "+phoneno);	
		
	}
	
	
	
}



class Empl extends Member
{

	
	String specialization ;
	
}


class Manager extends Member
{
	
	String department;
}




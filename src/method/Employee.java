package method;

public class Employee {
	
	
	int empid;
	String empname;
	
	
	
	
	public Employee(int empid, String empname )
	{
		
		this.empid=empid;
		this.empname=empname;
		
		
	}
	
	
	public void display()
	
	{
		
		System.out.println( "empid= "+ empid);
		System.out.println( "empname= "+ empname);

	}
	
	
	
	

	public static void main(String[] args) 
	
	{

		Employee obj=new Employee(10, "Kavya");
		
		obj.display();
		
		
	}
	
	
	
	
	
	
		
	

}

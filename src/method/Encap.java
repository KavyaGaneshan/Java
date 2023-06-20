package method;

class Emp{
	
	
	private String empname;
	private String empdesignation; ////set variables as private to achieve encapsulation
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) { // define setter and getter from 'source' to assign values
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	
}




public class Encap {

	public static void main(String[] args) {
		
    Emp ob= new Emp();
    ob.setEmpname("Arun");    //assigning values using setter
    ob.setEmpdesignation("developer");		

	System.out.println(ob.getEmpname());   ///display values using getter
	
	System.out.println(ob.getEmpdesignation());

	
	}

}

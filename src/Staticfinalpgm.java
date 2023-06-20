
public class Staticfinalpgm {
	
	
	String name="sarath";
	
	static String companyname="Luminar";  // not dependent on object, values can be updated.
	
	static final double pi=3.14;  //object dependent , values cannot change 
	//(can make object independent by adding 'static final')
	
	
	

	public static void main(String[] args) {
		
		
		Staticfinalpgm obj=new Staticfinalpgm();
		System.out.println(companyname);
		
		//System.out.println(obj.pi); object dependent
		
		System.out.println(pi); // object independent
		
		System.out.println(companyname="luminar technolab");
		
		

	}

}

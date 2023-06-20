package stringclass;

public class Stringsamplepgms {

	public static void main(String[] args) {

		//question-1
		String s="jmeter";
		String s1=" perfomance testing tool";
		
		System.out.println(s.concat(s1));
		
		
		
		//Question=2
		
		String s3="java language is platform dependent";
		
		if(s3.contains("language"))
		{
			
			System.out.println("\nWord language is present in the given string");
			
		}
		else
			
		{
			
			System.out.println("\n Word language is not present in the given string");

		}
			
		
	}

}

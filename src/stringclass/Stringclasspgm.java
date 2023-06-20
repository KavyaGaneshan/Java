package stringclass;

public class Stringclasspgm {

	public static void main(String[] args) 
	
	
	{
//Concatenation
		
	String s="Hello";
	String s1="   Welcome";
	String s3="hello how are you";
	//System.out.println(s+s1);
	System.out.println(s.concat(s1));//HelloWelcome
	System.out.println(1+3+s+6+4);  //output=4Hello64
		
		
	//equals
	
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1)); //ignore case difference
	
	//contains
	
	System.out.println(s3.contains("how"));
		
	
	//touppercase and tolowercase
	
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	
	//trim
	
	System.out.println(s1.trim());
	
	
	//length
	
	System.out.println(s.length());
	
	
	
	//startwith
	
	System.out.println(s3.startsWith("hello"));
		
		
    
	// endswith
	
	System.out.println(s3.endsWith("you"));
	
	//substring
	
	
	
	System.out.println(s.substring(2,5));
	
	
	//charAt
	
	System.out.println(s.concat(s1));
	
	
	//split
	
	String sr[]=s3.split(" ");
	
	for(String v:sr)
		
	{
		
		
		System.out.println(v);
	}
	
	
	
	
	}

}

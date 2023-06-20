package method;

public class Stringpalindrome {

	public static void main(String[] args) {

		
	String s="malayalam", reverse = "";
	
	int n=s.length();
	
	
	
	for(int i=n-1;i>=0;i--)
	{
		
	reverse=reverse+s.charAt(i)	;
		
	}
		
	if(s.equals(reverse)) {
		
		System.out.println("palindrome");
		
	}
	
	else {
		
		System.out.println("not palindrome");

	}
		
		
	}

}

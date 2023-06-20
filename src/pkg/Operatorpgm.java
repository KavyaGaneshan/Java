package pkg;

public class Operatorpgm {

	public static void main(String[] args) {

		
	 //Arithmetic operators
		
		int a= 100, b =40;
		
		System.out.println("a+b ="+(a+b));
		System.out.println("a-b ="+(a-b));
		System.out.println("a*b ="+(a*b));
		System.out.println("a/b ="+(a/b));
		System.out.println("a%b ="+(a%b));
		
		
		
		//Assignment operators
		
		System.out.println("a+="+(a+=b));// a=a+b
		System.out.println("a-="+(a-=b));// a=a-b
		
		
		//Relational operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);

		//logical operators
		
		String username = "abc";
		String pswd ="123";
		System.out.println(username=="abc" && pswd=="123");// and
		System.out.println(username=="abc" || pswd=="123");//or
		System.out.println(username=="abc" || pswd=="1234");// satisfies 1 condition, hence true
		System.out.println(!(username=="abc" ));// not equals
		
		
		//unary operator
		
		int n=2;
		System.out.println(n++);// first print 'n', then add 1
		System.out.println(n); // print incremented value of n by 1


				
		




				


		
		
		
		
	}

}

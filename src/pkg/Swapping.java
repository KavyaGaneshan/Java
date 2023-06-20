package pkg;

public class Swapping {

	public static void main(String[] args) {
	
		
		
		// program to swap 2 numbers
		
		int i=50, j=10, k;
		 k=i;
		 i=j;
		 j=k;
			
		 System.out.println("swaped values of i and j are"+' ' +i+' '+j);

		
		
		// without using 3rd variable
		
		 
		int a=50, b=10 ;
		 
		a=a+b;
		b=a-b;
		a=a-b;
				
		
		
		System.out.println("swaped values of i and j are"+' ' +a+' '+b);
	}

}

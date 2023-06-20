package controlstatements;

public class Count {

	public static void main(String[] args) {

		int  i=0, n=34567;
		
		while(n>0)
			
		{
		
		n=n/10;
		i++;
		}
		
		System.out.println("Number of digits: " + i);
	}

}

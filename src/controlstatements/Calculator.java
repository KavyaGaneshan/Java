package controlstatements;

public class Calculator {

	public static void main(String[] args) {

		
		int a=20, b=10, opr=3;
		
		System.out.println("The choices are ");
		System.out.println(" 1.addition\n 2.subtraction\n 3.mutiplication\n 4.divisition\n ");
		
		switch(opr)
		{
		
	

		case 1: System.out.println("sum of numbers are "+(a+b));
		break;
		
		case 2: System.out.println("Difference between numbers are " +(a-b));
		break;
		
		case 3: System.out.println("product is "+(a*b));
		break;
		
		case 4: System.out.println(a/b);
		break;
		
		default:System.out.println("invalid choice");
		}
	}

}

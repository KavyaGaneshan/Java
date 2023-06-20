package oppspgm;

import java.util.Scanner;

public class Calwithscanner {

	public static void main(String[] args) {

		
int  opr;

double a, b;
		
		System.out.println("The choices are ");
		System.out.println(" \n 1.addition\n 2.subtraction\n 3.mutiplication\n 4.divisition\n ");
		
		System.out.println("eneter your choice");
		
		Scanner sc=new Scanner(System.in);
		opr = sc.nextInt();
		
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		
		double result=0;
		
		switch(opr)
		{
		
	

		case 1: result= a+b;
		break;
		
		case 2: result=a-b;
		break;
		
		case 3: result=a*b;
		break;
		
		case 4: if(b==0)
			
			{
			System.out.println("Not divisible by zero");
			}
		
		else
		{
		result=a/b;
			}
		
		break;
		
		default:System.out.println("invalid choice");
		
		}
		
		

		System.out.println("result = " +result);
		
	}

}

package oppspgm;

import java.util.Scanner;

public class Positiveandnegative {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		int num,
		
        countPositive = 0, 
        countNegative=0,
        countZero = 0;
        char choice;
        
        
          do
    {
        System.out.print("Enter the number ");
        num = sc.nextInt();
       

        if(num > 0)
        {
            countPositive++;
        }
        else if(num < 0)
        {
            countNegative++;
        }
       
        
        else 
        	
        {
        	
        	
            countZero++;
        }

        System.out.print("Do you want to continue y/n? ");
        choice = sc.next().charAt(0);

    }while(choice=='y' || choice == 'Y');

    System.out.println("Positive numbers: " + countPositive);
    System.out.println("Negative numbers: " + countNegative);
    System.out.println("Number of zeros: " + countZero);
}  
}


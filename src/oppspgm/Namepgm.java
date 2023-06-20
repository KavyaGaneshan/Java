package oppspgm;

import java.util.Scanner;

public class Namepgm {

	public static void main(String[] args) {

		
System.out.println("Enter your name");
		
		Scanner sc= new Scanner(System.in);
		
		String a = sc.nextLine();
		
		System.out.println ("My name is "+a+"\n");
		
		
		// program to read and display a character in a word
		
		System.out.println("Enter the word");

		
		char c= sc.next().charAt(0);
		
		System.out.println(c);
		
	}

}

package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section for instance variables.
	//Data members are always private.
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
			questions();
			questions();
			
	}
	
	private void questions()
	
	{
		System.out.println("Please type in your name");
		String myInput;
		myInput = inputScanner.nextLine();
		System.out.println("Hello there " + myInput + ", do you like plums?");
		System.out.println("Did you tpye more than one name?  I am sorry, please type your full name");
		String fullName = inputScanner.nextLine();
		inputScanner.nextLine();
		System.out.println("Your full name is:  " + fullName);
		System.out.println("My name is Java");
		System.out.println("How old are you?");
		int age = inputScanner.nextInt();
		System.out.println("You are " + age + " years old?  Cool");
	}
	
}

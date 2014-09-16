package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;
	private int numberOfQuestions;
	public Questions()
	{
		questionScanner = new Scanner(System.in);
		numberOfQuestions = 2;
	}
	
	public void start()
	{
		//askQuestions();
		askQuestionsGUI();
	}
	
	private void askQuestionsGUI()
	{
	
		String answerGUI = JOptionPane.showInputDialog("What is your name?"); 
		answerGUI = JOptionPane.showInputDialog("Hi," + answerGUI +". What is your favorite color?"); 
		answerGUI = JOptionPane.showInputDialog("Oh " + answerGUI + " That's a nice color " + "Do you have a favorite book? Yes or No" );
		if (answerGUI.equalsIgnoreCase ("Yes"))
		
		{
			answerGUI = JOptionPane.showInputDialog( " Oh really? What book is it? ");
			answerGUI = JOptionPane.showInputDialog( answerGUI + "?  I don't think I've read that one. What is it about? ");
			answerGUI = JOptionPane.showInputDialog( "That sounds interesting.  Do you think I should read it?  Yes or No?");
			if (answerGUI.equalsIgnoreCase ("Yes"))
			{
				answerGUI = JOptionPane.showInputDialog("Alright well I'm going to go find it right now. Goodbye!");
			}
			if(answerGUI.equalsIgnoreCase ("No"))
			{
				answerGUI = JOptionPane.showInputDialog("Why should I not read it if it is your favorite book? It's because you don't like me isn't it! SCREW YOU!");
			}
		}
		if(answerGUI.equalsIgnoreCase ("No"))
		{
			answerGUI = JOptionPane.showInputDialog( " Psh you suck I'm done talking to you");
		}
		
		
		
	}
	
	
	
	
	
	private void askQuestions()
	{
		System.out.println("What is your name?"); 
		String answer = questionScanner.nextLine();
		System.out.println("Why, hello there "  + answer +  ". How are you today?");
		answer = questionScanner.nextLine();
		System.out.println("You feel like " + answer  +" . uhh that's nice......quietly leaving the room"); 
		answer = questionScanner.nextLine();
		System.out.println("Why am I leaving? Just need some fresh air. Do you want to join me?");
		answer = questionScanner.nextLine();
		System.out.println("Are you sure you mean " + answer + "? Well alright then. Let's keep talking");
		answer = questionScanner.nextLine();
		System.out.println("Alright then. Do you have a family?");
		answer = questionScanner.nextLine();
		System.out.println("Oh? " + answer + ". Do you want to know a secret? Y or N?");
		answer = questionScanner.nextLine();
		if (answer.equalsIgnoreCase ("Y"))
		{
			System.out.println("I'm a magical unicorn here to make your dreams come true");
		}
		else
		{
			System.out.println("I'm your real Father");	
		}
		
	}
}

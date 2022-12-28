import java.util.Scanner;
import java.util.Random;


public class GuessingGame {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int guessNumber; 
		
		Random random = new Random();
		int randomNum = random.nextInt(10) + 1;
		
		
		System.out.println("Guess the random number between 1-10!");
		
	    guessNumber = input.nextInt();
		
	  while (guessNumber != randomNum) {
		  System.out.println("You are incorrect, please try again!");
		  guessNumber = input.nextInt();
	  }
		if (guessNumber == randomNum) {
			 System.out.println("You have chosen " + guessNumber + "!");
			 System.out.println("You are correct! The random number is " + randomNum + "!");}
			
		else { 		 System.out.println("You have chosen " + guessNumber + "!");
			}
	  
	
		input.close();
}}
	




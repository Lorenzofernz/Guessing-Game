import java.util.Scanner;
import java.util.Random;


public class GuessingGmae {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int guessNumber;

        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;

        boolean correct = false;


        System.out.println("Guess the random number!");

        guessNumber = input.nextInt();

        System.out.println("You have chosen " + guessNumber + "!");

        while (!correct) {

            System.out.println("Try Again!");
            guessNumber = input.nextInt();

            if (guessNumber == randomNum) {
                correct = true;
                System.out.println("You are correct!");
                System.out.println("The random number is " + randomNum + "!");
            } else if (guessNumber < randomNum) {
                System.out.println("Try a higher number!");
            } else if (guessNumber > randomNum) {
                System.out.println("Try a lower number!");
                {
                }
            }
        }
    }
}

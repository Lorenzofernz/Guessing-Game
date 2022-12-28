import java.util.Scanner;
import java.util.Random;


public class GuessingGmae {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int guessNumber;

        Random random = new Random();
        int randomNum = random.nextInt(100);

        boolean correct = false;


        System.out.println("Guess the random number!");

        guessNumber = input.nextInt();

        System.out.println("You have chosen " + guessNumber + "!");

        while (!correct) {

            System.out.println("TRY AGAIN!: ");
            guessNumber = input.nextInt();

            if (guessNumber == randomNum) {
                correct = true;
                System.out.println("You are correct!");
                System.out.println("The random number is " + randomNum + "!");
            } else if (guessNumber < randomNum) {
                System.out.println("HIGHER");
            } else if (guessNumber > randomNum) {
                System.out.println("LOWER");
                {
                }
            }
        }
    }
}

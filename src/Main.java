import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        System.out.println("Guess a number between 0 and 9");

        int i = 0;
        while (i < 5) {
            int guessedNumber = input.nextInt();
            if (guessedNumber == randomNumber) {
                
                System.out.println("Correct! You guessed the number correctly!");
                break;
            } else {
                System.out.println("Wrong guess! Try again!");
            }
            i++;
        }

    }

}
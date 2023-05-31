import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int guess;
        int random;
        int play;
        int attempts;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        random = rand.nextInt(100) + 1;

        System.out.println("Enter the number of attempts you want:");
        attempts = sc.nextInt();
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            try {
                guess = sc.nextInt();
                if (guess == random || i == attempts) {
                    if (guess == random) {
                        System.out.println("You made it!!!");
                    } else {
                        System.out.println("Sorry you ran out of attempts :(");
                    }
                    System.out.println("1: Play again. \n2: Don't play again.");
                    play = sc.nextInt();
                    while (true) {
                        if (play == 1 || play == 2) {
                            break;
                        } else {
                            System.out.println("Choose a number that is valid.");
                        }
                    }
                    switch (play) {
                        case 1: {
                            i = 0;
                            random = rand.nextInt(100) + 1;
                            System.out.println("Yey! Enter the number of attempts you want: ");
                            attempts = sc.nextInt();
                            System.out.println("Guess a number between 1 and 100:");
                            break;
                        }
                        case 2: {
                            System.out.println("Ty for playing :)!");
                            System.exit(0);
                        }
                    }
                } else if (guess > random) {
                    System.out.println("The number is less than " + guess + " try again:");
                } else {
                    System.out.println("The number is greater than " + guess + " try again:");
                }
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }
    }
}

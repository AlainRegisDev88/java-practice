import java.util.Random;
import java.util.Scanner;

class RandomNumber{

    private int randomize(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        return randomNumber;
    }
     private int getNumber(){
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        return number;
     }

    public static void randomNumberGame(){
        System.out.println("Welcome to our guessing game:");
        System.out.println("I will set a number and you will guess until you get it!!:");
        System.out.println("I will tell you if the number is higher or lower than your guess");
        System.out.println("Aim for lower guesses");
        System.out.println("");
        System.out.print("Let's start, enter your guess: ");
    }
}

public class GuessingGame {

    public static void main(String[] args) {
        RandomNumber.randomNumberGame();
    }

}

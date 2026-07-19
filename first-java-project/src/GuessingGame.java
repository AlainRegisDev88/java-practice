import java.util.Random;
import java.util.Scanner;

class RandomNumber{
    static Scanner in = new Scanner(System.in);

    private static int randomize(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        return randomNumber;
    }
     private static int getNumber(){
        int number = Integer.parseInt(in.nextLine());
        return number;
     }

    public static void randomNumberGame(){
        System.out.println("Welcome to our guessing game:");
        System.out.println("I will set a number between 0-100 and you will guess until you get it!!:");
        System.out.println("I will tell you if the number is higher or lower than your guess");
        System.out.println("Aim for lower guesses");
        System.out.println("");
        System.out.print("Let's start, enter your guess: ");

        int guess;
        int randomNum = randomize();
        int giveUp = 1;
        int guesses = 0;

        do{
            if (guesses != 0) {
                System.out.print("Guess Again...: ");
            }
            guess = getNumber();

            if(guess == randomNum){
                System.out.println("Absolutely spot on!! 🥳🎉🎉🎉🎈");
                System.out.print("It took you " + guesses + " guesses");
                System.out.println(guesses > 5 ? " You can do better🥲": " That's impressive 😊");
            }

            else{
                System.out.println("That's not quite right");
                if(guesses == 0){
                    System.out.println("No pressure that was your first guess😊");
                }
                if(guesses >0 && guesses<=3){
                    System.out.println("Try again!!!");
                }

                if(guesses >3 && guesses<=7){
                    System.out.println("Come on bruv, lock in😊");
                }
                if(guesses == 7){
                    System.out.println("I've given up on you for real🥲");
                }

                if (randomNum > guess){
                    System.out.println("Your guess is lower than the number");
                }
                else{
                    System.out.println("Your guess is higher than the number");
                }

                System.out.print("Do you wanna go again or you gave up? press 0 to quit, 1 to keep guessing :): ");

                giveUp = Integer.parseInt(in.nextLine());
                
                guesses++;
            }
        }while(giveUp != 0);

        if (giveUp == 0){
            System.out.println("The number was: " + randomNum + ": you lost :(");
        }


    }
}

public class GuessingGame {

    public static void main(String[] args) {
        RandomNumber.randomNumberGame();
    }

}

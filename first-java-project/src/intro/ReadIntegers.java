package intro;

import java.util.Scanner;

public class ReadIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // using a while loop
        // Boolean valid = false;

        // System.out.print("Please enter a number between 1 and 10 inclusive...: ");

        // while(!valid){
        // int inputValue = Integer.parseInt(input.nextLine());
        // if(inputValue < 0){
        // System.out.println("The number "+ inputValue + " you entered is not between 0
        // and 10: Please try again!!!");
        // }else if(inputValue > 10){
        // System.out.println("The number should be less than 10: Try again!!!");
        // }else{
        // System.out.println("The number you entered is " + inputValue + " Thank
        // you!!!");
        // valid = true;
        // }
        // }

        // using a do while loop

        // int n;
        // do {
        //     System.out.println("Enter a number between 1 and 10: ");
        //     n = input.nextInt();
        // } while (n < 1 || n > 10);

        // System.out.println("The number "+ n + " is between 1 and 10");
        System.out.print("Enter your age to check your category: ");
        int age = Integer.parseInt(input.nextLine());


        /*
        TRADITIONAL SWITCH CASE
        */
        // switch (age){
        //     case 40:
        //         System.out.println("Age is 40");
        //         break;
        //     case 50:
        //     case 60:
        //     case 70:
        //         System.out.println("age is 50 or 60 or 70");
        //         break;
        //     default:
        //         System.out.println("We do not have that value!!!");
        // }


        /*
        
        enhanced switch cases
        
        */

        switch (age){
            case 40, 50, 60 -> 
                System.out.println("You are getting old");
            case 20, 30 -> 
                System.out.println("Young adult guy!!!");
            case 70, 80, 90 -> 
                System.out.println("Old man");
            default -> System.out.println("No Description for you bruv");

        }


        String name = "Regis";
        name = "Regis2";

        System.out.println(name);

        input.close();
        // do{
        // int inputValue = Integer.parseInt(input.nextLine())

        // }while (inputValue < 0 && inputValue > 10);
    }

}
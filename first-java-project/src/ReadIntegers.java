import java.util.Scanner;

public class ReadIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Boolean valid = false;

        System.out.print("Please enter a number between 1 and 10 inclusive...: ");

        while(!valid){
            int inputValue = Integer.parseInt(input.nextLine());
            if(inputValue < 0){
                System.out.println("The number "+ inputValue + " you entered is not between 0 and 10: Please try again!!!");
            }else if(inputValue > 10){
                System.out.println("The number should be less than 10: Try again!!!");
            }else{
                System.out.println("The number you entered is " + inputValue + " Thank you!!!");
                valid = true;
            }
        }
        input.close();
        // do{
        //     int inputValue = Integer.parseInt(input.nextLine())

        // }while (inputValue < 0 && inputValue > 10); 
    }

}
import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

class Adder {
    Scanner input = new Scanner(System.in);

    public int sumOfTwo() {
        int sum = 0;

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        sum = num1 + num2;

        return sum;
    }

}

class DegreeConverter {
    Scanner in = new Scanner(System.in);

    public double input() {

        double fahrDeg;
        double celsDeg;

        System.out.println("Enter F for farhenheit to celsius conversion and C otherwise: ");

        String res = in.nextLine();

        if (res.equalsIgnoreCase("f")) {
            System.out.println("Enter the fahrnheit temperature: ");
            fahrDeg = in.nextDouble();
            return fahrDeg;
        } else if (res.equalsIgnoreCase("c")) {
            System.out.println("Enter the celsius temperature: ");
            celsDeg = in.nextDouble();
            return celsDeg;
        }else{
            throw new IllegalArgumentException("Invalid input: please enter F or C");
        } 

    }

    private double fahrToCelc(double tempInFahr) {
        double tempInDeg;

        tempInDeg = (tempInFahr - 32) * (5 / 9);
        return tempInDeg;
    }
    
    private double celcToFahr(double tempInCels) {
        double tempInDeg;

        tempInDeg = (tempInCels - 32) * (5 / 9);
        return tempInDeg;
    }
}
}

public class App {

    public void pupAge() {
        int age = 0;
        age += 10;
        System.out.println(age);
    }

    {// COMMENTED THE FIRST MAIN METHOD FOR READABILITY
     // public static void main(String [] args) throws Exception {

        // // call the instance method pupAge

        // App obj = new App();

        // obj.pupAge();

        // System.out.println("Hello World");
        // int x = 5;
        // int y = 7;

        // int sum = x + y;
        // System.out.println(sum);

        // int total = 0;

        // for(int i = 0; i <5 ; i++){
        // total += 1;
        // }
        // System.out.println(total);

        // // testing the stack storage of the primitive variables

        // int a = 4;
        // int b = a;
        // b = 10;

        // int [] arr1 = {1, 2, 3};
        // int [] arr2 = arr1;

        // arr2 [0] = 100;

        // System.out.println('\n');
        // System.out.println(arr1[0]);

        // System.out.println('\n');
        // System.out.println(b);

        // // byte check

        // byte bi = 3;
        // System.out.println(bi);

        // // exercise 1

        // int result = 2 + 3 * 4;
        // System.out.println("Exercise 1: " + result);

        // // short-circuit evaluation

        // boolean r = true || 5 > 6;

        // System.out.println(r);

        // // increment operators

        // int m = 5;
        // int inc_res = m++ + ++m;

        // // the first increment affect the inc_res value but the second one doesn't,
        // it increment m after operation

        // System.out.println(inc_res);
        // }}

    }

    public static void main(String[] args) {

        Adder add = new Adder();

        int sum = add.sumOfTwo();

        System.out.println("The sum is: " + sum);
    }

}
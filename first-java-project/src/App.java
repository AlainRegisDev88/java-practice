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

    private double rounder(int decimalPlaces, double value) {
        double multiplier = Math.pow(10, decimalPlaces);
        double roundedValue = Math.round(value * multiplier) / multiplier;
        return roundedValue;
    }

    private double celsInput() {
        double celsDeg;
        System.out.println("Enter the celsius temperature: ");
        celsDeg = Double.parseDouble(in.nextLine());
        return celsDeg;
    }

    private double fahrInput() {
        double fahrDeg;
        System.out.println("Enter the fahrnheit temperature: ");
        fahrDeg = Double.parseDouble(in.nextLine());
        return fahrDeg;
    }

    private double fahrToCelc(double tempInFahr) {
        double tempInCels;

        tempInCels = (tempInFahr - 32) * (5.0 / 9);

        tempInCels = rounder(3, tempInCels);
        return tempInCels;
    }

    private double celsToFahr(double tempInCels) {
        double tempInFahr;

        tempInFahr = (tempInCels * (9.0 / 5)) + 32;

        tempInFahr = rounder(5, tempInFahr);
        return tempInFahr;
    }

    public void convertFunction() {
        // input
        System.out.println("Enter F for farhenheit to celsius conversion and C otherwise: ");

        String res = in.nextLine();

        if (res.equalsIgnoreCase("f")) {
            double fahrValue = fahrInput();
            double celsConversion = fahrToCelc(fahrValue);
            System.out.println(fahrValue + " in celsius is: " + celsConversion);

        } else if (res.equalsIgnoreCase("c")) {
            double celsValue = celsInput();
            double fahrConvesion = celsToFahr(celsValue);
            System.out.println(celsValue + " in Fahrenheit is: " + fahrConvesion);

        } else {
            throw new IllegalArgumentException("Invalid input: please enter F or C");
        }

    }

}

class SwappInPlace {
    public static void swapper(int[] arr, int i, int j) {
        arr[1] = j;
        arr[2] = i;
        for (int m = 0; m <= 2; m++) {
            System.out.println(arr[m]);
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

        // adder func
        // Adder add = new Adder();

        // int sum = add.sumOfTwo();

        // System.out.println("The sum is: " + sum);

        DegreeConverter converter = new DegreeConverter();

        converter.convertFunction();

        int[] arr = { 10, 20, 30 };
        int i = 20;
        int j = 30;
        SwappInPlace.swapper(arr, i, j);
    }

}
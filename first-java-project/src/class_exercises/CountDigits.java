package class_exercises;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int countFor = 0;
        int countWhile = 0;
        String digits = "0123456789";
        char currentChar;
        String current;

        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);
            current = String.valueOf(currentChar); // convert the char to string to be able to use it with .contains()
            if (digits.contains(current)) {
                countFor++;
            }
        }

        int j = str.length() - 1;
        while (j >= 0) {
            if(digits.contains(String.valueOf(str.charAt(j)))){
                countWhile++;
            }
            j = j -1;
        }

        System.out.println(countFor);
        System.out.println(countWhile);

        in.close();
    }
}

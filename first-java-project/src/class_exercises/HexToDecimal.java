package class_exercises;

import java.util.Scanner;
public class HexToDecimal {
    private String hexValue;
    private int decimalValue;

    Scanner input = new Scanner(System.in);
    public void getHex() {
        this.hexValue = input.nextLine();
    }

    public int convertHexToDecimal(){
        int currentChar;        
        for (int i = 0; i < this.hexValue.length(); i++){
            currentChar = hexValue.charAt(i);
            currentChar = switch(currentChar){
                case 'A', 'a' -> 10;
                case 'B', 'b' -> 11;
                case 'C', 'c' -> 12;
                case 'D', 'd' -> 13;
                case 'E', 'e' -> 14;
                case 'F', 'f' -> 15;
                default -> currentChar - '0';
            };
            

            decimalValue += currentChar * (Math.pow(16, (hexValue.length() - 1 - i)));    
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        HexToDecimal obj = new HexToDecimal();
        obj.getHex();
        int value = obj.convertHexToDecimal();
        System.out.println(value);

    }
}

import java.util.Scanner;

class MonthGuesser{
    Scanner in = new Scanner(System.in);
    public static void guessMonth(int number){
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break; 
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;   
        
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
    

    public static String guessDayModern(int number){
        String day = switch (number){
            case 1 -> ("Montag");
            case 2 -> ("Dienstag");
            case 3 -> ("Mittwoch");
            case 4 -> ("Donnerstag");
            case 5 -> ("Freitag");
            case 6 -> ("Samstag");
            case 7 -> ("Sonntag");
            default ->("Perhaps wrong input");

        };
        return (day);
    }
}

public class ConditionalStatements {

    public static void main(String[] args){
        MonthGuesser.guessMonth(3);
        String Day = MonthGuesser.guessDayModern(7);
        System.out.println(Day);
    }
}

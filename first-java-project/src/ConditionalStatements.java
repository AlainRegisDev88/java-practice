import java.util.Scanner;

class MonthGuesser{
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

class LabeledIf {
    public static void firstProductGreaterThan45(){
        outer:
        for (int i = 0; i <= 20; i++){
            for (int j = 0; j <= i; j++){
                if( (i*j) > 45){
                    System.out.println("The values were:" + i + " and " + j);
                    break outer;
                }
            }
        }
    }
}


public class ConditionalStatements {
    
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        MonthGuesser.guessMonth(3);
        String Day = MonthGuesser.guessDayModern(7);
        System.out.println(Day);

        // ternary operator
        System.out.println("Enter the score between 0 aand 100: ");
        float score = Float.parseFloat(in.nextLine());
        System.out.println(score>=50 ? "Pass": "Fail");

        // break outer

        LabeledIf.firstProductGreaterThan45();

        // do...while

        int choice;
        do{
            System.out.println("Enter one to play and zero to quit: ");
            choice = Integer.parseInt(in.nextLine());

        }while(choice != 0);

        in.close();

    }
}
